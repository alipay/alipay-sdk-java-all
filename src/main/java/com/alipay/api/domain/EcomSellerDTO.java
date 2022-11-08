package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商卖家模型
 *
 * @author auto create
 * @since 1.0, 2022-10-27 14:04:09
 */
public class EcomSellerDTO extends AlipayObject {

	private static final long serialVersionUID = 2698623119383616817L;

	/**
	 * 支付宝账号id
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 支付宝账号id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 卖家标
	 */
	@ApiField("attributes")
	private String attributes;

	/**
	 * 银行卡持卡人姓名:资金账号类型为银行卡时，必传
	 */
	@ApiField("bank_card_holder_name")
	private String bankCardHolderName;

	/**
	 * 银行卡号:资金账号类型为银行卡时，必传
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
	 * 资金账号类型 （BANK/ALIPAY）
	 */
	@ApiField("bill_account_type")
	private String billAccountType;

	/**
	 * 证件号:身份证号
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 实名证件类型:RESIDENT 身份证号
	 */
	@ApiField("id_card_type")
	private String idCardType;

	/**
	 * 卖家主营类目的平台全量订单数（近30天）
	 */
	@ApiField("main_cat_order_count_of_platform")
	private Long mainCatOrderCountOfPlatform;

	/**
	 * 卖家主营类目的平台全量订单退换货率（近30天）
	 */
	@ApiField("main_cat_refund_exchange_rate_of_platform")
	private String mainCatRefundExchangeRateOfPlatform;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 卖家真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 卖家id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 卖家昵称
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 卖家历史90天完结父订单数
	 */
	@ApiField("seller_order_count")
	private Long sellerOrderCount;

	/**
	 * 卖家历史90天完结父订单退换货率
	 */
	@ApiField("seller_order_refund_exchange_rate")
	private String sellerOrderRefundExchangeRate;

	/**
	 * 卖家用户类型:OTHER 其它第三方账号
	 */
	@ApiField("seller_user_type")
	private String sellerUserType;

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAttributes() {
		return this.attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
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

	public Long getMainCatOrderCountOfPlatform() {
		return this.mainCatOrderCountOfPlatform;
	}
	public void setMainCatOrderCountOfPlatform(Long mainCatOrderCountOfPlatform) {
		this.mainCatOrderCountOfPlatform = mainCatOrderCountOfPlatform;
	}

	public String getMainCatRefundExchangeRateOfPlatform() {
		return this.mainCatRefundExchangeRateOfPlatform;
	}
	public void setMainCatRefundExchangeRateOfPlatform(String mainCatRefundExchangeRateOfPlatform) {
		this.mainCatRefundExchangeRateOfPlatform = mainCatRefundExchangeRateOfPlatform;
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

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public Long getSellerOrderCount() {
		return this.sellerOrderCount;
	}
	public void setSellerOrderCount(Long sellerOrderCount) {
		this.sellerOrderCount = sellerOrderCount;
	}

	public String getSellerOrderRefundExchangeRate() {
		return this.sellerOrderRefundExchangeRate;
	}
	public void setSellerOrderRefundExchangeRate(String sellerOrderRefundExchangeRate) {
		this.sellerOrderRefundExchangeRate = sellerOrderRefundExchangeRate;
	}

	public String getSellerUserType() {
		return this.sellerUserType;
	}
	public void setSellerUserType(String sellerUserType) {
		this.sellerUserType = sellerUserType;
	}

}
