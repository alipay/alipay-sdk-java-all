package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金流水平台驱动业务系统进行冲销结果
 *
 * @author auto create
 * @since 1.0, 2021-12-01 21:22:30
 */
public class LogWriteoffResult extends AlipayObject {

	private static final long serialVersionUID = 7812346572483767589L;

	/**
	 * 冲销业务失败原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 资金流水平台驱动业务系统进行冲销结果
	 */
	@ApiField("result")
	private String result;

	/**
	 * 冲销凭证ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
