package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-18 14:17:36
 */
public class RentGovernanceInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1441278759989554135L;

	/**
	 * 治理处置方式
	 */
	@ApiField("punishment")
	private String punishment;

	/**
	 * 建议措施
	 */
	@ApiField("suggestion")
	private String suggestion;

	/**
	 * 结合治理维度，共同标识出治理的目标对象
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * bySubMerchantUSCC 表示二级商户统社码维度
	 */
	@ApiField("target_type")
	private String targetType;

	/**
	 * 违规内容描述
	 */
	@ApiField("violation_desc")
	private String violationDesc;

	public String getPunishment() {
		return this.punishment;
	}
	public void setPunishment(String punishment) {
		this.punishment = punishment;
	}

	public String getSuggestion() {
		return this.suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getViolationDesc() {
		return this.violationDesc;
	}
	public void setViolationDesc(String violationDesc) {
		this.violationDesc = violationDesc;
	}

}
