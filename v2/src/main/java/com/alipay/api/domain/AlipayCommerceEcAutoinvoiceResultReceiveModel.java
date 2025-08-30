package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自动开票开票结果接收
 *
 * @author auto create
 * @since 1.0, 2025-07-15 19:46:16
 */
public class AlipayCommerceEcAutoinvoiceResultReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 1249927677477859119L;

	/**
	 * 开票场景
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 订单对应的买家uid
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 订单对应的买家用户的支付宝openid
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 开票失败错误码，通知开票失败原因，以此判断是否需要重试开票
	 */
	@ApiField("fail_code")
	private String failCode;

	/**
	 * 开票失败原因
	 */
	@ApiField("fail_message")
	private String failMessage;

	/**
	 * 开票结果
	 */
	@ApiField("invoice_result")
	private String invoiceResult;

	/**
	 * 自定义订单号，同一笔订单必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 订单使用支付宝支付时，对应的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getFailCode() {
		return this.failCode;
	}
	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}

	public String getFailMessage() {
		return this.failMessage;
	}
	public void setFailMessage(String failMessage) {
		this.failMessage = failMessage;
	}

	public String getInvoiceResult() {
		return this.invoiceResult;
	}
	public void setInvoiceResult(String invoiceResult) {
		this.invoiceResult = invoiceResult;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
