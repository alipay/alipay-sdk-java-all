package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-21 10:43:00
 */
public class TouchUvInfo extends AlipayObject {

	private static final long serialVersionUID = 2476265474979562813L;

	/**
	 * 线圈类型编码
	 */
	@ApiField("coil_type")
	private String coilType;

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

	public String getCoilType() {
		return this.coilType;
	}
	public void setCoilType(String coilType) {
		this.coilType = coilType;
	}

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
