package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更换发票抬头
 *
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:02
 */
public class AlipayCommerceTransportEtcenterpriseInvoicetitleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1375427674258427853L;

	/**
	 * 虚拟运单编码
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 购方单位地址
	 */
	@ApiField("buyer_addr")
	private String buyerAddr;

	/**
	 * 购方开户行
	 */
	@ApiField("buyer_bank")
	private String buyerBank;

	/**
	 * 购方银行账号
	 */
	@ApiField("buyer_bank_account")
	private String buyerBankAccount;

	/**
	 * 购方客户名称
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 购方客户名称
	 */
	@ApiField("buyer_tax_num")
	private String buyerTaxNum;

	/**
	 * 购方电话
	 */
	@ApiField("buyer_tel")
	private String buyerTel;

	/**
	 * 企业id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 发票接收邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 抬头类型
	 */
	@ApiField("title_type")
	private String titleType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getBuyerAddr() {
		return this.buyerAddr;
	}
	public void setBuyerAddr(String buyerAddr) {
		this.buyerAddr = buyerAddr;
	}

	public String getBuyerBank() {
		return this.buyerBank;
	}
	public void setBuyerBank(String buyerBank) {
		this.buyerBank = buyerBank;
	}

	public String getBuyerBankAccount() {
		return this.buyerBankAccount;
	}
	public void setBuyerBankAccount(String buyerBankAccount) {
		this.buyerBankAccount = buyerBankAccount;
	}

	public String getBuyerName() {
		return this.buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerTaxNum() {
		return this.buyerTaxNum;
	}
	public void setBuyerTaxNum(String buyerTaxNum) {
		this.buyerTaxNum = buyerTaxNum;
	}

	public String getBuyerTel() {
		return this.buyerTel;
	}
	public void setBuyerTel(String buyerTel) {
		this.buyerTel = buyerTel;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTitleType() {
		return this.titleType;
	}
	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
