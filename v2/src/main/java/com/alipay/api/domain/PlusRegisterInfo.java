package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加号扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-06-25 15:02:50
 */
public class PlusRegisterInfo extends AlipayObject {

	private static final long serialVersionUID = 1137891868586987772L;

	/**
	 * 地址描述
	 */
	@ApiField("write_off_address")
	private String writeOffAddress;

	/**
	 * 用于生成核销二维码
	 */
	@ApiField("write_off_code")
	private String writeOffCode;

	/**
	 * 医生名称
	 */
	@ApiField("write_off_doctor")
	private String writeOffDoctor;

	/**
	 * 科室名称
	 */
	@ApiField("write_off_section")
	private String writeOffSection;

	/**
	 * 核销状态，传值参照枚举定义
	 */
	@ApiField("write_off_status")
	private String writeOffStatus;

	/**
	 * 时间格式参照示例
	 */
	@ApiField("write_off_time")
	private String writeOffTime;

	public String getWriteOffAddress() {
		return this.writeOffAddress;
	}
	public void setWriteOffAddress(String writeOffAddress) {
		this.writeOffAddress = writeOffAddress;
	}

	public String getWriteOffCode() {
		return this.writeOffCode;
	}
	public void setWriteOffCode(String writeOffCode) {
		this.writeOffCode = writeOffCode;
	}

	public String getWriteOffDoctor() {
		return this.writeOffDoctor;
	}
	public void setWriteOffDoctor(String writeOffDoctor) {
		this.writeOffDoctor = writeOffDoctor;
	}

	public String getWriteOffSection() {
		return this.writeOffSection;
	}
	public void setWriteOffSection(String writeOffSection) {
		this.writeOffSection = writeOffSection;
	}

	public String getWriteOffStatus() {
		return this.writeOffStatus;
	}
	public void setWriteOffStatus(String writeOffStatus) {
		this.writeOffStatus = writeOffStatus;
	}

	public String getWriteOffTime() {
		return this.writeOffTime;
	}
	public void setWriteOffTime(String writeOffTime) {
		this.writeOffTime = writeOffTime;
	}

}
