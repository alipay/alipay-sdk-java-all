package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片信息
 *
 * @author auto create
 * @since 1.0, 2020-08-10 20:27:13
 */
public class Image extends AlipayObject {

	private static final long serialVersionUID = 8711653764237594727L;

	/**
	 * 图片url，请先调用alipay.offline.material.image.upload 图片上传接口获得图片url
	 */
	@ApiField("url")
	private String url;

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
