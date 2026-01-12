package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 课程签到二维码查询
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:57:43
 */
public class AlipayCommerceEducateCourseCheckinqrcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4798886665575959869L;

	/**
	 * 课程签到规则ID
	 */
	@ApiField("course_rule_id")
	private String courseRuleId;

	/**
	 * 机构内标，取值来自学校内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 花名册ID
	 */
	@ApiField("roster_id")
	private String rosterId;

	public String getCourseRuleId() {
		return this.courseRuleId;
	}
	public void setCourseRuleId(String courseRuleId) {
		this.courseRuleId = courseRuleId;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getRosterId() {
		return this.rosterId;
	}
	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}

}
