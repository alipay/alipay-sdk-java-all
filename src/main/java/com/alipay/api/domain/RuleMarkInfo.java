package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打标对象信息
 *
 * @author auto create
 * @since 1.0, 2022-04-13 10:45:12
 */
public class RuleMarkInfo extends AlipayObject {

	private static final long serialVersionUID = 7871246561593625733L;

	/**
	 * 机审反馈内容。一般当机审有误时，补充具体机审有误的说明。
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * CORRECT-机审正确；ERROR-机审有误
	 */
	@ApiField("mark_result")
	private String markResult;

	/**
	 * 规则编码
	 */
	@ApiField("rule_code")
	private String ruleCode;

	/**
	 * 规则机审状态，机审通过/机审驳回 ROBOT_PASS/ROBOT_REVIEW_REJECT 来源解语花审核规则查询接口返回的ruleInfo下的status
	 */
	@ApiField("status")
	private String status;

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getMarkResult() {
		return this.markResult;
	}
	public void setMarkResult(String markResult) {
		this.markResult = markResult;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}
	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
