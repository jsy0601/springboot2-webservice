package com.jsy.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
}
/*
@Target(ElementType.PARAMETER) : 이 어노테이션이 생성될 수 있는 위치를 지정한다. PARAMETER로 지정했기 때문에,
                                 메소드의 파라미터로 선언된 객체에만 사용할 수 있다.
@interface : 이 파일을 어노테이션 클래스로 지정한다.
 */