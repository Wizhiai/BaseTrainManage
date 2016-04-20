/**
 * 
 */
package com.hhit.basetrain.entity;

/**
 * @author Jiya
 * @date 2016-4-18t����02:41:45 
 * ����ʵ����
 */
public class Placard {

	/** ������ */
	private Integer placard_no;
	/** ������� */
	private String placard_type;
	/** ������� */
	private String placard_title;
	/** �������� */
	private String placard_content;
	/** ���淢��ʱ�� */
	private String publish_time;
	/** ���淢������ */
	private String publish_author;

	public Integer getPlacard_no() {
		return placard_no;
	}

	public void setPlacard_no(Integer placardNo) {
		placard_no = placardNo;
	}

	public String getPlacard_type() {
		return placard_type;
	}

	public void setPlacard_type(String placardType) {
		placard_type = placardType;
	}

	public String getPlacard_title() {
		return placard_title;
	}

	public void setPlacard_title(String placardTitle) {
		placard_title = placardTitle;
	}

	public String getPlacard_content() {
		return placard_content;
	}

	public void setPlacard_content(String placardContent) {
		placard_content = placardContent;
	}

	public String getPublish_time() {
		return publish_time;
	}

	public void setPublish_time(String publishTime) {
		publish_time = publishTime;
	}

	public String getPublish_author() {
		return publish_author;
	}

	public void setPublish_author(String publishAuthor) {
		publish_author = publishAuthor;
	}

	@Override
	public String toString() {
		return "Placard [placard_content=" + placard_content + ", placard_no="
				+ placard_no + ", placard_title=" + placard_title
				+ ", placard_type=" + placard_type + ", publish_author="
				+ publish_author + ", publish_time=" + publish_time + "]";
	}

}
