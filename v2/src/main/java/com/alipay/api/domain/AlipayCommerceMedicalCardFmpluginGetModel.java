package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取医保电子凭证亲情账户绑定关系插件地址
 *
 * @author auto create
 * @since 1.0, 2023-09-19 10:14:19
 */
public class AlipayCommerceMedicalCardFmpluginGetModel extends AlipayObject {

	private static final long serialVersionUID = 8841987156834958725L;

	/**
	 * 用户在插件中操作完成后回跳地址
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
