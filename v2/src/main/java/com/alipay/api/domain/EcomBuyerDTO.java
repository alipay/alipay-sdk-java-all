package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台电商买家模型
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:08:56
 */
public class EcomBuyerDTO extends AlipayObject {

	private static final long serialVersionUID = 7873341678658412499L;

	/**
	 * 买家联系地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 支付宝账号id
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 支付宝登录账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 支付宝账号id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 银行卡持卡人姓名:资金账号类型为银行卡时，必传
	 */
	@ApiField("bank_card_holder_name")
	private String bankCardHolderName;

	/**
	 * 银行卡号: 资金账号类型为银行卡时，必传
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 银行id
	 */
	@ApiField("bank_id")
	private String bankId;

	/**
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 资金账号类型：ALIPAY， BANK
	 */
	@ApiField("bill_account_type")
	private String billAccountType;

	/**
	 * 买家协议保费
	 */
	@ApiField("buyer_agreement_premium")
	private Long buyerAgreementPremium;

	/**
	 * 买家协议保额
	 */
	@ApiField("buyer_agreement_sum_insured")
	private Long buyerAgreementSumInsured;

	/**
	 * 买家id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 买家历史365天完结父订单数
	 */
	@ApiField("buyer_order_count")
	private Long buyerOrderCount;

	/**
	 * 买家历史365天完结父订单退换货率
	 */
	@ApiField("buyer_order_refund_exchange_rate")
	private String buyerOrderRefundExchangeRate;

	/**
	 * 买家标签数据
	 */
	@ApiField("buyer_tag_data")
	private String buyerTagData;

	/**
	 * 买家淘宝id
	 */
	@ApiField("buyer_taobao_id")
	private String buyerTaobaoId;

	/**
	 * 身份证号
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 实名证件类型:RESIDENT 居民身份证
	 */
	@ApiField("id_card_type")
	private String idCardType;

	/**
	 * 买家手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 买家真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 买家用户类型:
OTHER 其他第三方账号
ALIPAY 支付宝账号
TAOBAO 淘宝账户
	 */
	@ApiField("user_type")
	private String userType;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getBankCardHolderName() {
		return this.bankCardHolderName;
	}
	public void setBankCardHolderName(String bankCardHolderName) {
		this.bankCardHolderName = bankCardHolderName;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankId() {
		return this.bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBillAccountType() {
		return this.billAccountType;
	}
	public void setBillAccountType(String billAccountType) {
		this.billAccountType = billAccountType;
	}

	public Long getBuyerAgreementPremium() {
		return this.buyerAgreementPremium;
	}
	public void setBuyerAgreementPremium(Long buyerAgreementPremium) {
		this.buyerAgreementPremium = buyerAgreementPremium;
	}

	public Long getBuyerAgreementSumInsured() {
		return this.buyerAgreementSumInsured;
	}
	public void setBuyerAgreementSumInsured(Long buyerAgreementSumInsured) {
		this.buyerAgreementSumInsured = buyerAgreementSumInsured;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Long getBuyerOrderCount() {
		return this.buyerOrderCount;
	}
	public void setBuyerOrderCount(Long buyerOrderCount) {
		this.buyerOrderCount = buyerOrderCount;
	}

	public String getBuyerOrderRefundExchangeRate() {
		return this.buyerOrderRefundExchangeRate;
	}
	public void setBuyerOrderRefundExchangeRate(String buyerOrderRefundExchangeRate) {
		this.buyerOrderRefundExchangeRate = buyerOrderRefundExchangeRate;
	}

	public String getBuyerTagData() {
		return this.buyerTagData;
	}
	public void setBuyerTagData(String buyerTagData) {
		this.buyerTagData = buyerTagData;
	}

	public String getBuyerTaobaoId() {
		return this.buyerTaobaoId;
	}
	public void setBuyerTaobaoId(String buyerTaobaoId) {
		this.buyerTaobaoId = buyerTaobaoId;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getIdCardType() {
		return this.idCardType;
	}
	public void setIdCardType(String idCardType) {
		this.idCardType = idCardType;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
