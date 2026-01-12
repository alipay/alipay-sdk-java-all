package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期单0元关单
 *
 * @author auto create
 * @since 1.0, 2025-05-13 15:07:25
 */
public class ZhimaCreditPayafterusePeriodCloseModel extends AlipayObject {

	private static final long serialVersionUID = 2534827112925425763L;

	/**
	 * 芝麻开通协议号
	 */
	@ApiField("auth_id")
	private String authId;

	/**
	 * 商户账期单号
	 */
	@ApiField("out_period_no")
	private String outPeriodNo;

	public String getAuthId() {
		return this.authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getOutPeriodNo() {
		return this.outPeriodNo;
	}
	public void setOutPeriodNo(String outPeriodNo) {
		this.outPeriodNo = outPeriodNo;
	}

}
