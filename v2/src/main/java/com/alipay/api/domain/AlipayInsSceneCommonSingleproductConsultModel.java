package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单产品咨询
 *
 * @author auto create
 * @since 1.0, 2026-04-22 16:20:35
 */
public class AlipayInsSceneCommonSingleproductConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3653331333393345429L;

	/**
	 * 业务id，业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 订单
	 */
	@ApiField("order_dto")
	private EcomOrderDTO orderDto;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 产品方案id
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public EcomOrderDTO getOrderDto() {
		return this.orderDto;
	}
	public void setOrderDto(EcomOrderDTO orderDto) {
		this.orderDto = orderDto;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

}
