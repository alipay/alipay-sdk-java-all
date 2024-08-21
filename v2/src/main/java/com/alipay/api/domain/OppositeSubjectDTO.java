package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对方信息
 *
 * @author auto create
 * @since 1.0, 2023-03-21 20:43:56
 */
public class OppositeSubjectDTO extends AlipayObject {

	private static final long serialVersionUID = 4389743254883184695L;

	/**
	 * 对方信息备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 对方联系地址
	 */
	@ApiField("opposite_contact_addr")
	private String oppositeContactAddr;

	/**
	 * 对方联系邮箱
	 */
	@ApiField("opposite_contact_email")
	private String oppositeContactEmail;

	/**
	 * 对方联系人姓名
	 */
	@ApiField("opposite_contact_name")
	private String oppositeContactName;

	/**
	 * 对方联系电话
	 */
	@ApiField("opposite_contact_phone")
	private String oppositeContactPhone;

	/**
	 * 对方公司名称
	 */
	@ApiField("opposite_subject_name")
	private String oppositeSubjectName;

	/**
	 * 对方Uscc
	 */
	@ApiField("opposite_uscc")
	private String oppositeUscc;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOppositeContactAddr() {
		return this.oppositeContactAddr;
	}
	public void setOppositeContactAddr(String oppositeContactAddr) {
		this.oppositeContactAddr = oppositeContactAddr;
	}

	public String getOppositeContactEmail() {
		return this.oppositeContactEmail;
	}
	public void setOppositeContactEmail(String oppositeContactEmail) {
		this.oppositeContactEmail = oppositeContactEmail;
	}

	public String getOppositeContactName() {
		return this.oppositeContactName;
	}
	public void setOppositeContactName(String oppositeContactName) {
		this.oppositeContactName = oppositeContactName;
	}

	public String getOppositeContactPhone() {
		return this.oppositeContactPhone;
	}
	public void setOppositeContactPhone(String oppositeContactPhone) {
		this.oppositeContactPhone = oppositeContactPhone;
	}

	public String getOppositeSubjectName() {
		return this.oppositeSubjectName;
	}
	public void setOppositeSubjectName(String oppositeSubjectName) {
		this.oppositeSubjectName = oppositeSubjectName;
	}

	public String getOppositeUscc() {
		return this.oppositeUscc;
	}
	public void setOppositeUscc(String oppositeUscc) {
		this.oppositeUscc = oppositeUscc;
	}

}
