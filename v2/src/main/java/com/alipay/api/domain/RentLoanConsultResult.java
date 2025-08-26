package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资商通风控咨询结果
 *
 * @author auto create
 * @since 1.0, 2025-04-10 14:54:23
 */
public class RentLoanConsultResult extends AlipayObject {

	private static final long serialVersionUID = 3112956113988338913L;

	/**
	 * ALLOW：表示允许通过
FORBID：表示不允许通过
UN_KNOW：风险未知,无法识别
	 */
	@ApiField("consult_result")
	private String consultResult;

	/**
	 * 资方信息的pid
	 */
	@ApiField("invest_pid")
	private String investPid;

	public String getConsultResult() {
		return this.consultResult;
	}
	public void setConsultResult(String consultResult) {
		this.consultResult = consultResult;
	}

	public String getInvestPid() {
		return this.investPid;
	}
	public void setInvestPid(String investPid) {
		this.investPid = investPid;
	}

}
