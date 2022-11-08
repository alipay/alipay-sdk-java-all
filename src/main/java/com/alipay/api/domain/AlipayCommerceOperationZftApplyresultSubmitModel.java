package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消百万小店项目，直付通进件结果同步
 *
 * @author auto create
 * @since 1.0, 2022-02-16 11:41:41
 */
public class AlipayCommerceOperationZftApplyresultSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2615222312888714812L;

	/**
	 * 申请单创建时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 外部商户id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 申请单处理失败时，通过此此段返回具体的失败理由；与kf_audit_memo和kz_audit_memo配合使用
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 风控审核状态。CREATE：已创建待审批、SKIP：跳过风控审批步骤、PASS：风控审核通过、REJECT：风控审批拒绝
	 */
	@ApiField("fk_audit")
	private String fkAudit;

	/**
	 * 风控审批备注，如有则返回
	 */
	@ApiField("fk_audit_memo")
	private String fkAuditMemo;

	/**
	 * 客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝
	 */
	@ApiField("kz_audit")
	private String kzAudit;

	/**
	 * 客资审批备注，如有则返回
	 */
	@ApiField("kz_audit_memo")
	private String kzAuditMemo;

	/**
	 * 直付通进件单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 二级商户id。当总体申请状态status为99时，smid才算进件完成
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 直付通进件结果,99:已完结;-1:失败;031:审核中
	 */
	@ApiField("status")
	private String status;

	/**
	 * 二级商户确认状态。CREATE：已发起二级商户确认、SKIP：无需确认、FAIL：签约失败、NOT_CONFIRM：商户未确认、FINISH签约完成
	 */
	@ApiField("sub_confirm")
	private String subConfirm;

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getFkAudit() {
		return this.fkAudit;
	}
	public void setFkAudit(String fkAudit) {
		this.fkAudit = fkAudit;
	}

	public String getFkAuditMemo() {
		return this.fkAuditMemo;
	}
	public void setFkAuditMemo(String fkAuditMemo) {
		this.fkAuditMemo = fkAuditMemo;
	}

	public String getKzAudit() {
		return this.kzAudit;
	}
	public void setKzAudit(String kzAudit) {
		this.kzAudit = kzAudit;
	}

	public String getKzAuditMemo() {
		return this.kzAuditMemo;
	}
	public void setKzAuditMemo(String kzAuditMemo) {
		this.kzAuditMemo = kzAuditMemo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubConfirm() {
		return this.subConfirm;
	}
	public void setSubConfirm(String subConfirm) {
		this.subConfirm = subConfirm;
	}

}
