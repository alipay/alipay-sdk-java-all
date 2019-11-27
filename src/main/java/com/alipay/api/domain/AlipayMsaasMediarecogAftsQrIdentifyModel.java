package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多媒体服务二维码识别
 *
 * @author auto create
 * @since 1.0, 2017-08-21 14:54:13
 */
public class AlipayMsaasMediarecogAftsQrIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 7444422784721423551L;

	/**
	 * 扩展入参
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 传入资源的URL
	 */
	@ApiField("url")
	private String url;

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
