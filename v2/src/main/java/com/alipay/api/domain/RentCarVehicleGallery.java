package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车车型图片展示信息
 *
 * @author auto create
 * @since 1.0, 2023-12-04 22:47:18
 */
public class RentCarVehicleGallery extends AlipayObject {

	private static final long serialVersionUID = 7161178939649637299L;

	/**
	 * 展示类型，IMG：图片、VIDEO：视频、VR
	 */
	@ApiField("type")
	private String type;

	/**
	 * 以http开头url
	 */
	@ApiField("url")
	private String url;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
