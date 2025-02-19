package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加号扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-11-14 15:17:07
 */
public class PlatformPlusRegisterInfo extends AlipayObject {

	private static final long serialVersionUID = 8145395827396938877L;

	/**
	 * 核销地址
	 */
	@ApiField("write_off_address")
	private String writeOffAddress;

	/**
	 * 核销码
	 */
	@ApiField("write_off_code")
	private String writeOffCode;

	/**
	 * 核销医生
	 */
	@ApiField("write_off_doctor")
	private String writeOffDoctor;

	/**
	 * 核销科室
	 */
	@ApiField("write_off_section")
	private String writeOffSection;

	/**
	 * 枚举值：
核销成功:SUCCESS
未使用:UNUSED
核销失败:FAIL
	 */
	@ApiField("write_off_status")
	private String writeOffStatus;

	/**
	 * 核销时间
	 */
	@ApiField("write_off_time")
	private Date writeOffTime;

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

	public Date getWriteOffTime() {
		return this.writeOffTime;
	}
	public void setWriteOffTime(Date writeOffTime) {
		this.writeOffTime = writeOffTime;
	}

}
