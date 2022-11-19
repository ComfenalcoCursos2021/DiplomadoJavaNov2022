package com.alv.main;

import com.alv.dto.A;
import com.alv.dto.AwithX;
import com.alv.dto.AwithXY;
import com.alv.dto.AwithXYZ;

public class DecoratorDemo {
	public static void main(String[] args) {
        A[] array = {new AwithX(), new AwithXY(), new AwithXYZ()};
        for (A a : array) {
            a.doIt();
            System.out.println("  ");
        }
    }
}
