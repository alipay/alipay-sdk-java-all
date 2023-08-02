package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商报名规则
 *
 * @author auto create
 * @since 1.0, 2022-02-23 11:50:46
 */
public class RecruitEnrollRule extends AlipayObject {

	private static final long serialVersionUID = 6388849969462918257L;

	/**
	 * 最大数量
	 */
	@ApiField("max_size")
	private Long maxSize;

	/**
	 * 最小数量
	 */
	@ApiField("min_size")
	private Long minSize;

	/**
	 * 是否必填
	 */
	@ApiField("required")
	private Boolean required;

	/**
	 * 规则数据
	 */
	@ApiField("rule_data")
	private RecruitEnrollRuleData ruleData;

	/**
	 * 招商报名时提交的内容类型:
券:VOUCHER;
小程序:MINI_APP;
报名商户:ENROLL_MERCHANT;
素材:MATERIAL;
活动城市:CITY;
	 */
	@ApiField("type")
	private String type;

	public Long getMaxSize() {
		return this.maxSize;
	}
	public void setMaxSize(Long maxSize) {
		this.maxSize = maxSize;
	}

	public Long getMinSize() {
		return this.minSize;
	}
	public void setMinSize(Long minSize) {
		this.minSize = minSize;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

	public RecruitEnrollRuleData getRuleData() {
		return this.ruleData;
	}
	public void setRuleData(RecruitEnrollRuleData ruleData) {
		this.ruleData = ruleData;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
