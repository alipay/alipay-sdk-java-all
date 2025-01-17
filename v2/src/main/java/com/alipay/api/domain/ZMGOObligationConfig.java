package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO模板的义务配置模型
 *
 * @author auto create
 * @since 1.0, 2022-11-24 10:55:35
 */
public class ZMGOObligationConfig extends AlipayObject {

	private static final long serialVersionUID = 4646982149144324625L;

	/**
	 * 芝麻GO管理页做任务按钮对应链接
	 */
	@ApiField("benefit_url")
	private String benefitUrl;

	/**
	 * 完成任务所需的最少额度，当obligation_template取值为：OBTL002时必传
	 */
	@ApiField("obligation_amount")
	private String obligationAmount;

	/**
	 * 承诺模式下，义务的类型，包含次数类型和金额类型：
    OBTL001("OBTL001", "在x时间内完成n次"),
    OBTL002("OBTL002", "在x时间内达到n元金额")
	 */
	@ApiField("obligation_template")
	private String obligationTemplate;

	/**
	 * 完成任务所需的最少次数，当obligation_template取值为：OBTL001时必填
	 */
	@ApiField("obligation_times")
	private String obligationTimes;

	/**
	 * 任务描述
	 */
	@ApiField("promise_type_desc")
	private String promiseTypeDesc;

	/**
	 * 芝麻GO管理页任务进度重定向链接
	 */
	@ApiField("task_progress_redirect_schema")
	private String taskProgressRedirectSchema;

	public String getBenefitUrl() {
		return this.benefitUrl;
	}
	public void setBenefitUrl(String benefitUrl) {
		this.benefitUrl = benefitUrl;
	}

	public String getObligationAmount() {
		return this.obligationAmount;
	}
	public void setObligationAmount(String obligationAmount) {
		this.obligationAmount = obligationAmount;
	}

	public String getObligationTemplate() {
		return this.obligationTemplate;
	}
	public void setObligationTemplate(String obligationTemplate) {
		this.obligationTemplate = obligationTemplate;
	}

	public String getObligationTimes() {
		return this.obligationTimes;
	}
	public void setObligationTimes(String obligationTimes) {
		this.obligationTimes = obligationTimes;
	}

	public String getPromiseTypeDesc() {
		return this.promiseTypeDesc;
	}
	public void setPromiseTypeDesc(String promiseTypeDesc) {
		this.promiseTypeDesc = promiseTypeDesc;
	}

	public String getTaskProgressRedirectSchema() {
		return this.taskProgressRedirectSchema;
	}
	public void setTaskProgressRedirectSchema(String taskProgressRedirectSchema) {
		this.taskProgressRedirectSchema = taskProgressRedirectSchema;
	}

}
