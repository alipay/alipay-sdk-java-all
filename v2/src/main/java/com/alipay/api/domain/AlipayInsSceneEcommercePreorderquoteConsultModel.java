package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预下单报价
 *
 * @author auto create
 * @since 1.0, 2024-03-20 11:19:53
 */
public class AlipayInsSceneEcommercePreorderquoteConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2179786585796876539L;

	/**
	 * 订单
	 */
	@ApiField("order")
	private EcomOrderDTO order;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 预下单id
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	public EcomOrderDTO getOrder() {
		return this.order;
	}
	public void setOrder(EcomOrderDTO order) {
		this.order = order;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getPreOrderId() {
		return this.preOrderId;
	}
	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}

}
