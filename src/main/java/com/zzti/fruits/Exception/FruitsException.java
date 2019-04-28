package com.zzti.fruits.Exception;

/*========================================================================= 
Copyright (C), 2015-2019, 中原工学院
description: 自定义异常
author: wangbaoqin
Date:2019/4/27  20:38 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/27 
encoding: UTF-8
version: 1.0
=========================================================================*/

import com.zzti.fruits.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FruitsException extends RuntimeException{
    private ExceptionEnum exceptionEnum;

    //  throw new  FruitsException(ExceptionEnum.CATEGORY_NOT_FOUND);
}
