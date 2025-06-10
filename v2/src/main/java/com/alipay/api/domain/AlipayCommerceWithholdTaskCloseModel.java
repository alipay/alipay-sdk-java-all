package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣任务取消
 *
 * @author auto create
 * @since 1.0, 2025-01-02 10:52:18
 */
public class AlipayCommerceWithholdTaskCloseModel extends AlipayObject {

	private static final long serialVersionUID = 6136144579979857645L;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 代扣任务ID
	 */
	@ApiField("withhold_no")
	private String withholdNo;

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getWithholdNo() {
		return this.withholdNo;
	}
	public void setWithholdNo(String withholdNo) {
		this.withholdNo = withholdNo;
	}

}
