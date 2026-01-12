package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取医疗健康账户家人信息插件
 *
 * @author auto create
 * @since 1.0, 2026-01-04 16:47:15
 */
public class AlipayCommerceMedicalFamilyinfoPluginGetModel extends AlipayObject {

	private static final long serialVersionUID = 3861619991969546997L;

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
