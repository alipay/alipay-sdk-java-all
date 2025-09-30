package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单支付
 *
 * @author auto create
 * @since 1.0, 2025-09-11 11:00:11
 */
public class AlipayCommerceRentOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 4885818425531214378L;

	/**
	 * 租赁售后单号
	 */
	@ApiField("aftersale_id")
	private String aftersaleId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 租金支付外部请求号，由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付金额，单位：元，精确到小数点后两位。
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 订单费用项明细列表
	 */
	@ApiListField("pay_items")
	@ApiField("rent_pay_item_d_t_o")
	private List<RentPayItemDTO> payItems;

	/**
	 * 支付方式
	 */
	@ApiField("pay_method")
	private String payMethod;

	/**
	 * 支付宝服务器主动通知商户服务器里指定的页面http/https路径
	 */
	@ApiField("pay_notify_url")
	private String payNotifyUrl;

	/**
	 * 从交易创建时间开始计算。 该笔支付允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。 租赁代扣默认值为5m、JSAPI支付默认值30m
	 */
	@ApiField("pay_timeout_express")
	private String payTimeoutExpress;

	/**
	 * 扣款原因编码
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 扣款原因说明
	 */
	@ApiField("reason_desc")
	private String reasonDesc;

	/**
	 * 二级商户信息
	 */
	@ApiField("sub_merchant")
	private RentSubMerchantDTO subMerchant;

	public String getAftersaleId() {
		return this.aftersaleId;
	}
	public void setAftersaleId(String aftersaleId) {
		this.aftersaleId = aftersaleId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public List<RentPayItemDTO> getPayItems() {
		return this.payItems;
	}
	public void setPayItems(List<RentPayItemDTO> payItems) {
		this.payItems = payItems;
	}

	public String getPayMethod() {
		return this.payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getPayNotifyUrl() {
		return this.payNotifyUrl;
	}
	public void setPayNotifyUrl(String payNotifyUrl) {
		this.payNotifyUrl = payNotifyUrl;
	}

	public String getPayTimeoutExpress() {
		return this.payTimeoutExpress;
	}
	public void setPayTimeoutExpress(String payTimeoutExpress) {
		this.payTimeoutExpress = payTimeoutExpress;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReasonDesc() {
		return this.reasonDesc;
	}
	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

	public RentSubMerchantDTO getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(RentSubMerchantDTO subMerchant) {
		this.subMerchant = subMerchant;
	}

}
