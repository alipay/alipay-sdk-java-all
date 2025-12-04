package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫域外请求域内做权益占用
 *
 * @author auto create
 * @since 1.0, 2025-10-21 19:42:40
 */
public class AlipayCommerceHdfServicerightConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5839574817992225345L;

	/**
	 * 业务身份
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/**
	 * 业务订单id
	 */
	@ApiField("business_order_id")
	private String businessOrderId;

	/**
	 * 合作方userId
	 */
	@ApiField("open_partner_user_id")
	private String openPartnerUserId;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

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

	public String getBusinessOrderId() {
		return this.businessOrderId;
	}
	public void setBusinessOrderId(String businessOrderId) {
		this.businessOrderId = businessOrderId;
	}

	public String getOpenPartnerUserId() {
		return this.openPartnerUserId;
	}
	public void setOpenPartnerUserId(String openPartnerUserId) {
		this.openPartnerUserId = openPartnerUserId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
