package life.majiang.community.dto;

import life.majiang.community.exception.CustomizeErrorCode;
import life.majiang.community.exception.CustomizeException;
import lombok.Data;

@Data
public class ResultDTO<T> {
    private Integer code;
    private String message;
    private T data;

    public ResultDTO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResultDTO errOf(Integer code, String message) {
        return new ResultDTO(code, message);
    }

    public static ResultDTO errOf(CustomizeErrorCode errorCode) {
        return errOf(errorCode.getCode(),errorCode.getMessage());
    }

    public static ResultDTO errOf(CustomizeException e) {
        return errOf(e.getCode(),e.getMessage());
    }

    public static ResultDTO okOf() {
        return new ResultDTO(200,"请求成功");
    }

    public static <T> ResultDTO okOf(T t) {
        ResultDTO resultDTO = new ResultDTO(200, "请求成功");
        resultDTO.setData(t);
        return resultDTO;
    }

}
