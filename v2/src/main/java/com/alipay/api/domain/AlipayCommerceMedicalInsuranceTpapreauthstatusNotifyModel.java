package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * TPA渠道预授权状态同步
 *
 * @author auto create
 * @since 1.0, 2025-12-26 19:17:44
 */
public class AlipayCommerceMedicalInsuranceTpapreauthstatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1276738942236934688L;

	/**
	 * 支付宝用户的唯一ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 预授权申请单号
	 */
	@ApiField("pre_auth_audit_status")
	private String preAuthAuditStatus;

	/**
	 * 预授权申请单号
	 */
	@ApiField("pre_auth_audit_status_msg")
	private String preAuthAuditStatusMsg;

	/**
	 * 预授权申请单号
	 */
	@ApiField("pre_auth_no")
	private String preAuthNo;

	/**
	 * 单位：元，保留2位小数
	 */
	@ApiField("pre_auth_quota")
	private String preAuthQuota;

	/**
	 * 支付宝用户的唯一ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPreAuthAuditStatus() {
		return this.preAuthAuditStatus;
	}
	public void setPreAuthAuditStatus(String preAuthAuditStatus) {
		this.preAuthAuditStatus = preAuthAuditStatus;
	}

	public String getPreAuthAuditStatusMsg() {
		return this.preAuthAuditStatusMsg;
	}
	public void setPreAuthAuditStatusMsg(String preAuthAuditStatusMsg) {
		this.preAuthAuditStatusMsg = preAuthAuditStatusMsg;
	}

	public String getPreAuthNo() {
		return this.preAuthNo;
	}
	public void setPreAuthNo(String preAuthNo) {
		this.preAuthNo = preAuthNo;
	}

	public String getPreAuthQuota() {
		return this.preAuthQuota;
	}
	public void setPreAuthQuota(String preAuthQuota) {
		this.preAuthQuota = preAuthQuota;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
