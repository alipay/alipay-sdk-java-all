package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫域外请求域内做权益校验
 *
 * @author auto create
 * @since 1.0, 2025-10-28 18:57:40
 */
public class AlipayCommerceHdfServicerightCheckModel extends AlipayObject {

	private static final long serialVersionUID = 5496632669669194597L;

	/**
	 * 业务身份
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/**
	 * 三方UID
	 */
	@ApiField("open_partner_user_id")
	private String openPartnerUserId;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getBizIdentity() {
		return this.bizIdentity;
	}
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

	public String getOpenPartnerUserId() {
		return this.openPartnerUserId;
	}
	public void setOpenPartnerUserId(String openPartnerUserId) {
		this.openPartnerUserId = openPartnerUserId;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
