package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商代开通”连锁品牌“解决方案
 *
 * @author auto create
 * @since 1.0, 2026-01-06 09:42:42
 */
public class AlipayOpenSpInteopBrandchainCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2756926221744669926L;

	/**
	 * 银行卡信息
	 */
	@ApiField("bank_card_info")
	private BrandChainBankCardInfo bankCardInfo;

	/**
	 * 品牌小程序appId
	 */
	@ApiField("brand_app_id")
	private String brandAppId;

	/**
	 * 商户营业执照信息
	 */
	@ApiField("business_license_info")
	private BusinessLicenseInfo businessLicenseInfo;

	/**
	 * 商家联系方式
	 */
	@ApiField("contact_info")
	private BrandChainContactInfo contactInfo;

	/**
	 * 当面付产品费率，单位：只可以小数不能填百分号，最多小数点后两位，范围为0.38～1.0。
	 */
	@ApiField("face_to_face_rate")
	private String faceToFaceRate;

	/**
	 * 一体化作业开通主单号，单号为服务商一体化作业主单创建返回值。
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	/**
	 * jsapi支付产品费率值，单位：只可以小数不能填百分号，最多小数点后两位，范围为0.38～1.0。
	 */
	@ApiField("jsapi_pay_rate")
	private String jsapiPayRate;

	/**
	 * 商家经营类目编码。参见 <a href="https://opendocs.alipay.com/common/02khjv">商家经营类目2.0</a> 中的“一级类目code_二级类目code”。
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 店铺信息
	 */
	@ApiField("shop_info")
	private BrandChainShopInfo shopInfo;

	/**
	 * 特殊行业资质信息
	 */
	@ApiField("special_license_info")
	private SpecialLicenseInfo specialLicenseInfo;

	public BrandChainBankCardInfo getBankCardInfo() {
		return this.bankCardInfo;
	}
	public void setBankCardInfo(BrandChainBankCardInfo bankCardInfo) {
		this.bankCardInfo = bankCardInfo;
	}

	public String getBrandAppId() {
		return this.brandAppId;
	}
	public void setBrandAppId(String brandAppId) {
		this.brandAppId = brandAppId;
	}

	public BusinessLicenseInfo getBusinessLicenseInfo() {
		return this.businessLicenseInfo;
	}
	public void setBusinessLicenseInfo(BusinessLicenseInfo businessLicenseInfo) {
		this.businessLicenseInfo = businessLicenseInfo;
	}

	public BrandChainContactInfo getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(BrandChainContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getFaceToFaceRate() {
		return this.faceToFaceRate;
	}
	public void setFaceToFaceRate(String faceToFaceRate) {
		this.faceToFaceRate = faceToFaceRate;
	}

	public String getInteopOrderNo() {
		return this.inteopOrderNo;
	}
	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}

	public String getJsapiPayRate() {
		return this.jsapiPayRate;
	}
	public void setJsapiPayRate(String jsapiPayRate) {
		this.jsapiPayRate = jsapiPayRate;
	}

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public BrandChainShopInfo getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(BrandChainShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

	public SpecialLicenseInfo getSpecialLicenseInfo() {
		return this.specialLicenseInfo;
	}
	public void setSpecialLicenseInfo(SpecialLicenseInfo specialLicenseInfo) {
		this.specialLicenseInfo = specialLicenseInfo;
	}

}
