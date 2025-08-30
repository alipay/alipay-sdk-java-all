package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附件信息
 *
 * @author auto create
 * @since 1.0, 2025-08-26 15:04:59
 */
public class FulfillmentMediaInfo extends AlipayObject {

	private static final long serialVersionUID = 4557986393437236585L;

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
