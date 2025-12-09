package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣任务取消
 *
 * @author auto create
 * @since 1.0, 2025-06-19 13:47:33
 */
public class AlipayCommerceWithholdTaskCloseModel extends AlipayObject {

	private static final long serialVersionUID = 2521948175663897679L;

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
