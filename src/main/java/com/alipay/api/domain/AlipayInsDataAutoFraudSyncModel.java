package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 案件欺诈调查结果同步
 *
 * @author auto create
 * @since 1.0, 2018-04-02 15:23:43
 */
public class AlipayInsDataAutoFraudSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4814515368425493248L;

	/**
	 * 减损金额，单位：元
	 */
	@ApiField("avoid_loss_amount")
	private String avoidLossAmount;

	/**
	 * 减损类型，见码表《反欺诈减损类型V1》
	 */
	@ApiField("avoid_loss_type")
	private String avoidLossType;

	/**
	 * 结案金额，单位：元
	 */
	@ApiField("case_end_amount")
	private String caseEndAmount;

	/**
	 * 保司在案件调查时最终使用的欺诈分结果对应的查询请求号。
如果该案件未使用蚂蚁车险欺诈分查询结果，可以不传该字段。
	 */
	@ApiField("fraud_query_request_no")
	private String fraudQueryRequestNo;

	/**
	 * 案件欺诈结果，枚举值如下
FRAUD:欺诈
NON_FRAUD:非欺诈
	 */
	@ApiField("fraud_result")
	private String fraudResult;

	/**
	 * 报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 请求号，每次请求需唯一
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 同步类型，新增或修改，目前只允许修改一次

NEW:新增
MODIFY:修改
	 */
	@ApiField("syn_type")
	private String synType;

	public String getAvoidLossAmount() {
		return this.avoidLossAmount;
	}
	public void setAvoidLossAmount(String avoidLossAmount) {
		this.avoidLossAmount = avoidLossAmount;
	}

	public String getAvoidLossType() {
		return this.avoidLossType;
	}
	public void setAvoidLossType(String avoidLossType) {
		this.avoidLossType = avoidLossType;
	}

	public String getCaseEndAmount() {
		return this.caseEndAmount;
	}
	public void setCaseEndAmount(String caseEndAmount) {
		this.caseEndAmount = caseEndAmount;
	}

	public String getFraudQueryRequestNo() {
		return this.fraudQueryRequestNo;
	}
	public void setFraudQueryRequestNo(String fraudQueryRequestNo) {
		this.fraudQueryRequestNo = fraudQueryRequestNo;
	}

	public String getFraudResult() {
		return this.fraudResult;
	}
	public void setFraudResult(String fraudResult) {
		this.fraudResult = fraudResult;
	}

	public String getReportNo() {
		return this.reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getSynType() {
		return this.synType;
	}
	public void setSynType(String synType) {
		this.synType = synType;
	}

}
