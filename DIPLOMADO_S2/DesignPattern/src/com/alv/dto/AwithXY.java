package com.alv.dto;

public class AwithXY extends AwithX {
	private aWithY obj = new aWithY();
    public void doIt() {
        super.doIt();
        obj.doY();
    }
}
