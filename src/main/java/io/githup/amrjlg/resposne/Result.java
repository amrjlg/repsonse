package io.githup.amrjlg.resposne;

/**
 * simple generic result
 * <p>
 * 2021/3/4
 *
 * @author jiang
 **/
public interface Result<T> {

    boolean isSuccess();

    String getMsg();

    T getData();
}
