package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.quota.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-17 16:27:41
 */
public class AlipayFundQuotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6827953511324912746L;

	/** 
	 * 商转新额度单日剩余额度，单位为元，精确到小数点后两位；当product_code为SINGLE_TRANSFER_NO_PWD,biz_scene为MER_TRANS_TO_ACC 或 biz_scene为MER_TRANS_TO_CARD，该值返回
	 */
	@ApiField("new_quota_daily_remain")
	private String newQuotaDailyRemain;

	/** 
	 * 商转新额度单月剩余额度	，单位为元，精确到小数点后两位；当product_code为SINGLE_TRANSFER_NO_PWD,biz_scene为MER_TRANS_TO_ACC 或 biz_scene为MER_TRANS_TO_CARD，该值返回
	 */
	@ApiField("new_quota_monthly_remain")
	private String newQuotaMonthlyRemain;

	/** 
	 * 商转新额度单笔最大金额，单位为元，精确到小数点后两位；当product_code为SINGLE_TRANSFER_NO_PWD,biz_scene为MER_TRANS_TO_ACC 或 biz_scene为MER_TRANS_TO_CARD，该值返回
	 */
	@ApiField("new_quota_single_max")
	private String newQuotaSingleMax;

	/** 
	 * 商转新额度单笔最小金额，单位为元，精确到小数点后两位；当product_code为SINGLE_TRANSFER_NO_PWD,biz_scene为MER_TRANS_TO_ACC 或 biz_scene为MER_TRANS_TO_CARD，该值返回
	 */
	@ApiField("new_quota_single_min")
	private String newQuotaSingleMin;

	/** 
	 * 对公日可用额度，单位为元，精确到小数点后两位
	 */
	@ApiField("to_corporate_daily_available_amount")
	private String toCorporateDailyAvailableAmount;

	/** 
	 * 对公月可用额度，单位为元，精确到小数点后两位
	 */
	@ApiField("to_corporate_monthly_available_amount")
	private String toCorporateMonthlyAvailableAmount;

	/** 
	 * 对私日可用额度，单位为元，精确到小数点后两位
	 */
	@ApiField("to_private_daily_available_amount")
	private String toPrivateDailyAvailableAmount;

	/** 
	 * 对私月可用额度，单位为元，精确到小数点后两位
	 */
	@ApiField("to_private_monthly_available_amount")
	private String toPrivateMonthlyAvailableAmount;

	public void setNewQuotaDailyRemain(String newQuotaDailyRemain) {
		this.newQuotaDailyRemain = newQuotaDailyRemain;
	}
	public String getNewQuotaDailyRemain( ) {
		return this.newQuotaDailyRemain;
	}

	public void setNewQuotaMonthlyRemain(String newQuotaMonthlyRemain) {
		this.newQuotaMonthlyRemain = newQuotaMonthlyRemain;
	}
	public String getNewQuotaMonthlyRemain( ) {
		return this.newQuotaMonthlyRemain;
	}

	public void setNewQuotaSingleMax(String newQuotaSingleMax) {
		this.newQuotaSingleMax = newQuotaSingleMax;
	}
	public String getNewQuotaSingleMax( ) {
		return this.newQuotaSingleMax;
	}

	public void setNewQuotaSingleMin(String newQuotaSingleMin) {
		this.newQuotaSingleMin = newQuotaSingleMin;
	}
	public String getNewQuotaSingleMin( ) {
		return this.newQuotaSingleMin;
	}

	public void setToCorporateDailyAvailableAmount(String toCorporateDailyAvailableAmount) {
		this.toCorporateDailyAvailableAmount = toCorporateDailyAvailableAmount;
	}
	public String getToCorporateDailyAvailableAmount( ) {
		return this.toCorporateDailyAvailableAmount;
	}

	public void setToCorporateMonthlyAvailableAmount(String toCorporateMonthlyAvailableAmount) {
		this.toCorporateMonthlyAvailableAmount = toCorporateMonthlyAvailableAmount;
	}
	public String getToCorporateMonthlyAvailableAmount( ) {
		return this.toCorporateMonthlyAvailableAmount;
	}

	public void setToPrivateDailyAvailableAmount(String toPrivateDailyAvailableAmount) {
		this.toPrivateDailyAvailableAmount = toPrivateDailyAvailableAmount;
	}
	public String getToPrivateDailyAvailableAmount( ) {
		return this.toPrivateDailyAvailableAmount;
	}

	public void setToPrivateMonthlyAvailableAmount(String toPrivateMonthlyAvailableAmount) {
		this.toPrivateMonthlyAvailableAmount = toPrivateMonthlyAvailableAmount;
	}
	public String getToPrivateMonthlyAvailableAmount( ) {
		return this.toPrivateMonthlyAvailableAmount;
	}

}
