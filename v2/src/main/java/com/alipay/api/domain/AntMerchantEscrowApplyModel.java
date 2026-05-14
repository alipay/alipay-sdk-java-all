package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 担保商户签约入驻
 *
 * @author auto create
 * @since 1.0, 2026-03-30 22:06:39
 */
public class AntMerchantEscrowApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1126845917364178639L;

	/**
	 * 经营信息
	 */
	@ApiField("business_info")
	private EscrowBusinessInfo businessInfo;

	/**
	 * 银行卡信息
	 */
	@ApiField("card_info")
	private EscrowSettleCardInfo cardInfo;

	/**
	 * 联系人信息
	 */
	@ApiField("contact_info")
	private EscrowContactInfo contactInfo;

	/**
	 * 认证信息
	 */
	@ApiField("license")
	private EscrowLicense license;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 平台ppid
	 */
	@ApiField("platform_partner_id")
	private String platformPartnerId;

	/**
	 * 卖家店铺名称
	 */
	@ApiField("seller_shop_name")
	private String sellerShopName;

	/**
	 * 1 企业, 2 个人
	 */
	@ApiField("seller_type")
	private String sellerType;

	/**
	 * 支付宝用户uid，16位2088
	 */
	@ApiField("seller_user_id")
	private String sellerUserId;

	/**
	 * 支付宝用户名称
	 */
	@ApiField("seller_user_name")
	private String sellerUserName;

	public EscrowBusinessInfo getBusinessInfo() {
		return this.businessInfo;
	}
	public void setBusinessInfo(EscrowBusinessInfo businessInfo) {
		this.businessInfo = businessInfo;
	}

	public EscrowSettleCardInfo getCardInfo() {
		return this.cardInfo;
	}
	public void setCardInfo(EscrowSettleCardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}

	public EscrowContactInfo getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(EscrowContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public EscrowLicense getLicense() {
		return this.license;
	}
	public void setLicense(EscrowLicense license) {
		this.license = license;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPlatformPartnerId() {
		return this.platformPartnerId;
	}
	public void setPlatformPartnerId(String platformPartnerId) {
		this.platformPartnerId = platformPartnerId;
	}

	public String getSellerShopName() {
		return this.sellerShopName;
	}
	public void setSellerShopName(String sellerShopName) {
		this.sellerShopName = sellerShopName;
	}

	public String getSellerType() {
		return this.sellerType;
	}
	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

	public String getSellerUserId() {
		return this.sellerUserId;
	}
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

	public String getSellerUserName() {
		return this.sellerUserName;
	}
	public void setSellerUserName(String sellerUserName) {
		this.sellerUserName = sellerUserName;
	}

}
