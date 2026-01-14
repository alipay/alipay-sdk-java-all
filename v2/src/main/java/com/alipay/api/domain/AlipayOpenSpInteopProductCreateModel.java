package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商一体化开通作业添加产品开通项
 *
 * @author auto create
 * @since 1.0, 2026-01-09 18:33:09
 */
public class AlipayOpenSpInteopProductCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8827848267974178912L;

	/**
	 * app信息
	 */
	@ApiField("inteop_app_info")
	private InteOpAppInfo inteopAppInfo;

	/**
	 * 商户营业执照信息
	 */
	@ApiField("inteop_business_license_info")
	private InteOpBusinessLicenseInfo inteopBusinessLicenseInfo;

	/**
	 * h5信息
	 */
	@ApiField("inteop_h_5_info")
	private InteOpHtmlFiveInfo inteopH5Info;

	/**
	 * 商户基本信息
	 */
	@ApiField("inteop_merchant_info")
	private InteOpMerchantInfo inteopMerchantInfo;

	/**
	 * 小程序信息
	 */
	@ApiField("inteop_mini_app_info")
	private InteOpMiniAppInfo inteopMiniAppInfo;

	/**
	 * 业务开通单号
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	/**
	 * 产品开通明细信息，为空的话则默认开通产品下属所有明细
	 */
	@ApiListField("inteop_product_details")
	@ApiField("product_detail")
	private List<ProductDetail> inteopProductDetails;

	/**
	 * 产品费率明细信息
	 */
	@ApiListField("inteop_product_price_details")
	@ApiField("product_price_info")
	private List<ProductPriceInfo> inteopProductPriceDetails;

	/**
	 * 店铺信息
	 */
	@ApiField("inteop_shop_info")
	private InteOpShopInfo inteopShopInfo;

	/**
	 * 特殊行业资质信息
	 */
	@ApiField("inteop_special_license_info")
	private InteOpSpecialLicenseInfo inteopSpecialLicenseInfo;

	/**
	 * 网站信息
	 */
	@ApiField("inteop_web_site_info")
	private InteOpWebSiteInfo inteopWebSiteInfo;

	/**
	 * 所属MccCode，详情可参考 <a href="https://opendocs.alipay.com/common/02khjv">商家经营类目2.0</a>。
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 移动设备类型。
	 */
	@ApiField("mobile_type")
	private String mobileType;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 交易场景。
	 */
	@ApiField("trade_scene")
	private String tradeScene;

	public InteOpAppInfo getInteopAppInfo() {
		return this.inteopAppInfo;
	}
	public void setInteopAppInfo(InteOpAppInfo inteopAppInfo) {
		this.inteopAppInfo = inteopAppInfo;
	}

	public InteOpBusinessLicenseInfo getInteopBusinessLicenseInfo() {
		return this.inteopBusinessLicenseInfo;
	}
	public void setInteopBusinessLicenseInfo(InteOpBusinessLicenseInfo inteopBusinessLicenseInfo) {
		this.inteopBusinessLicenseInfo = inteopBusinessLicenseInfo;
	}

	public InteOpHtmlFiveInfo getInteopH5Info() {
		return this.inteopH5Info;
	}
	public void setInteopH5Info(InteOpHtmlFiveInfo inteopH5Info) {
		this.inteopH5Info = inteopH5Info;
	}

	public InteOpMerchantInfo getInteopMerchantInfo() {
		return this.inteopMerchantInfo;
	}
	public void setInteopMerchantInfo(InteOpMerchantInfo inteopMerchantInfo) {
		this.inteopMerchantInfo = inteopMerchantInfo;
	}

	public InteOpMiniAppInfo getInteopMiniAppInfo() {
		return this.inteopMiniAppInfo;
	}
	public void setInteopMiniAppInfo(InteOpMiniAppInfo inteopMiniAppInfo) {
		this.inteopMiniAppInfo = inteopMiniAppInfo;
	}

	public String getInteopOrderNo() {
		return this.inteopOrderNo;
	}
	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}

	public List<ProductDetail> getInteopProductDetails() {
		return this.inteopProductDetails;
	}
	public void setInteopProductDetails(List<ProductDetail> inteopProductDetails) {
		this.inteopProductDetails = inteopProductDetails;
	}

	public List<ProductPriceInfo> getInteopProductPriceDetails() {
		return this.inteopProductPriceDetails;
	}
	public void setInteopProductPriceDetails(List<ProductPriceInfo> inteopProductPriceDetails) {
		this.inteopProductPriceDetails = inteopProductPriceDetails;
	}

	public InteOpShopInfo getInteopShopInfo() {
		return this.inteopShopInfo;
	}
	public void setInteopShopInfo(InteOpShopInfo inteopShopInfo) {
		this.inteopShopInfo = inteopShopInfo;
	}

	public InteOpSpecialLicenseInfo getInteopSpecialLicenseInfo() {
		return this.inteopSpecialLicenseInfo;
	}
	public void setInteopSpecialLicenseInfo(InteOpSpecialLicenseInfo inteopSpecialLicenseInfo) {
		this.inteopSpecialLicenseInfo = inteopSpecialLicenseInfo;
	}

	public InteOpWebSiteInfo getInteopWebSiteInfo() {
		return this.inteopWebSiteInfo;
	}
	public void setInteopWebSiteInfo(InteOpWebSiteInfo inteopWebSiteInfo) {
		this.inteopWebSiteInfo = inteopWebSiteInfo;
	}

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getMobileType() {
		return this.mobileType;
	}
	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTradeScene() {
		return this.tradeScene;
	}
	public void setTradeScene(String tradeScene) {
		this.tradeScene = tradeScene;
	}

}
