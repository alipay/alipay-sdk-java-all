package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸认证所需的商户配置信息
 *
 * @author auto create
 * @since 1.0, 2024-02-27 09:59:38
 */
public class OpenCertifyMerchantConfigs extends AlipayObject {

	private static final long serialVersionUID = 2867946173314535634L;

	/**
	 * 不传默认为reserve
	 */
	@ApiField("face_reserve_strategy")
	private String faceReserveStrategy;

	/**
	 * 认证成功后需要跳转的地址，一般为商户业务页面；若无跳转地址可填空字符""。
	 */
	@ApiField("return_url")
	private String returnUrl;

	public String getFaceReserveStrategy() {
		return this.faceReserveStrategy;
	}
	public void setFaceReserveStrategy(String faceReserveStrategy) {
		this.faceReserveStrategy = faceReserveStrategy;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

}
