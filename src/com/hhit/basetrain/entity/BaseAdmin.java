/**
 * 
 */
package com.hhit.basetrain.entity;

/**
 * @author Jiya
 * @date 2016-4-18t����02:22:48
 *  ���ع���Աʵ����
 */
public class BaseAdmin {

	/** ְ���� */
	private String manager_no;
	/** ���� */
	private String manager_name;
	/** ��ϵ��ʽ */
	private String manager_phone;

	public String getManager_no() {
		return manager_no;
	}

	public void setManager_no(String managerNo) {
		manager_no = managerNo;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String managerName) {
		manager_name = managerName;
	}

	public String getManager_phone() {
		return manager_phone;
	}

	public void setManager_phone(String managerPhone) {
		manager_phone = managerPhone;
	}

	@Override
	public String toString() {
		return "BaseAdmin [manager_name=" + manager_name + ", manager_no="
				+ manager_no + ", manager_phone=" + manager_phone + "]";
	}

}
