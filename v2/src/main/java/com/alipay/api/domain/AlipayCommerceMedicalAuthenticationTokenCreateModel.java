package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISVH5页面鉴权token生成
 *
 * @author auto create
 * @since 1.0, 2026-04-28 15:27:48
 */
public class AlipayCommerceMedicalAuthenticationTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1338676869838519781L;

	/**
	 * 跳转链接
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
