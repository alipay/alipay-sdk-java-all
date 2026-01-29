package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AII秤设备操作记录查询
 *
 * @author auto create
 * @since 1.0, 2024-10-15 13:40:14
 */
public class AlipayMsaasMediarecogAivisionrecgDeviceoperateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8376211817723192562L;

	/**
	 * 蚂蚁激活码
	 */
	@ApiField("activation_code")
	private String activationCode;

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

	public String getActivationCode() {
		return this.activationCode;
	}
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
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

}
