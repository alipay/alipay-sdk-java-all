package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险下单
 *
 * @author auto create
 * @since 1.0, 2024-05-27 15:28:12
 */
public class AlipayInsSceneCommonOrderApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5722748531693171164L;

	/**
	 * 业务时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 投保人
	 */
	@ApiField("holder_user")
	private InsOpenUserDTO holderUser;

	/**
	 * 被保人
	 */
	@ApiField("insured_user")
	private InsOpenUserDTO insuredUser;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 预下单号
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/**
	 * 产品方案id，，预下单接口返回的
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public InsOpenUserDTO getHolderUser() {
		return this.holderUser;
	}
	public void setHolderUser(InsOpenUserDTO holderUser) {
		this.holderUser = holderUser;
	}

	public InsOpenUserDTO getInsuredUser() {
		return this.insuredUser;
	}
	public void setInsuredUser(InsOpenUserDTO insuredUser) {
		this.insuredUser = insuredUser;
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

}
