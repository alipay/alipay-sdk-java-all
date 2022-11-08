package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景开放平台预下单返回的订单信息模型
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:50:13
 */
public class InsPreOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 7799358568345456824L;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 预下单id
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/**
	 * 产品方案id
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	/**
	 * 报价信息
	 */
	@ApiField("quote_info")
	private InsQuoteDTO quoteInfo;

	/**
	 * 推荐流水id
	 */
	@ApiField("recommend_flow_id")
	private String recommendFlowId;

	/**
	 * 状态：INIT(初始化),ISSUED(已出单),CLOSE(关单)
	 */
	@ApiField("status")
	private String status;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getPreOrderId() {
		return this.preOrderId;
	}
	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
	}

	public InsQuoteDTO getQuoteInfo() {
		return this.quoteInfo;
	}
	public void setQuoteInfo(InsQuoteDTO quoteInfo) {
		this.quoteInfo = quoteInfo;
	}

	public String getRecommendFlowId() {
		return this.recommendFlowId;
	}
	public void setRecommendFlowId(String recommendFlowId) {
		this.recommendFlowId = recommendFlowId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
