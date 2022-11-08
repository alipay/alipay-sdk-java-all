package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 全部展示详情
 *
 * @author auto create
 * @since 1.0, 2022-09-27 13:22:21
 */
public class VoucherDisplayPatternInfo extends AlipayObject {

	private static final long serialVersionUID = 6167798393148982229L;

	/**
	 * 商家logo 需要通过 alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_BRAND_LOGO，返回的resource_id即为该参数的值。
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 商家品牌logo链接
	 */
	@ApiField("brand_logo_url")
	private String brandLogoUrl;

	/**
	 * 商户品牌名称。 如果不设置品牌名称，则默认使用支付宝商家系统中维护的商家别名。 如果没有维护商家别名，则使用默认名称： 商家优惠。 用户领取优惠券后，品牌名称会对用户进行展示。
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 客服电话。
	 */
	@ApiField("customer_service_mobile")
	private String customerServiceMobile;

	/**
	 * 客服链接。
	 */
	@ApiField("customer_service_url")
	private String customerServiceUrl;

	/**
	 * 券详细使用说明。
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 券详情链接
	 */
	@ApiListField("voucher_detail_image_urls")
	@ApiField("string")
	private List<String> voucherDetailImageUrls;

	/**
	 * 券详细图列表，会展示在用户支付宝卡包券详情页 需要通过 alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_DETAIL_IMAGE ,接口返回的resource_id即为该参数的值 上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过2MB。
	 */
	@ApiListField("voucher_detail_images")
	@ApiField("string")
	private List<String> voucherDetailImages;

	/**
	 * 券详情页封面图，会展示在用户支付宝卡包券详情页 需要通过 alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_IMAGE，接口返回的resource_id即为该参数的值。
	 */
	@ApiField("voucher_image")
	private String voucherImage;

	/**
	 * 券封面链接
	 */
	@ApiField("voucher_image_url")
	private String voucherImageUrl;

	/**
	 * 券名称。
	 */
	@ApiField("voucher_name")
	private String voucherName;

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandLogoUrl() {
		return this.brandLogoUrl;
	}
	public void setBrandLogoUrl(String brandLogoUrl) {
		this.brandLogoUrl = brandLogoUrl;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCustomerServiceMobile() {
		return this.customerServiceMobile;
	}
	public void setCustomerServiceMobile(String customerServiceMobile) {
		this.customerServiceMobile = customerServiceMobile;
	}

	public String getCustomerServiceUrl() {
		return this.customerServiceUrl;
	}
	public void setCustomerServiceUrl(String customerServiceUrl) {
		this.customerServiceUrl = customerServiceUrl;
	}

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public List<String> getVoucherDetailImageUrls() {
		return this.voucherDetailImageUrls;
	}
	public void setVoucherDetailImageUrls(List<String> voucherDetailImageUrls) {
		this.voucherDetailImageUrls = voucherDetailImageUrls;
	}

	public List<String> getVoucherDetailImages() {
		return this.voucherDetailImages;
	}
	public void setVoucherDetailImages(List<String> voucherDetailImages) {
		this.voucherDetailImages = voucherDetailImages;
	}

	public String getVoucherImage() {
		return this.voucherImage;
	}
	public void setVoucherImage(String voucherImage) {
		this.voucherImage = voucherImage;
	}

	public String getVoucherImageUrl() {
		return this.voucherImageUrl;
	}
	public void setVoucherImageUrl(String voucherImageUrl) {
		this.voucherImageUrl = voucherImageUrl;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

}
