package com.luizfelipe.one_project.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Instant timestamp;
	private Integer status;
	private String erro;
	private String messege;
	private String path;
	
	public StandardError() {
	
	}

	public StandardError(Instant timestamp, Integer status, String erro, String messege, String path) {
		this.timestamp = timestamp;
		this.status = status;
		this.erro = erro;
		this.messege = messege;
		this.path = path;
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
