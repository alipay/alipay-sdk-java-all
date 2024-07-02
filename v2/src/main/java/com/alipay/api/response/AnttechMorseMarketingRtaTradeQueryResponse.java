package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.rta.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:31:44
 */
public class AnttechMorseMarketingRtaTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6644288552698881696L;

	/** 
	 * 业务唯一标识，标识本次查询的唯一识别号，用于问题定位
	 */
	@ApiField("biz_no")
	private String bizNo;

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
	 * 支付宝交易号，用于摩斯与广告主对账，内容可以是银行流水交易号或者商户交易的唯一标识
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易状态，枚举值
TRADE_VERIFY[交易核销]、
TRADE_REFUND[交易退货]、
TRADE_NOT_EXIST[交易不存在]
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/** 
	 * 交易金额，单位元，标识本次订单的金额
	 */
	@ApiField("trade_total_amt")
	private String tradeTotalAmt;

	/** 
	 * 交易类型，标识回调的类型，取值为英文，枚举值VERIFY[核销]和REFUND[退货]
	 */
	@ApiField("trade_type")
	private String tradeType;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignId( ) {
		return this.campaignId;
	}

	public void setDiscountAmt(String discountAmt) {
		this.discountAmt = discountAmt;
	}
	public String getDiscountAmt( ) {
		return this.discountAmt;
	}

	public void setMobileSha256(String mobileSha256) {
		this.mobileSha256 = mobileSha256;
	}
	public String getMobileSha256( ) {
		return this.mobileSha256;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPaymentAmt(String paymentAmt) {
		this.paymentAmt = paymentAmt;
	}
	public String getPaymentAmt( ) {
		return this.paymentAmt;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceId( ) {
		return this.resourceId;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	public Date getTradeDate( ) {
		return this.tradeDate;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

	public void setTradeTotalAmt(String tradeTotalAmt) {
		this.tradeTotalAmt = tradeTotalAmt;
	}
	public String getTradeTotalAmt( ) {
		return this.tradeTotalAmt;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getTradeType( ) {
		return this.tradeType;
	}

}
