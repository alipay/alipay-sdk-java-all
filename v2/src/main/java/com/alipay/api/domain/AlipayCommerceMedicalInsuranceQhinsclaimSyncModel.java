package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前海平台理赔状态同步
 *
 * @author auto create
 * @since 1.0, 2026-04-17 14:17:46
 */
public class AlipayCommerceMedicalInsuranceQhinsclaimSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3527916648826125328L;

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
