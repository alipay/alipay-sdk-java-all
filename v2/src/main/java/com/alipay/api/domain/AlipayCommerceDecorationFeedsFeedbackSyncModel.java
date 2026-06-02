package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 家装线索反馈同步接口
 *
 * @author auto create
 * @since 1.0, 2026-02-10 15:47:43
 */
public class AlipayCommerceDecorationFeedsFeedbackSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4637562796494292229L;

	/**
	 * 线索分配给对应装企的原因
	 */
	@ApiField("assign_reason")
	private String assignReason;

	/**
	 * 装企id，装企唯一标识符，支付宝侧生成（请传递数字类型的字符串）
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * null
	 */
	@ApiListField("company_ids")
	@ApiField("string")
	private List<String> companyIds;

	/**
	 * 装修企业名称 当前字段已废弃(线索平台会根据装企ID去匹配上装企名称，该字段传递了也不会用到。)
	 */
	@ApiField("company_name")
	@Deprecated
	private String companyName;

	/**
	 * 反馈类型
	 */
	@ApiField("feedback_type")
	private String feedbackType;

	/**
	 * 线索id，线索唯一标识符，支付宝侧生成
	 */
	@ApiField("lead_id")
	private String leadId;

	/**
	 * 服务商id，服务商唯一标识符，支付宝侧生成 当前字段已废弃(线索ID会绑定上服务商ID，线索平台会使用线索ID绑定的服务商ID。这边传递服务商ID不会有任何作用。)
	 */
	@ApiField("provider_id")
	@Deprecated
	private String providerId;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 线索状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 线索是否有效
	 */
	@ApiField("valid")
	private String valid;

	public String getAssignReason() {
		return this.assignReason;
	}
	public void setAssignReason(String assignReason) {
		this.assignReason = assignReason;
	}

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public List<String> getCompanyIds() {
		return this.companyIds;
	}
	public void setCompanyIds(List<String> companyIds) {
		this.companyIds = companyIds;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFeedbackType() {
		return this.feedbackType;
	}
	public void setFeedbackType(String feedbackType) {
		this.feedbackType = feedbackType;
	}

	public String getLeadId() {
		return this.leadId;
	}
	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}

	public String getProviderId() {
		return this.providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getValid() {
		return this.valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}

}
