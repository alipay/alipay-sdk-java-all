package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 课程签到码查询
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:57:55
 */
public class AlipayCommerceEducateCourseCheckincodeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6718253854228211582L;

	/**
	 * 课程签到规则ID
	 */
	@ApiField("course_rule_id")
	private String courseRuleId;

	/**
	 * 课程签到规则名称
	 */
	@ApiField("course_rule_name")
	private String courseRuleName;

	/**
	 * 启用状态
	 */
	@ApiField("enable_status")
	private Boolean enableStatus;

	/**
	 * 机构内标，取值为学校内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 分页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

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

	public String getCourseRuleName() {
		return this.courseRuleName;
	}
	public void setCourseRuleName(String courseRuleName) {
		this.courseRuleName = courseRuleName;
	}

	public Boolean getEnableStatus() {
		return this.enableStatus;
	}
	public void setEnableStatus(Boolean enableStatus) {
		this.enableStatus = enableStatus;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRosterId() {
		return this.rosterId;
	}
	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}

}
