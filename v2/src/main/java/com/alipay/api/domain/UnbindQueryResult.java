package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解约查询明细
 *
 * @author auto create
 * @since 1.0, 2026-07-21 17:02:51
 */
public class UnbindQueryResult extends AlipayObject {

	private static final long serialVersionUID = 5392684657722189878L;

	/**
	 * 取消绑定结果
	 */
	@ApiField("cancel_bind_result")
	private String cancelBindResult;

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

	public String getCancelBindResult() {
		return this.cancelBindResult;
	}
	public void setCancelBindResult(String cancelBindResult) {
		this.cancelBindResult = cancelBindResult;
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

}
