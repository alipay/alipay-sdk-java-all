package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * TPA渠道预授权状态同步
 *
 * @author auto create
 * @since 1.0, 2026-10-21 21:42:55
 */
public class AlipayCommerceMedicalInsuranceTpapreauthstatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2786999548548751643L;

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
	 * null
	 */
	@ApiListField("pre_auth_info_list")
	@ApiField("insurance_pre_auth_info")
	private List<InsurancePreAuthInfo> preAuthInfoList;

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

	public List<InsurancePreAuthInfo> getPreAuthInfoList() {
		return this.preAuthInfoList;
	}
	public void setPreAuthInfoList(List<InsurancePreAuthInfo> preAuthInfoList) {
		this.preAuthInfoList = preAuthInfoList;
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
