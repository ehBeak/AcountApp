package com.connect.accountApp.global.common.adapter.in.web.response;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class SuccessResponse<T> {

  public static final String SUCCESS_MESSAGE = "Success";

  private String message;
  private int status;
  private T data;


  public static <T> SuccessResponse create200SuccessResponse(T data) {

    return new SuccessResponse(SUCCESS_MESSAGE, 200, data);
  }
}
