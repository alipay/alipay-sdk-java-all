package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前海平台港人就医签到
 *
 * @author auto create
 * @since 1.0, 2026-04-17 14:17:46
 */
public class AlipayCommerceMedicalInsuranceQhinsplatSigninModel extends AlipayObject {

	private static final long serialVersionUID = 4858216232871698224L;

	/**
	 * 请求入参
	 */
	@ApiField("request_str")
	private String requestStr;

	public String getRequestStr() {
		return this.requestStr;
	}
	public void setRequestStr(String requestStr) {
		this.requestStr = requestStr;
	}

}
