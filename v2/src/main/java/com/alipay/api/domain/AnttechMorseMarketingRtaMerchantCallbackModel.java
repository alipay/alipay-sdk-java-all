package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 翼支付数据回调接口
 *
 * @author auto create
 * @since 1.0, 2023-08-15 19:04:26
 */
public class AnttechMorseMarketingRtaMerchantCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 6223115647468258844L;

	/**
	 * 活动id描述用户使用这个活动消耗预算，该活动必须是被场景侧曝光过的活动
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 用于分类统计
	 */
	@ApiField("commodity_category")
	private String commodityCategory;

	/**
	 * 分润额，单位元，精确到小数点后两位
	 */
	@ApiField("dividend_amt")
	private String dividendAmt;

	/**
	 * mobile_sha_256标识用户唯一信息，通过用户手机号SHA256 哈希后获得
	 */
	@ApiField("mobile_sha_256")
	private String mobileSha256;

	/**
	 * 支付金额，用于标识用户支付的金额，单位元，精确到小数点后两位
	 */
	@ApiField("payment_amt")
	private String paymentAmt;

	/**
	 * 请求id，单笔订单唯一
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 资源位信息确定商户投放场景，由摩斯同学配置并分配给调用方
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 交易时间，订单发生的时间
	 */
	@ApiField("trade_date")
	private Date tradeDate;

	/**
	 * 支付宝交易号，用于摩斯与广告主对账，内容可以是银行流水交易号或者商户交易的唯一标识，
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易金额，标识本次订单的金额，单位元，精确到小数点后两位
	 */
	@ApiField("trade_total_amt")
	private String tradeTotalAmt;

	/**
	 * 交易类型，暂只支持核销VERIFY
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getCommodityCategory() {
		return this.commodityCategory;
	}
	public void setCommodityCategory(String commodityCategory) {
		this.commodityCategory = commodityCategory;
	}

	public String getDividendAmt() {
		return this.dividendAmt;
	}
	public void setDividendAmt(String dividendAmt) {
		this.dividendAmt = dividendAmt;
	}

	public String getMobileSha256() {
		return this.mobileSha256;
	}
	public void setMobileSha256(String mobileSha256) {
		this.mobileSha256 = mobileSha256;
	}

	public String getPaymentAmt() {
		return this.paymentAmt;
	}
	public void setPaymentAmt(String paymentAmt) {
		this.paymentAmt = paymentAmt;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public Date getTradeDate() {
		return this.tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
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

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
