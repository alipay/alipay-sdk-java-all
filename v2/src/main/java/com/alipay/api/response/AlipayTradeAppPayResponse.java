package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.app.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-07 10:32:43
 */
public class AlipayTradeAppPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7576187867766291592L;

	/** 
	 * 授信协议号。信用支付场景才有值，先用后付产品里是用户的芝麻授信协议号
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/** 
	 * 信用业务单号。信用支付场景才有值，先用后付产品里是芝麻订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/** 
	 * 信用支付模式。表示订单是采用信用支付方式（支付时买家没有出资，需要后续履约）。"creditAdvanceV2"表示芝麻先用后付模式，用户后续需要履约扣款。 此字段只有信用支付场景才有值，商户需要根据字段值单独处理。此字段以后可能扩展其他值，建议商户使用白名单方式识别，对于未识别的值做失败处理，并联系支付宝技术支持人员。
	 */
	@ApiField("credit_pay_mode")
	private String creditPayMode;

	/** 
	 * 商户原始订单号，最大长度限制32位
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 获取签名后的业务数据
	 */
	@ApiField("orderStr")
	private String orderStr;

	/** 
	 * 商户订单号，由商家自定义。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 收款支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数字
	 */
	@ApiField("seller_id")
	private String sellerId;

	/** 
	 * 该笔订单的资金总额，单位为人民币（元），取值范围为 0.01~100000000.00，精确到小数点后两位。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 该交易在支付宝系统中的交易流水号。使用sdkExecute方法提交时不会返回，请在支付成功后通过 <a href="https://opendocs.alipay.com/apis/api_1/alipay.trade.query">alipay.trade.query</a>(统一收单线下交易查询)接口查询获取。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
	}
	public String getCreditAgreementId( ) {
		return this.creditAgreementId;
	}

	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}
	public String getCreditBizOrderId( ) {
		return this.creditBizOrderId;
	}

	public void setCreditPayMode(String creditPayMode) {
		this.creditPayMode = creditPayMode;
	}
	public String getCreditPayMode( ) {
		return this.creditPayMode;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
	}

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerId( ) {
		return this.sellerId;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
