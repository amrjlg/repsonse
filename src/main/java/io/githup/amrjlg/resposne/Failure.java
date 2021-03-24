package io.githup.amrjlg.resposne;

/**
 * failure
 * <p>
 * 2021/3/4
 *
 * @author jiang
 **/
public interface Failure<T> extends Result<T> {
    @Override
    default boolean isSuccess() {
        return false;
    }

    @Override
    default T getData() {
        return null;
    }

    @Override
    String getMsg();


    static <T> Failure<T> msg(String msg) {
        return () -> msg;
    }
}
