/**
 * 
 */
package com.hhit.basetrain.entity;

/**
 * @author Jiya
 * @date 2016-4-18t����03:08:35 ʵѵѧ��ʵ����
 */
public class TrainStudent {

	/** ѧ�� */
	private String stuno;
	/** ���� */
	private String stu_name;
	/** �Ա� */
	private String stu_sex;
	/** �༶ */
	private String stu_class;
	/** רҵ */
	private String marjor;
	/** ��ϵ��ʽ */
	private String phone;
	/** ��ѧ��� */
	private Integer enter_year;
	/** �������� */
	private String birthday;
	/** ��ͥסַ */
	private String address;
	/** ���ر�� */
	private Integer base_no;
	/** ʵѵ�༶ */
	private String base_class;
	/** �γ̺� */
	private String cno;
	/** ʵѵ���� */
	private String train_date;

	public String getStuno() {
		return stuno;
	}

	public void setStuno(String stuno) {
		this.stuno = stuno;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stuName) {
		stu_name = stuName;
	}

	public String getStu_sex() {
		return stu_sex;
	}

	public void setStu_sex(String stuSex) {
		stu_sex = stuSex;
	}

	public String getStu_class() {
		return stu_class;
	}

	public void setStu_class(String stuClass) {
		stu_class = stuClass;
	}

	public String getMarjor() {
		return marjor;
	}

	public void setMarjor(String marjor) {
		this.marjor = marjor;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getEnter_year() {
		return enter_year;
	}

	public void setEnter_year(Integer enterYear) {
		enter_year = enterYear;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getBase_no() {
		return base_no;
	}

	public void setBase_no(Integer baseNo) {
		base_no = baseNo;
	}

	public String getBase_class() {
		return base_class;
	}

	public void setBase_class(String baseClass) {
		base_class = baseClass;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getTrain_date() {
		return train_date;
	}

	public void setTrain_date(String trainDate) {
		train_date = trainDate;
	}

	@Override
	public String toString() {
		return "TrainStudent [address=" + address + ", base_class="
				+ base_class + ", base_no=" + base_no + ", birthday="
				+ birthday + ", cno=" + cno + ", enter_year=" + enter_year
				+ ", marjor=" + marjor + ", phone=" + phone + ", stu_class="
				+ stu_class + ", stu_name=" + stu_name + ", stu_sex=" + stu_sex
				+ ", stuno=" + stuno + ", train_date=" + train_date + "]";
	}

}
