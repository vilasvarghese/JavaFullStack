package com.vilas.java8_tutorial.ch12;

import java.lang.annotation.*;

/*
 * Steps to define repeatable annotation.
 * 
 * 1. Define an annotation (say CreateVm) with @Repeatable annotation.
 * 
 * 2. Define another anootation which has an array earlier annotation (CreateVm[])
 * 
 */


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(CreateVms.class)
public @interface CreateVm {
    String name();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CreateVms {
    CreateVm[] value();
}