package com.demo.employee.model;

public class BaseRespon<T> {
    public int status = 1;
    public String message = "success";
    public T data;
}
