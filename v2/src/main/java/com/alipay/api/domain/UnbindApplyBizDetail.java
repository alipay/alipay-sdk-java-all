package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消绑定明细
 *
 * @author auto create
 * @since 1.0, 2026-07-20 16:32:51
 */
public class UnbindApplyBizDetail extends AlipayObject {

	private static final long serialVersionUID = 1764669323148386241L;

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
	 * 取消类型
	 */
	@ApiField("type")
	private String type;

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
