package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 统一收单交易直接支付接口
 *
 * @author auto create
 * @since 1.0, 2023-07-06 16:01:21
 */
public class AlipayTradeOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 2211184783952512475L;

	/**
	 * 垫资支付模式。支付时需要垫资的场景才传入。具体传参需与支付宝约定。
CREDIT_FULFILLMENT_ZM 表示先用后付产品履约动作支持芝麻垫资。
	 */
	@ApiField("advance_payment_type")
	private String advancePaymentType;

	/**
	 * 买家的支付宝用户id

注：
1.用于校验与已存交易中的买家是否相等
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识

注：
1.用于校验与已存交易中的买家是否相等
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 买家支付明细

目前支持的支付渠道为：
- offline_pos：本次买家使用的是pos刷卡支付

注：
各支付工具金额总和=订单总金额
	 */
	@ApiListField("buyer_pay_detail")
	@ApiField("buyer_pay_detail")
	private List<BuyerPayDetail> buyerPayDetail;

	/**
	 * 本次履约支付金额，单位为元，精确到小数点后两位。履约支付场景才需要传入。
	 */
	@ApiField("fulfillment_amount")
	private String fulfillmentAmount;

	/**
	 * 是否异步支付，传入true时，表明本次期望走异步支付，会先将支付请求受理下来，再异步推进。商户可以通过交易的异步通知或者轮询交易的状态来确定最终的交易结果
	 */
	@ApiField("is_async_pay")
	private Boolean isAsyncPay;

	/**
	 * 订单支付模式。特殊支付场景才需要传入。具体传参需与支付宝约定。
CREDIT_FULFILLMENT_ZM表示基于芝麻授信的履约支付模式，比如芝麻先用后付产品。
	 */
	@ApiField("order_pay_mode")
	private String orderPayMode;

	/**
	 * 商户请求号，标识一次请求的唯一id，用于幂等控制。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]

注：
1.用于校验与已存交易中的金额是否相等
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAdvancePaymentType() {
		return this.advancePaymentType;
	}
	public void setAdvancePaymentType(String advancePaymentType) {
		this.advancePaymentType = advancePaymentType;
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

	public List<BuyerPayDetail> getBuyerPayDetail() {
		return this.buyerPayDetail;
	}
	public void setBuyerPayDetail(List<BuyerPayDetail> buyerPayDetail) {
		this.buyerPayDetail = buyerPayDetail;
	}

	public String getFulfillmentAmount() {
		return this.fulfillmentAmount;
	}
	public void setFulfillmentAmount(String fulfillmentAmount) {
		this.fulfillmentAmount = fulfillmentAmount;
	}

	public Boolean getIsAsyncPay() {
		return this.isAsyncPay;
	}
	public void setIsAsyncPay(Boolean isAsyncPay) {
		this.isAsyncPay = isAsyncPay;
	}

	public String getOrderPayMode() {
		return this.orderPayMode;
	}
	public void setOrderPayMode(String orderPayMode) {
		this.orderPayMode = orderPayMode;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
