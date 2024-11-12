package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExtContext;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: huanxu.trade.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:02
 */
public class HuanxuTradeOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 5627883861873698145L;

	/** 
	 * 聚合支付的支付渠道，焕旭分配。
	 */
	@ApiField("channel")
	private String channel;

	/** 
	 * 用于透传扩展信息，pay_url为支付链接。
	 */
	@ApiField("ext_context")
	private ExtContext extContext;

	/** 
	 * 支付金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 支付请求号，对应一笔业务订单下的一次支付请求，不同支付请求需保证请求号唯一
	 */
	@ApiField("pay_request_no")
	private String payRequestNo;

	/** 
	 * 支付状态，目前支持如下值： WAIT（支付已受理），异步支付场景，受理成功后为该状态，业务上需等待后续的异步成功通知； SUCCESS（支付成功），该状态表示该笔支付已成功处理； FAIL（支付失败），该状态表示该笔支付已失败，并且不可重试，后续如果要重新支付，需要更换支付请求号。
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 支付id，焕旭针对每一笔支付请求生成的唯一支付凭证，后续打款和退款时候需带入此id
	 */
	@ApiField("payment_id")
	private String paymentId;

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel( ) {
		return this.channel;
	}

	public void setExtContext(ExtContext extContext) {
		this.extContext = extContext;
	}
	public ExtContext getExtContext( ) {
		return this.extContext;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setPayRequestNo(String payRequestNo) {
		this.payRequestNo = payRequestNo;
	}
	public String getPayRequestNo( ) {
		return this.payRequestNo;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getPayStatus( ) {
		return this.payStatus;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentId( ) {
		return this.paymentId;
	}

}
