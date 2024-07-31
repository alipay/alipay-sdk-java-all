package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 达尔文分桶查询
 *
 * @author auto create
 * @since 1.0, 2024-06-28 16:37:42
 */
public class AntfortuneStockDarwinQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7373849975854834252L;

	/**
	 * 签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 实验场景
	 */
	@ApiField("scenario")
	private String scenario;

	/**
	 * trace
	 */
	@ApiField("trace")
	private String trace;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getScenario() {
		return this.scenario;
	}
	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public String getTrace() {
		return this.trace;
	}
	public void setTrace(String trace) {
		this.trace = trace;
	}

}
