package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 激活码设备激活信息对象
 *
 * @author auto create
 * @since 1.0, 2024-10-15 13:40:15
 */
public class ScalesActivationCodeDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 6199235338313332183L;

	/**
	 * 蚂蚁激活码
	 */
	@ApiField("activation_code")
	private String activationCode;

	/**
	 * 设备激活类型(激活码/设备白名单)
	 */
	@ApiField("activation_type")
	private String activationType;

	/**
	 * 蚂蚁IOT机具设备号
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 服务商设备号，mac地址
	 */
	@ApiField("isv_tid")
	private String isvTid;

	/**
	 * 最后修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	public String getActivationCode() {
		return this.activationCode;
	}
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public String getActivationType() {
		return this.activationType;
	}
	public void setActivationType(String activationType) {
		this.activationType = activationType;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getIsvTid() {
		return this.isvTid;
	}
	public void setIsvTid(String isvTid) {
		this.isvTid = isvTid;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

}
