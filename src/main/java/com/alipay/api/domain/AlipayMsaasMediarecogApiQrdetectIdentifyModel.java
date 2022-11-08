package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二维码检测&识别
 *
 * @author auto create
 * @since 1.0, 2022-02-22 20:20:46
 */
public class AlipayMsaasMediarecogApiQrdetectIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 1776721296443967157L;

	/**
	 * 待检测的图片url
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
