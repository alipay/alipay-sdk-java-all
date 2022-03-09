package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.commission.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-14 20:25:50
 */
public class AlipayPcreditLoanCommissionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5795815739749853811L;

	/** 
	 * 活动期间累计佣金金额
	 */
	@ApiField("activity_commission_amt")
	private String activityCommissionAmt;

	/** 
	 * 活动期间累计佣金排名
	 */
	@ApiField("activity_commission_rank")
	private String activityCommissionRank;

	/** 
	 * 是否活动期内
	 */
	@ApiField("activity_period")
	private Boolean activityPeriod;

	/** 
	 * 企业ID，如居然之家、红星美凯龙等
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/** 
	 * 门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setActivityCommissionAmt(String activityCommissionAmt) {
		this.activityCommissionAmt = activityCommissionAmt;
	}
	public String getActivityCommissionAmt( ) {
		return this.activityCommissionAmt;
	}

	public void setActivityCommissionRank(String activityCommissionRank) {
		this.activityCommissionRank = activityCommissionRank;
	}
	public String getActivityCommissionRank( ) {
		return this.activityCommissionRank;
	}

	public void setActivityPeriod(Boolean activityPeriod) {
		this.activityPeriod = activityPeriod;
	}
	public Boolean getActivityPeriod( ) {
		return this.activityPeriod;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseId( ) {
		return this.enterpriseId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreId( ) {
		return this.storeId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
