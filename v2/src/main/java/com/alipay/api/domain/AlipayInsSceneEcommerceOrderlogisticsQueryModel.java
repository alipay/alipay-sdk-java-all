package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询电商订单关联的生效物流摘要信息
 *
 * @author auto create
 * @since 1.0, 2024-09-10 13:32:43
 */
public class AlipayInsSceneEcommerceOrderlogisticsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8311823729897765213L;

	/**
	 * 买家ID，渠道唯一标识买家的唯一ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 合作商ID，由蚂蚁保线下分配
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

}
