package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OCR-驾驶证识别
 *
 * @author auto create
 * @since 1.0, 2022-07-08 14:26:04
 */
public class AlipayMsaasMediarecogMmtcapiDriverlicenseIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 2827135345693911494L;

	/**
	 * 图片地址
	 */
	@ApiField("image")
	private String image;

	/**
	 * 正面：face；背面：back
	 */
	@ApiField("side")
	private String side;

	/**
	 * 图片存储类型，url：图片url地址；aftsId：afts文件服务Id
	 */
	@ApiField("type")
	private String type;

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getSide() {
		return this.side;
	}
	public void setSide(String side) {
		this.side = side;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
