package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 追偿预咨询
 *
 * @author auto create
 * @since 1.0, 2025-10-23 21:16:36
 */
public class AlipayInsSceneClaimOverduePreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 1313585725689975686L;

	/**
	 * 扩展信息
	 */
	@ApiField("biz_data")
	private InsClaimOverdueBizData bizData;

	/**
	 * 赔案号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 合作商id
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 产品方案id
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	public InsClaimOverdueBizData getBizData() {
		return this.bizData;
	}
	public void setBizData(InsClaimOverdueBizData bizData) {
		this.bizData = bizData;
	}

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
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
