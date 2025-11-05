package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝直连商户进件
 *
 * @author auto create
 * @since 1.0, 2025-01-09 09:48:51
 */
public class AntMerchantExpandDirectAgentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3559412139177621866L;

	/**
	 * 实际被商户授权的服务商appId，商户将授权给该appId代商户发起交易。该应用ID需为第三方应用类型。
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/**
	 * 营业执照法人支付宝账号对应的手机号
	 */
	@ApiField("business_license_mobile")
	private String businessLicenseMobile;

	/**
	 * 营业执照号码
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * 营业执照图片，需使用图片上传接口返回的image_id，图片最小5KB ，最大5M（暂不限制图片宽高）。
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 商户联系人信息，包含联系人名称、手机、邮箱信息。联系人信息将用于接受进件的重要通知，如确认协议等。
	 */
	@ApiField("contact_info")
	private MerchantContact contactInfo;

	/**
	 * 营业期限，非长期有效营业执照的营业截止日期，需yyyy-mm-dd格式
	 */
	@ApiField("date_limitation")
	private String dateLimitation;

	/**
	 * 商户在服务商处的唯一id，每个外部商户号只能进件成功一次
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商机线索，每个商机线索只能在进件失败时可以复用
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 营业期限是否长期有效
	 */
	@ApiField("long_term")
	private Boolean longTerm;

	/**
	 * 参见<a href="https://opendocs.alipay.com/common/02khjv">商家经营类目2.0</a>中的“一级类目code_二级类目code”。
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 商户支付宝账号，一般为手机号或邮箱
	 */
	@ApiField("merchant_account")
	private String merchantAccount;

	/**
	 * 服务商侧申请单号ID，每次申请都需保持唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 店铺地址
	 */
	@ApiField("shop_address")
	private DirectAddressInfo shopAddress;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺内景图片
	 */
	@ApiField("shop_scene_pic")
	private String shopScenePic;

	/**
	 * 店铺门头照图片
	 */
	@ApiField("shop_sign_board_pic")
	private String shopSignBoardPic;

	/**
	 * 企业特殊资质图片，可参考<a href="https://opendocs.alipay.com/common/02khjv">商家经营类目2.0</a>中的“所需资质”。需使用图片上传接口返回的image_id，图片最小5KB ，最大5M（暂不限制图片宽高）。
	 */
	@ApiField("special_license_pic")
	private String specialLicensePic;

	public String getAuthAppId() {
		return this.authAppId;
	}
	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}

	public String getBusinessLicenseMobile() {
		return this.businessLicenseMobile;
	}
	public void setBusinessLicenseMobile(String businessLicenseMobile) {
		this.businessLicenseMobile = businessLicenseMobile;
	}

	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}
	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

	public String getBusinessLicensePic() {
		return this.businessLicensePic;
	}
	public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}

	public MerchantContact getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(MerchantContact contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getDateLimitation() {
		return this.dateLimitation;
	}
	public void setDateLimitation(String dateLimitation) {
		this.dateLimitation = dateLimitation;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public Boolean getLongTerm() {
		return this.longTerm;
	}
	public void setLongTerm(Boolean longTerm) {
		this.longTerm = longTerm;
	}

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getMerchantAccount() {
		return this.merchantAccount;
	}
	public void setMerchantAccount(String merchantAccount) {
		this.merchantAccount = merchantAccount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public DirectAddressInfo getShopAddress() {
		return this.shopAddress;
	}
	public void setShopAddress(DirectAddressInfo shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopScenePic() {
		return this.shopScenePic;
	}
	public void setShopScenePic(String shopScenePic) {
		this.shopScenePic = shopScenePic;
	}

	public String getShopSignBoardPic() {
		return this.shopSignBoardPic;
	}
	public void setShopSignBoardPic(String shopSignBoardPic) {
		this.shopSignBoardPic = shopSignBoardPic;
	}

	public String getSpecialLicensePic() {
		return this.specialLicensePic;
	}
	public void setSpecialLicensePic(String specialLicensePic) {
		this.specialLicensePic = specialLicensePic;
	}

}
