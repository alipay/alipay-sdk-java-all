package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处方状态同步扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-11-14 15:17:11
 */
public class PlatformPrescriptionStatusExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8444949243569129942L;

	/**
	 * 审核失败原因
	 */
	@ApiField("audit_fail_reason")
	private String auditFailReason;

	/**
	 * 审方药师姓名
	 */
	@ApiField("audit_pharmacist_name")
	private String auditPharmacistName;

	/**
	 * 审核时间
	 */
	@ApiField("audit_time")
	private Date auditTime;

	/**
	 * 外部审方药师id
	 */
	@ApiField("out_audit_pharmacist_id")
	private String outAuditPharmacistId;

	public String getAuditFailReason() {
		return this.auditFailReason;
	}
	public void setAuditFailReason(String auditFailReason) {
		this.auditFailReason = auditFailReason;
	}

	public String getAuditPharmacistName() {
		return this.auditPharmacistName;
	}
	public void setAuditPharmacistName(String auditPharmacistName) {
		this.auditPharmacistName = auditPharmacistName;
	}

	public Date getAuditTime() {
		return this.auditTime;
	}
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public String getOutAuditPharmacistId() {
		return this.outAuditPharmacistId;
	}
	public void setOutAuditPharmacistId(String outAuditPharmacistId) {
		this.outAuditPharmacistId = outAuditPharmacistId;
	}

}
