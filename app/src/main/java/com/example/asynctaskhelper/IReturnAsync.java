package com.example.asynctaskhelper;

public interface IReturnAsync<T> {
    /**
     * callback used on ReturnExecutor, after processing the data.
     * @return - any datatype
     */
    T getValue();
}
