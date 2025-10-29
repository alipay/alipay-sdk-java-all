package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * HDF图片通用OCR识别
 *
 * @author auto create
 * @since 1.0, 2025-08-26 17:27:13
 */
public class AlipayCommerceHdfaitransferPictureocrIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 2736929757474389297L;

	/**
	 * 图片URL
	 */
	@ApiField("pic_url")
	private String picUrl;

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

}
