package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售后凭证信息
 *
 * @author auto create
 * @since 1.0, 2025-06-09 16:51:38
 */
public class AftersaleMediaInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7644591882158974863L;

	/**
	 * 材料类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 材料链接
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
