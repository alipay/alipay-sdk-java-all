package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告主资质
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:17:02
 */
public class AdUserQualification extends AlipayObject {

	private static final long serialVersionUID = 8862613636299296779L;

	/**
	 * 审核人员id
	 */
	@ApiField("approver")
	private String approver;

	/**
	 * 审核原因
	 */
	@ApiField("audit_reason")
	private String auditReason;

	/**
	 * 审核状态：0 审核通过、1 库存校验中、2运营审核中、3 审核拒绝
	 */
	@ApiField("audit_status")
	private Long auditStatus;

	/**
	 * 审核日期
	 */
	@ApiField("audit_time")
	private Long auditTime;

	/**
	 * 资质文件列表
	 */
	@ApiListField("file_url")
	@ApiField("string")
	private List<String> fileUrl;

	/**
	 * 资质id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 资质名称
	 */
	@ApiField("qualification_name")
	private String qualificationName;

	public String getApprover() {
		return this.approver;
	}
	public void setApprover(String approver) {
		this.approver = approver;
	}

	public String getAuditReason() {
		return this.auditReason;
	}
	public void setAuditReason(String auditReason) {
		this.auditReason = auditReason;
	}

	public Long getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(Long auditStatus) {
		this.auditStatus = auditStatus;
	}

	public Long getAuditTime() {
		return this.auditTime;
	}
	public void setAuditTime(Long auditTime) {
		this.auditTime = auditTime;
	}

	public List<String> getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(List<String> fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getQualificationName() {
		return this.qualificationName;
	}
	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}

}
