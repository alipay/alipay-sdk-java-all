package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务订单代扣接口
 *
 * @author auto create
 * @since 1.0, 2019-04-15 21:53:28
 */
public class AlipayMerchantOrderDeductPayModel extends AlipayObject {

	private static final long serialVersionUID = 7716229395249422183L;

	/**
	 * 本次代扣金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/**
	 * 支付宝内部业务订单编号，可以从对应的消息同步接口或查询接口获取。例如租享生活业务从同步消息接口alipay.merchant.order.changed获取订单的order_id，订单创建成功后会有消息发出，消息中包含order_id和创建订单时的out_biz_no。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户请求号，64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	public String getDeductAmount() {
		return this.deductAmount;
	}
	public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
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

}
