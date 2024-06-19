package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业注册申请信息
 *
 * @author auto create
 * @since 1.0, 2024-05-31 09:58:03
 */
public class RegisterApplyInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8847997841187927317L;

	/**
	 * 申请id
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 申请时间
	 */
	@ApiField("apply_time")
	private String applyTime;

	/**
	 * 审核备注
	 */
	@ApiField("audit_remark")
	private String auditRemark;

	/**
	 * 审核状态
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 审核时间
	 */
	@ApiField("audit_time")
	private String auditTime;

	/**
	 * 企业简称
	 */
	@ApiField("enterprise_alias")
	private String enterpriseAlias;

	/**
	 * 企业邮箱
	 */
	@ApiField("enterprise_email")
	private String enterpriseEmail;

	/**
	 * 审核通过后注册成功的企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 上级企业id
	 */
	@ApiField("parent_enterprise_id")
	private String parentEnterpriseId;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}

	public String getAuditRemark() {
		return this.auditRemark;
	}
	public void setAuditRemark(String auditRemark) {
		this.auditRemark = auditRemark;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getAuditTime() {
		return this.auditTime;
	}
	public void setAuditTime(String auditTime) {
		this.auditTime = auditTime;
	}

	public String getEnterpriseAlias() {
		return this.enterpriseAlias;
	}
	public void setEnterpriseAlias(String enterpriseAlias) {
		this.enterpriseAlias = enterpriseAlias;
	}

	public String getEnterpriseEmail() {
		return this.enterpriseEmail;
	}
	public void setEnterpriseEmail(String enterpriseEmail) {
		this.enterpriseEmail = enterpriseEmail;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getParentEnterpriseId() {
		return this.parentEnterpriseId;
	}
	public void setParentEnterpriseId(String parentEnterpriseId) {
		this.parentEnterpriseId = parentEnterpriseId;
	}

}
