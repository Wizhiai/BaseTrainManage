/**
 * 
 */
package com.hhit.basetrain.entity;

/**
 * @author Jiya
 * @date 2016-4-18t����02:59:06
 *  ʵѵ�γ�ʵ����
 */
public class TrainCourse {

	/** �γ̺� */
	private String cno;
	/** ���غ� */
	private Integer base_no;
	/** �γ��� */
	private String cname;
	/** ���� */
	private Integer cost;
	/** ����ʱ�� */
	private Integer term;

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public Integer getBase_no() {
		return base_no;
	}

	public void setBase_no(Integer baseNo) {
		base_no = baseNo;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	@Override
	public String toString() {
		return "TrainCourse [base_no=" + base_no + ", cname=" + cname
				+ ", cno=" + cno + ", cost=" + cost + ", term=" + term + "]";
	}

}
