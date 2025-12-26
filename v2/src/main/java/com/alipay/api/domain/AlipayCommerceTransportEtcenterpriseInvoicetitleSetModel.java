package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设置开票抬头
 *
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:03
 */
public class AlipayCommerceTransportEtcenterpriseInvoicetitleSetModel extends AlipayObject {

	private static final long serialVersionUID = 2676392112236372561L;

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
	 * 发票购方税号
	 */
	@ApiField("buyer_tax_num")
	private String buyerTaxNum;

	/**
	 * 电话号码
	 */
	@ApiField("buyer_tel")
	private String buyerTel;

	/**
	 * 企业id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 发票抬头类型
PERSON:个人  UNIT:单位
	 */
	@ApiField("title_type")
	private String titleType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

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
