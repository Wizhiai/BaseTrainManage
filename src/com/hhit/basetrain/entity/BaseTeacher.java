/**
 * 
 */
package com.hhit.basetrain.entity;

/**
 * @author Jiya
 * @date 2016-4-18t����02:31:51
 *  ���ؽ�ʦʵ����
 */
public class BaseTeacher {

	/** ְ���� */
	private String t_no;
	/** ���� */
	private String t_name;
	/** �Ա� */
	private String t_sex;
	/** ��ϵ��ʽ */
	private String t_phone;
	/** ���غ� */
	private Integer base_no;
	/** ְ�� */
	private String t_profession;

	public String getT_no() {
		return t_no;
	}

	public void setT_no(String tNo) {
		t_no = tNo;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String tName) {
		t_name = tName;
	}

	public String getT_sex() {
		return t_sex;
	}

	public void setT_sex(String tSex) {
		t_sex = tSex;
	}

	public String getT_phone() {
		return t_phone;
	}

	public void setT_phone(String tPhone) {
		t_phone = tPhone;
	}

	public Integer getBase_no() {
		return base_no;
	}

	public void setBase_no(Integer baseNo) {
		base_no = baseNo;
	}

	public String getT_profession() {
		return t_profession;
	}

	public void setT_profession(String tProfession) {
		t_profession = tProfession;
	}

	@Override
	public String toString() {
		return "BaseTeacher [base_no=" + base_no + ", t_name=" + t_name
				+ ", t_no=" + t_no + ", t_phone=" + t_phone + ", t_profession="
				+ t_profession + ", t_sex=" + t_sex + "]";
	}

}
