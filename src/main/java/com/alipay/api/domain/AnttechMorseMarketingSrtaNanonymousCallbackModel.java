package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动SRTA活动信息回调接口
 *
 * @author auto create
 * @since 1.0, 2022-06-02 20:29:17
 */
public class AnttechMorseMarketingSrtaNanonymousCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 5794726878378687638L;

	/**
	 * 活动唯一标识，由查询接口返回
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 优惠金额，单位元
	 */
	@ApiField("discount_amt")
	private String discountAmt;

	/**
	 * 扩展备用参数，正常情况下不需要填写,json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 明文手机号，与mobile_sha_256两者选其一
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 手机号 hash后的值，与mobile两者选其一
	 */
	@ApiField("mobile_sha_256")
	private String mobileSha256;

	/**
	 * 交易时间，格式yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("trade_create_date")
	private String tradeCreateDate;

	/**
	 * 用于摩斯与广告主对账，内容可以是银行流水交易号或者商户交易的唯一标识
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易金额，单位元
	 */
	@ApiField("trade_total_amt")
	private String tradeTotalAmt;

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getDiscountAmt() {
		return this.discountAmt;
	}
	public void setDiscountAmt(String discountAmt) {
		this.discountAmt = discountAmt;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobileSha256() {
		return this.mobileSha256;
	}
	public void setMobileSha256(String mobileSha256) {
		this.mobileSha256 = mobileSha256;
	}

	public String getTradeCreateDate() {
		return this.tradeCreateDate;
	}
	public void setTradeCreateDate(String tradeCreateDate) {
		this.tradeCreateDate = tradeCreateDate;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeTotalAmt() {
		return this.tradeTotalAmt;
	}
	public void setTradeTotalAmt(String tradeTotalAmt) {
		this.tradeTotalAmt = tradeTotalAmt;
	}

}
