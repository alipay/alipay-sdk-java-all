package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商风控准入
 *
 * @author auto create
 * @since 1.0, 2025-06-03 17:23:15
 */
public class AlipayInsSceneEcommerceRiskCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7777499282835656659L;

	/**
	 * 电商买家
	 */
	@ApiField("buyer")
	private EcomBuyerDTO buyer;

	/**
	 * 商品
	 */
	@ApiField("item")
	private EcomItemDTO item;

	/**
	 * 订单
	 */
	@ApiField("order")
	private EcomOrderDTO order;

	/**
	 * 请求幂等单号，如果不传入，系统自动生成
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 合作商标识，由蚂蚁保分配
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 产品方案ID，由蚂蚁保分配
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	/**
	 * 风控准入类型，用于标识时间风控准入的环节
	 */
	@ApiField("risk_access_type")
	private String riskAccessType;

	/**
	 * 电商卖家
	 */
	@ApiField("seller")
	private EcomSellerDTO seller;

	public EcomBuyerDTO getBuyer() {
		return this.buyer;
	}
	public void setBuyer(EcomBuyerDTO buyer) {
		this.buyer = buyer;
	}

	public EcomItemDTO getItem() {
		return this.item;
	}
	public void setItem(EcomItemDTO item) {
		this.item = item;
	}

	public EcomOrderDTO getOrder() {
		return this.order;
	}
	public void setOrder(EcomOrderDTO order) {
		this.order = order;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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

	public String getRiskAccessType() {
		return this.riskAccessType;
	}
	public void setRiskAccessType(String riskAccessType) {
		this.riskAccessType = riskAccessType;
	}

	public EcomSellerDTO getSeller() {
		return this.seller;
	}
	public void setSeller(EcomSellerDTO seller) {
		this.seller = seller;
	}

}
