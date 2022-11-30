package com.alv.dto;

public class Country {
	private static int consecutivo;
	private String code;
    private String name;
    private String url;
    private int valor;

    public Country(String code, String name, String url) {
        this.code = code;
        this.name = name;
        this.url = url;
        valor = consecutivo;
        consecutivo++;
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
    
}
