package com.basic.factorypattern.abstractfactory.model;

import com.basic.factorypattern.abstractfactory.inteface.Boy;

/**
 * locate com.basic.factorypattern.abstractfactory.inteface
 * Created by 79875 on 2017/10/19.
 */
public class MCBoy implements Boy {
    @Override
    public void drawMan() {
        System.out.println("------------------圣诞系列的男孩子--------------");
    }
}
