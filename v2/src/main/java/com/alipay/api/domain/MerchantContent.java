package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户商户给设备传输内容
 *
 * @author auto create
 * @since 1.0, 2025-09-02 14:53:35
 */
public class MerchantContent extends AlipayObject {

	private static final long serialVersionUID = 4868396239477617923L;

	/**
	 * 链接类型
	 */
	@ApiField("link_type")
	private String linkType;

	public String getLinkType() {
		return this.linkType;
	}
	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

}
