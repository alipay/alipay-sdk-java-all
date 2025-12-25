package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户活动模型
 *
 * @author auto create
 * @since 1.0, 2025-08-22 11:06:40
 */
public class EduSmActivityDTO extends AlipayObject {

	private static final long serialVersionUID = 6141887435146754245L;

	/**
	 * 活动码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 审核时间
	 */
	@ApiField("audit_date")
	private Date auditDate;

	/**
	 * 审批流审核备注信息
	 */
	@ApiField("audit_memo")
	private String auditMemo;

	/**
	 * 业务码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 服务商PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 间联商户名称
	 */
	@ApiField("sm_cn_name")
	private String smCnName;

	/**
	 * 间联商户ID
	 */
	@ApiField("sm_id")
	private String smId;

	/**
	 * 间联商户级别
	 */
	@ApiField("sm_level")
	private String smLevel;

	/**
	 * 间联商户经营类目
	 */
	@ApiField("sm_mcc")
	private String smMcc;

	/**
	 * 间联商户经营类目名称
	 */
	@ApiField("sm_mcc_name")
	private String smMccName;

	/**
	 * 间联商户新经营类目
	 */
	@ApiField("sm_new_mcc")
	private String smNewMcc;

	/**
	 * 间联商户新经营类目名称
	 */
	@ApiField("sm_new_mcc_name")
	private String smNewMccName;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public Date getAuditDate() {
		return this.auditDate;
	}
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public String getAuditMemo() {
		return this.auditMemo;
	}
	public void setAuditMemo(String auditMemo) {
		this.auditMemo = auditMemo;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getSmCnName() {
		return this.smCnName;
	}
	public void setSmCnName(String smCnName) {
		this.smCnName = smCnName;
	}

	public String getSmId() {
		return this.smId;
	}
	public void setSmId(String smId) {
		this.smId = smId;
	}

	public String getSmLevel() {
		return this.smLevel;
	}
	public void setSmLevel(String smLevel) {
		this.smLevel = smLevel;
	}

	public String getSmMcc() {
		return this.smMcc;
	}
	public void setSmMcc(String smMcc) {
		this.smMcc = smMcc;
	}

	public String getSmMccName() {
		return this.smMccName;
	}
	public void setSmMccName(String smMccName) {
		this.smMccName = smMccName;
	}

	public String getSmNewMcc() {
		return this.smNewMcc;
	}
	public void setSmNewMcc(String smNewMcc) {
		this.smNewMcc = smNewMcc;
	}

	public String getSmNewMccName() {
		return this.smNewMccName;
	}
	public void setSmNewMccName(String smNewMccName) {
		this.smNewMccName = smNewMccName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
