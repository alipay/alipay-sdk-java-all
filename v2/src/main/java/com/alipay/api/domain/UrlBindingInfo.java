package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-15 15:52:54
 */
public class UrlBindingInfo extends AlipayObject {

	private static final long serialVersionUID = 7377443886599351432L;

	/**
	 * 是否已申请线圈
	 */
	@ApiField("applied")
	private Boolean applied;

	/**
	 * 线圈URL
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public Boolean getApplied() {
		return this.applied;
	}
	public void setApplied(Boolean applied) {
		this.applied = applied;
	}

	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

}
