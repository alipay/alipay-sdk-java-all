package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益展示信息
 *
 * @author auto create
 * @since 1.0, 2022-11-14 16:20:00
 */
public class BenefitDisplayInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2689617331864394952L;

	/**
	 * 按钮文案
	 */
	@ApiField("action_text")
	private String actionText;

	/**
	 * 1、SHOW_PAYMENT_CODE  展示付款码；2、SCAN  前往扫一扫3、CUSTOM  自定义跳转
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 按钮跳转链接地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 券详细图列表
	 */
	@ApiListField("benefit_detail_images")
	@ApiField("string")
	private List<String> benefitDetailImages;

	/**
	 * 实际传值为权益详情页封面图片在oss中的key
	 */
	@ApiField("benefit_image")
	private String benefitImage;

	/**
	 * 实际传值为品牌logo图片在oss中的key
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	public String getActionText() {
		return this.actionText;
	}
	public void setActionText(String actionText) {
		this.actionText = actionText;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public List<String> getBenefitDetailImages() {
		return this.benefitDetailImages;
	}
	public void setBenefitDetailImages(List<String> benefitDetailImages) {
		this.benefitDetailImages = benefitDetailImages;
	}

	public String getBenefitImage() {
		return this.benefitImage;
	}
	public void setBenefitImage(String benefitImage) {
		this.benefitImage = benefitImage;
	}

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

}
