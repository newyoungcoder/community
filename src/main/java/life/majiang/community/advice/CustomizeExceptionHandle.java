package life.majiang.community.advice;

import life.majiang.community.dto.ResultDTO;
import life.majiang.community.exception.CustomizeErrorCode;
import life.majiang.community.exception.CustomizeException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class CustomizeExceptionHandle {

    //使用@ResponseBody，方法返回值为Object，返回json数据时，直接return即可
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Object handleControllerException(Throwable e, Model model,
                                                  HttpServletRequest request,
                                                  HttpServletResponse response) {
        if ("application/json".equals(request.getContentType())) {
            if (e instanceof CustomizeException) {
                return ResultDTO.errOf((CustomizeException)e);
            }else {
                return ResultDTO.errOf(CustomizeErrorCode.SYS_ERROR);
            }
        } else {
            if (e instanceof CustomizeException) {
                model.addAttribute("message", e.getMessage());
            } else {
                model.addAttribute("message", CustomizeErrorCode.SYS_ERROR.getMessage());
            }
            return new ModelAndView("error");
        }
    }

    /*
    //方法返回值为ModelAndView，返回json数据时，使用response.setContentType("application/json")返回
    @ExceptionHandler(Exception.class)
    public ModelAndView handleControllerException(Throwable e, Model model,
                                                  HttpServletRequest request,
                                                  HttpServletResponse response) {
        if ("application/json".equals(request.getContentType())) {
            ResultDTO resultDTO;
            if (e instanceof CustomizeException) {
                resultDTO = ResultDTO.errOf((CustomizeException)e);
            }else {
                resultDTO = ResultDTO.errOf(CustomizeErrorCode.SYS_ERROR);
            }
            try {
                response.setContentType("application/json");
                response.setStatus(200);
                response.setCharacterEncoding("utf-8");
                PrintWriter writer = response.getWriter();
                writer.write(JSON.toJSONString(resultDTO));
                writer.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            return null;
        } else {
            if (e instanceof CustomizeException) {
                model.addAttribute("message", e.getMessage());
            } else {
                model.addAttribute("message", CustomizeErrorCode.SYS_ERROR.getMessage());
            }
            return new ModelAndView("error");
        }
    }*/
}
