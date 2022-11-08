package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩卡营销活动人群活动消耗回调
 *
 * @author auto create
 * @since 1.0, 2022-11-01 16:50:28
 */
public class AnttechMorseMarketingRtaCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 2821414888917948344L;

	/**
	 * 活动id描述用户使用这个活动消耗预算，该活动必须是被场景侧曝光过的活动
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 优惠金额，标识本次优惠活动摩斯端能享有的优惠金额
	 */
	@ApiField("discount_amt")
	private String discountAmt;

	/**
	 * 扩展字段，保留扩展配置字段
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * mobile_sha_256标识用户唯一信息，通过用户手机号SHA256 哈希后获得
	 */
	@ApiField("mobile_sha_256")
	private String mobileSha256;

	/**
	 * 外部业务号，业务的标识由商户生成，可以设置成订单号，如果不填写，默认采用trade_no作为外部请求号处理
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付金额，单位元，用于标识用户支付的金额
	 */
	@ApiField("payment_amt")
	private String paymentAmt;

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
	 * 交易金额，单位元，标识本次订单的金额
	 */
	@ApiField("trade_total_amt")
	private String tradeTotalAmt;

	/**
	 * 交易类型，标识回调的类型，取值为英文，枚举值verify[核销]和refund[退货]
	 */
	@ApiField("trade_type")
	private String tradeType;

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

	public String getMobileSha256() {
		return this.mobileSha256;
	}
	public void setMobileSha256(String mobileSha256) {
		this.mobileSha256 = mobileSha256;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPaymentAmt() {
		return this.paymentAmt;
	}
	public void setPaymentAmt(String paymentAmt) {
		this.paymentAmt = paymentAmt;
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
