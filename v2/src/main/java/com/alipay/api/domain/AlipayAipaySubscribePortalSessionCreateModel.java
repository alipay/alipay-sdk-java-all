package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅门户链接生成
 *
 * @author auto create
 * @since 1.0, 2026-07-20 19:32:53
 */
public class AlipayAipaySubscribePortalSessionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7668274846811918171L;

	/**
	 * 客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 门户公开编码(10位) 在商家平台获取的门户编码
	 */
	@ApiField("portal_code")
	private String portalCode;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPortalCode() {
		return this.portalCode;
	}
	public void setPortalCode(String portalCode) {
		this.portalCode = portalCode;
	}

}
