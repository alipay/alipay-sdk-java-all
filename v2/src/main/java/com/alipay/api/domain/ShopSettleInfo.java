package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店结算信息
 *
 * @author auto create
 * @since 1.0, 2026-04-08 14:01:03
 */
public class ShopSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 2313652155282519143L;

	/**
	 * 结算到户的账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 结算收款方主体类型，未准入可结算个人户的商户可忽略
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 门店结算银行卡信息（特殊可选），结算到卡时必填
	 */
	@ApiField("bank_cards")
	private ShopBankCard bankCards;

	/**
	 * 支付宝账号
	 */
	@ApiField("payee_account_no")
	private String payeeAccountNo;

	/**
	 * 身份证反面图片id，需传入ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。
	 */
	@ApiField("payee_identity_back_pic")
	private String payeeIdentityBackPic;

	/**
	 * 身份证正面图片id，需传入ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id
	 */
	@ApiField("payee_identity_front_pic")
	private String payeeIdentityFrontPic;

	/**
	 * 门头照图片id，需传入ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。
	 */
	@ApiField("shop_front_pic")
	private String shopFrontPic;

	/**
	 * 结算类型
	 */
	@ApiField("type")
	private String type;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public ShopBankCard getBankCards() {
		return this.bankCards;
	}
	public void setBankCards(ShopBankCard bankCards) {
		this.bankCards = bankCards;
	}

	public String getPayeeAccountNo() {
		return this.payeeAccountNo;
	}
	public void setPayeeAccountNo(String payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}

	public String getPayeeIdentityBackPic() {
		return this.payeeIdentityBackPic;
	}
	public void setPayeeIdentityBackPic(String payeeIdentityBackPic) {
		this.payeeIdentityBackPic = payeeIdentityBackPic;
	}

	public String getPayeeIdentityFrontPic() {
		return this.payeeIdentityFrontPic;
	}
	public void setPayeeIdentityFrontPic(String payeeIdentityFrontPic) {
		this.payeeIdentityFrontPic = payeeIdentityFrontPic;
	}

	public String getShopFrontPic() {
		return this.shopFrontPic;
	}
	public void setShopFrontPic(String shopFrontPic) {
		this.shopFrontPic = shopFrontPic;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
