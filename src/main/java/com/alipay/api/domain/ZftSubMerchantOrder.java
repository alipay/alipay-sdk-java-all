package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通二级商户进件申请单信息
 *
 * @author auto create
 * @since 1.0, 2021-08-02 14:59:16
 */
public class ZftSubMerchantOrder extends AlipayObject {

	private static final long serialVersionUID = 5615276917126177651L;

	/**
	 * 是否开通线上预授权
	 */
	@ApiField("app_pre_auth")
	private String appPreAuth;

	/**
	 * 申请单创建时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 本申请单的请求类型。一般可选值包括ZHIFUTONG_CONSULT（直付通商户预校验）/ZHIFUTONG_CREATE（直付通商户创建）/ZHIFUTONG_MODIFY（直付通商户修改）
	 */
	@ApiField("apply_type")
	private String applyType;

	/**
	 * 进件生成的卡编号，在发起结算时可以作为结算账号
	 */
	@ApiField("card_alias_no")
	private String cardAliasNo;

	/**
	 * 外部商户id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 是否开通线下预授权
	 */
	@ApiField("face_pre_auth")
	private String facePreAuth;

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
	 * 判断个人当面付权限版本，返回TRUE时表示是标准版，返回FALSE表示受限版
	 */
	@ApiField("is_face_limit")
	private String isFaceLimit;

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
	 * 进件时填写的商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 申请单处理失败时，通过此此段返回具体的失败理由；与kf_audit_memo和kz_audit_memo配合使用
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 二级商户id。当总体申请状态status为99时，smid才算进件完成
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 申请总体状态。99:已完结;-1:失败;031:审核中
	 */
	@ApiField("status")
	private String status;

	/**
	 * 二级商户确认状态。CREATE：已发起二级商户确认、SKIP：无需确认、FAIL：签约失败、NOT_CONFIRM：商户未确认、FINISH签约完成
	 */
	@ApiField("sub_confirm")
	private String subConfirm;

	public String getAppPreAuth() {
		return this.appPreAuth;
	}
	public void setAppPreAuth(String appPreAuth) {
		this.appPreAuth = appPreAuth;
	}

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getApplyType() {
		return this.applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getCardAliasNo() {
		return this.cardAliasNo;
	}
	public void setCardAliasNo(String cardAliasNo) {
		this.cardAliasNo = cardAliasNo;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getFacePreAuth() {
		return this.facePreAuth;
	}
	public void setFacePreAuth(String facePreAuth) {
		this.facePreAuth = facePreAuth;
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

	public String getIsFaceLimit() {
		return this.isFaceLimit;
	}
	public void setIsFaceLimit(String isFaceLimit) {
		this.isFaceLimit = isFaceLimit;
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

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
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
