package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.clerkquota.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 10:02:51
 */
public class AlipayCommerceEcRecyclinginvoiceClerkquotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7186749345848887149L;

	/** 
	 * 额度计算时间
	 */
	@ApiField("calculate_time")
	private String calculateTime;

	/** 
	 * 企业（商户）营业员ID
	 */
	@ApiField("company_clerk_id")
	private String companyClerkId;

	/** 
	 * 锁定额度（元）= 在途未支付订单金额
	 */
	@ApiField("locked_amount")
	private String lockedAmount;

	/** 
	 * 额度类型
	 */
	@ApiField("quota_type")
	private String quotaType;

	/** 
	 * 剩余额度（元）= 总额 - 锁定 - 已核销
	 */
	@ApiField("remain_amount")
	private String remainAmount;

	/** 
	 * 总额度（元）= 当前营业员该额度类型的生效额度合计
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setCalculateTime(String calculateTime) {
		this.calculateTime = calculateTime;
	}
	public String getCalculateTime( ) {
		return this.calculateTime;
	}

	public void setCompanyClerkId(String companyClerkId) {
		this.companyClerkId = companyClerkId;
	}
	public String getCompanyClerkId( ) {
		return this.companyClerkId;
	}

	public void setLockedAmount(String lockedAmount) {
		this.lockedAmount = lockedAmount;
	}
	public String getLockedAmount( ) {
		return this.lockedAmount;
	}

	public void setQuotaType(String quotaType) {
		this.quotaType = quotaType;
	}
	public String getQuotaType( ) {
		return this.quotaType;
	}

	public void setRemainAmount(String remainAmount) {
		this.remainAmount = remainAmount;
	}
	public String getRemainAmount( ) {
		return this.remainAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
