package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券展示信息
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:38:50
 */
public class VoucherDisplayInfoModify extends AlipayObject {

	private static final long serialVersionUID = 3548335798146313858L;

	/**
	 * 商家logo 
需要通过 alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_BRAND_LOGO，返回的resource_id即为该参数的值
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 商户品牌名称。
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 客服电话
	 */
	@ApiField("customer_service_mobile")
	private String customerServiceMobile;

	/**
	 * 客服链接
	 */
	@ApiField("customer_service_url")
	private String customerServiceUrl;

	/**
	 * 券补充说明，该字段为可运营字段，可描述商品特色 会展示在用户支付宝卡包券详情页。
	 */
	@ApiField("voucher_comment")
	private String voucherComment;

	/**
	 * 券详细使用说明。
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

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

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
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

	public String getVoucherComment() {
		return this.voucherComment;
	}
	public void setVoucherComment(String voucherComment) {
		this.voucherComment = voucherComment;
	}

	public String getVoucherDescription() {
		return this.voucherDescription;
	}
	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
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

}
