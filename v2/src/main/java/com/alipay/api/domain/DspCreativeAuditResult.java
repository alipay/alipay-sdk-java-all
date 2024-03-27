package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意审核结果
 *
 * @author auto create
 * @since 1.0, 2023-05-18 11:46:19
 */
public class DspCreativeAuditResult extends AlipayObject {

	private static final long serialVersionUID = 4846288594749736846L;

	/**
	 * 创意id
	 */
	@ApiField("creative_id")
	private String creativeId;

	/**
	 * 标题不符合要求
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	/**
	 * 审核状态 0审核通过 1审核中 2审核拒绝
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 模版id，和样式相关
	 */
	@ApiField("template_id")
	private String templateId;

	public String getCreativeId() {
		return this.creativeId;
	}
	public void setCreativeId(String creativeId) {
		this.creativeId = creativeId;
	}

	public String getRefuseReason() {
		return this.refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
