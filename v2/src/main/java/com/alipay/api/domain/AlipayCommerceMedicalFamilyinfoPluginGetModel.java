package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取医疗健康账户家人信息插件
 *
 * @author auto create
 * @since 1.0, 2025-12-02 11:24:06
 */
public class AlipayCommerceMedicalFamilyinfoPluginGetModel extends AlipayObject {

	private static final long serialVersionUID = 1725499985285791329L;

	/**
	 * 用户在支付宝插件中操作完成后的回跳地址
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

}
