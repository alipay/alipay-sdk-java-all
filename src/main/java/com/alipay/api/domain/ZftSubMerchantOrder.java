package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通二级商户进件申请单信息
 *
 * @author auto create
 * @since 1.0, 2020-03-13 17:56:50
 */
public class ZftSubMerchantOrder extends AlipayObject {

	private static final long serialVersionUID = 3564697242224919975L;

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
