package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-03 17:32:52
 */
public class TouchUvInfo extends AlipayObject {

	private static final long serialVersionUID = 6893884893333417243L;

	/**
	 * 二维码链接
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/**
	 * 唤端UV
	 */
	@ApiField("touch_uv")
	private Long touchUv;

	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

	public Long getTouchUv() {
		return this.touchUv;
	}
	public void setTouchUv(Long touchUv) {
		this.touchUv = touchUv;
	}

}
