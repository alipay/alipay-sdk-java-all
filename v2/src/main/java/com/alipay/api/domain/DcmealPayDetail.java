package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 食堂消费支付详情
 *
 * @author auto create
 * @since 1.0, 2024-03-01 17:28:05
 */
public class DcmealPayDetail extends AlipayObject {

	private static final long serialVersionUID = 1259433513847647818L;

	/**
	 * 支付金额，单位元，保留两位小数
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易traceId
	 */
	@ApiField("trace_no")
	private String traceNo;

	/**
	 * 点券/自付
	 */
	@ApiField("type")
	private String type;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTraceNo() {
		return this.traceNo;
	}
	public void setTraceNo(String traceNo) {
		this.traceNo = traceNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
