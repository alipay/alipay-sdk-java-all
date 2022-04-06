package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券详情页
 *
 * @author auto create
 * @since 1.0, 2022-02-23 14:17:09
 */
public class PaymentVoucherDisplayInfo extends AlipayObject {

	private static final long serialVersionUID = 4753885375659755468L;

	/**
	 * 商户品牌名称。 如果不设置品牌名称，则默认使用支付宝商家系统中维护的商家别名。 如果没有维护商家别名，则使用默认名称： 商家优惠。 用户领取优惠券后，品牌名称会对用户进行展示
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 商家客服电话，会展示在支付宝卡包券详情页。
	 */
	@ApiField("customer_service_mobile")
	private String customerServiceMobile;

	/**
	 * 用于说明详细的活动规则，会展示在支付宝卡包券详情页。
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 券详细图列表，会展示在用户支付宝卡包券详情页 需要通过 alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_DETAIL_IMAGE ,接口返回的resource_id即为该参数的值 上传图片尺寸600*600，支持格式：png、jpg、jpeg、bmp，大小不超过2MB 限制 1.voucher_image填入，该值才能填入； 2.最多3张；
	 */
	@ApiListField("voucher_detail_images")
	@ApiField("string")
	private List<String> voucherDetailImages;

	/**
	 * 券详情页封面图，会展示在用户支付宝卡包券详情页 需要通过 alipay.marketing.material.image.upload接口上传图片，指定file_key为PROMO_VOUCHER_IMAGE，接口返回的resource_id即为该参数的值 限制: 该字段在兑换券场景下必传 上传图片尺寸670*335，支持格式：png、jpg、jpeg、bmp，大小不超过2MB
限制:
1.指定可核销商品(available_goods)时必传
	 */
	@ApiField("voucher_image")
	private String voucherImage;

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
