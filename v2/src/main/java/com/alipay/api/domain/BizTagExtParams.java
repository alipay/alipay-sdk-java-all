package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展字段
 *
 * @author auto create
 * @since 1.0, 2025-01-03 15:35:53
 */
public class BizTagExtParams extends AlipayObject {

	private static final long serialVersionUID = 1884312848167622219L;

	/**
	 * 商户的动态跳转链接
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
