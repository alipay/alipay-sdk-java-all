package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * TPA渠道预授权状态同步
 *
 * @author auto create
 * @since 1.0, 2026-05-26 18:27:48
 */
public class AlipayCommerceMedicalInsuranceTpapreauthstatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3842369423544833538L;

	/**
	 * 押金额度,单位,元,人民币
	 */
	@ApiField("deposit_amount")
	private String depositAmount;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

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
	 * 垫资方
	 */
	@ApiField("tpa_id")
	private String tpaId;

	/**
	 * 支付宝用户的唯一ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDepositAmount() {
		return this.depositAmount;
	}
	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

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

	public String getTpaId() {
		return this.tpaId;
	}
	public void setTpaId(String tpaId) {
		this.tpaId = tpaId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
