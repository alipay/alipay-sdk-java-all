package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 免押租房订单吱口令创建
 *
 * @author auto create
 * @since 1.0, 2024-10-12 10:28:01
 */
public class AlipayOpenAppRentroomCodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3153184189897378661L;

	/**
	 * 跳转链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
