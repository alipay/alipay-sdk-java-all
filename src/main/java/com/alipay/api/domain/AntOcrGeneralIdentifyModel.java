package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用OCR识别
 *
 * @author auto create
 * @since 1.0, 2020-02-07 11:29:33
 */
public class AntOcrGeneralIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 6715996688133662892L;

	/**
	 * 图片地址
	 */
	@ApiField("image")
	private String image;

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
