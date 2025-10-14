package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cash.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:02:42
 */
public class AlipayMarketingCampaignCashTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 2435818568757418327L;

	/** 
	 * 支付宝业务号,发奖成功时返回,调用者可提供此字符串进行问题排查与核对等
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 红包名称,创建活动时设置，用于账单列表和详情、红包列表和详情的展示
	 */
	@ApiField("coupon_name")
	private String couponName;

	/** 
	 * 用户领取失败的错误信息描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 商户头像logo的图片url地址，用于账单和红包列表、详情的展示
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/** 
	 * 外部业务号,回填请求中的out_biz_no,请求参数中传了out_biz_no就会回传回去，如果不传就回传默认的"default_out_biz_no"，请求者可用于日志记录与核对等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 发送红包商户签约pid，发奖成功时非空
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 现金红包金额，发奖成功时非空，单位为元，保留两位小数
	 */
	@ApiField("prize_amount")
	private String prizeAmount;

	/** 
	 * 活动文案,用于账单的备注展示、红包详情页的文案展示
	 */
	@ApiField("prize_msg")
	private String prizeMsg;

	/** 
	 * 用户是否重复领取，如果重复领取，返回的是之前的中奖结果，如果是首次领取，则走发奖流程
	 */
	@ApiField("repeat_trigger_flag")
	private String repeatTriggerFlag;

	/** 
	 * 是否中奖结果状态，取值为true或false。如果为true表示发奖成功，这时返回的结果中的其他字段非空；如果为false表示发奖失败，这时返回的其他字段为空
	 */
	@ApiField("trigger_result")
	private String triggerResult;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public String getCouponName( ) {
		return this.couponName;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}
	public String getMerchantLogo( ) {
		return this.merchantLogo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setPrizeAmount(String prizeAmount) {
		this.prizeAmount = prizeAmount;
	}
	public String getPrizeAmount( ) {
		return this.prizeAmount;
	}

	public void setPrizeMsg(String prizeMsg) {
		this.prizeMsg = prizeMsg;
	}
	public String getPrizeMsg( ) {
		return this.prizeMsg;
	}

	public void setRepeatTriggerFlag(String repeatTriggerFlag) {
		this.repeatTriggerFlag = repeatTriggerFlag;
	}
	public String getRepeatTriggerFlag( ) {
		return this.repeatTriggerFlag;
	}

	public void setTriggerResult(String triggerResult) {
		this.triggerResult = triggerResult;
	}
	public String getTriggerResult( ) {
		return this.triggerResult;
	}

}
