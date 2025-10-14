package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业经营异常明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:27:19
 */
public class EpOperationAbnormalInfo extends AlipayObject {

	private static final long serialVersionUID = 5713178999918563448L;

	/**
	 * 作出决定机关列入
	 */
	@ApiField("decision_making_organ_in")
	private String decisionMakingOrganIn;

	/**
	 * 作出决定机关(移出)
	 */
	@ApiField("decision_making_organ_out")
	private String decisionMakingOrganOut;

	/**
	 * 异常原因
	 */
	@ApiField("error_reason")
	private String errorReason;

	/**
	 * 列入日期
	 */
	@ApiField("in_date")
	private String inDate;

	/**
	 * 移出日期
	 */
	@ApiField("out_date")
	private String outDate;

	/**
	 * 移出原因
	 */
	@ApiField("out_reason")
	private String outReason;

	public String getDecisionMakingOrganIn() {
		return this.decisionMakingOrganIn;
	}
	public void setDecisionMakingOrganIn(String decisionMakingOrganIn) {
		this.decisionMakingOrganIn = decisionMakingOrganIn;
	}

	public String getDecisionMakingOrganOut() {
		return this.decisionMakingOrganOut;
	}
	public void setDecisionMakingOrganOut(String decisionMakingOrganOut) {
		this.decisionMakingOrganOut = decisionMakingOrganOut;
	}

	public String getErrorReason() {
		return this.errorReason;
	}
	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}

	public String getInDate() {
		return this.inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	public String getOutDate() {
		return this.outDate;
	}
	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	public String getOutReason() {
		return this.outReason;
	}
	public void setOutReason(String outReason) {
		this.outReason = outReason;
	}

}
