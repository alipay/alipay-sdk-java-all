package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询签到规则
 *
 * @author auto create
 * @since 1.0, 2025-06-18 17:16:58
 */
public class AlipayCommerceEducateCheckinRuleBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3898459671266449217L;

	/**
	 * 规则生效状态
	 */
	@ApiField("enable_status")
	private Boolean enableStatus;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 分页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 签到规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 签到规则类型
	 */
	@ApiField("rule_type")
	private String ruleType;

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

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

}
