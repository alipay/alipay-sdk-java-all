package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 达尔文分桶查询
 *
 * @author auto create
 * @since 1.0, 2024-08-01 16:59:17
 */
public class AntfortuneStockDarwinQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6272791622493316639L;

	/**
	 * 签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * icrowd人群id
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 实验场景
	 */
	@ApiField("scenario")
	private String scenario;

	/**
	 * 调用trace
	 */
	@ApiField("trace")
	private String trace;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
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
