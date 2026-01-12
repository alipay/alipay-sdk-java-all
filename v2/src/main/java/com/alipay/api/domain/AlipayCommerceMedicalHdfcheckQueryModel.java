package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约方查询检验检查单详情V2
 *
 * @author auto create
 * @since 1.0, 2025-12-26 11:07:43
 */
public class AlipayCommerceMedicalHdfcheckQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3581585489463932516L;

	/**
	 * hdf的authCode
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 双方定义
	 */
	@ApiField("biz_source")
	private String bizSource;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

}
