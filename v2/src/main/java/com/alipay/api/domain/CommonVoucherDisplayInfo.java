package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券展示规则
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:39:20
 */
public class CommonVoucherDisplayInfo extends AlipayObject {

	private static final long serialVersionUID = 3389768324585151238L;

	/**
	 * 商家品牌 logo 链接。
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 商户品牌名称。 如果不设置品牌名称，则默认使用支付宝商家系统中维护的商家别名。 如果没有维护商家别名，则使用默认名称： 商家优惠。 用户领取优惠券后，品牌名称会对用户进行展示
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 用于说明详细的活动规则，会展示在支付宝卡包券详情页。
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 券详情图片链接。
	 */
	@ApiListField("voucher_detail_images")
	@ApiField("string")
	private List<String> voucherDetailImages;

	/**
	 * 券封面图链接。
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
