package com.imooc.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class ResultVO<T>  implements Serializable{


    /** 错误码 */
    private  Integer code;
    /** 提示信息*/
   private  String msg;
    /** 具体内容 */
   private  T  data;

}
