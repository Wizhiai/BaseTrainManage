/**
 * 
 */
package com.hhit.basetrain.entity;

import java.io.Serializable;

/**
 * @author Jiya
 * @date 2016-4-17t����01:57:48
 * ���ؽ��ʵ����
 */
public class Result implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** ���ؽ��״̬*/
	private int status;
	/** ������Ϣ*/
	private String msg;
	/** ��������*/
	private Object data;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [data=" + data + ", msg=" + msg + ", status=" + status
				+ "]";
	}
}
