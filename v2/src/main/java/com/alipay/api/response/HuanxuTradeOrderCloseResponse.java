package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExtContext;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: huanxu.trade.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:34
 */
public class HuanxuTradeOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3339194288591918233L;

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
	 * 支付id，焕旭针对每一笔支付请求生成的唯一支付凭证
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

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentId( ) {
		return this.paymentId;
	}

}
