package io.githup.amrjlg.resposne;


/**
 * obje
 * <p>
 * 2021/3/4
 *
 * @author jiang
 **/
public interface Success<T> extends Result<T> {
    @Override
    default boolean isSuccess() {
        return true;
    }

    @Override
    default String getMsg() {
        return "SUCCESS";
    }


    static <T> Success<T> ok(T data) {
        return () -> data;
    }

    static <T> Success<T> ok() {
        return () -> null;
    }

}
