package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI秤设备解绑接口
 *
 * @author auto create
 * @since 1.0, 2024-07-26 17:01:36
 */
public class AlipayMsaasMediarecogAivisionrecgDeviceUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 4415756151787875787L;

	/**
	 * 激活码
	 */
	@ApiField("activation_code")
	private String activationCode;

	/**
	 * 服务商ID
	 */
	@ApiField("isv_id")
	private String isvId;

	public String getActivationCode() {
		return this.activationCode;
	}
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public String getIsvId() {
		return this.isvId;
	}
	public void setIsvId(String isvId) {
		this.isvId = isvId;
	}

}
