package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解约结果回调明细
 *
 * @author auto create
 * @since 1.0, 2026-07-20 16:32:51
 */
public class UnbindCallbackBizDetail extends AlipayObject {

	private static final long serialVersionUID = 7215997643126665558L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 取消绑定结果
	 */
	@ApiField("unbind_result")
	private String unbindResult;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUnbindResult() {
		return this.unbindResult;
	}
	public void setUnbindResult(String unbindResult) {
		this.unbindResult = unbindResult;
	}

}
