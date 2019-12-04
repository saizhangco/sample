package com.kenny.java.copyobject;

import lombok.Data;
import lombok.ToString;

/**
 * @Author : saizhang
 * @Date : 2019/12/04
 * @Time : 22:18
 * @Description : TODO
 */
@Data
@ToString
public class MyObject implements Cloneable {
    private Integer aaa;
    private String bbb;
    private int ccc;
    private char ddd;
    private MyRef ref;

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
