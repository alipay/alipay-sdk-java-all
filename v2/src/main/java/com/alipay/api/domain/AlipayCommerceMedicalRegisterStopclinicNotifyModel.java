package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停诊通知
 *
 * @author auto create
 * @since 1.0, 2025-04-27 14:20:48
 */
public class AlipayCommerceMedicalRegisterStopclinicNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2657276645415258893L;

	/**
	 * 停诊日期，格式: yyyy-MM-dd
	 */
	@ApiField("date")
	private String date;

	/**
	 * 医院id
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 停诊类型
	 */
	@ApiField("nofity_type")
	private String nofityType;

	/**
	 * 平台编码，联系支付宝解决方案给出
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 停诊原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 医院排班id
	 */
	@ApiField("register_id")
	private String registerId;

	/**
	 * 停诊类型
	 */
	@ApiField("type")
	private String type;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getNofityType() {
		return this.nofityType;
	}
	public void setNofityType(String nofityType) {
		this.nofityType = nofityType;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRegisterId() {
		return this.registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
