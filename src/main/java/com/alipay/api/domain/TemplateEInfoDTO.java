package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模版主体信息
 *
 * @author auto create
 * @since 1.0, 2020-04-26 12:33:09
 */
public class TemplateEInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3665435838358848127L;

	/**
	 * 卡券辅助区域块
	 */
	@ApiListField("auxiliary_fields")
	@ApiField("template_e_info_unit_d_t_o")
	private List<TemplateEInfoUnitDTO> auxiliaryFields;

	/**
	 * 卡券适用商品ID列表，对于使用支付宝底层商品系统、小程序服务的卡券可直接显示对应商品信息，快速跳转转化。支持自定义动态参数传值，但动态参数需定义为：$_r_available_item_id$。
	 */
	@ApiListField("available_item_ids")
	@ApiField("string")
	private List<String> availableItemIds;

	/**
	 * 卡券适用商品来源，对于使用支付宝底层商品系统、小程序服务的卡券可直接显示对应商品信息，快速跳转转化。支持自定义动态参数传值，但动态参数需定义为：$_r_available_item_source$。
	 */
	@ApiField("available_item_source")
	private String availableItemSource;

	/**
	 * 卡券背面（更多使用详情）区域块
	 */
	@ApiListField("back_fields")
	@ApiField("template_e_info_unit_d_t_o")
	private List<TemplateEInfoUnitDTO> backFields;

	/**
	 * 卡券底部横幅信息
	 */
	@ApiField("banner")
	private TemplateBannerDTO banner;

	/**
	 * 卡券自定义辅助区域块
	 */
	@ApiListField("custom_fields")
	@ApiField("template_e_info_unit_d_t_o")
	private List<TemplateEInfoUnitDTO> customFields;

	/**
	 * 卡券主标题，建议不超过12个字。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("logo_text")
	private String logoText;

	/**
	 * 卡券商品原价，包括金额，用于对比显示卡券优惠力度。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("origin_price")
	private String originPrice;

	/**
	 * 卡券商品图片ID，通过接口（alipay.offline.material.image.upload）上传图片获得图片ID。图片需在1M以内，支持bmp、png、jpeg、jpg、gif格式，尺寸不小于670*335px。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("pass_img")
	private String passImg;

	/**
	 * 卡券商品图片显示比例，保留小数点2位，默认2.79。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("pass_img_ratio")
	private String passImgRatio;

	/**
	 * 卡券辅助标题，建议不超过50个字。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("second_logo_text")
	private String secondLogoText;

	/**
	 * 卡券使用门槛。建议根据类型设置文案，代金券：金额门槛（满N元可用）；折扣券：时间门槛（每周N次/N元，首月专享）；商品券：地域门槛（N门店可用）；兑换券：支付门槛（支付方式限制），资格凭证：渠道门槛（小程序专用）。支持自定义动态参数传值，但动态参数需定义为：$_r_use_condition$。
	 */
	@ApiField("use_condition")
	private String useCondition;

	/**
	 * 卡券适用范围/限制，如全场可用、全品类可用、X店铺可用、X商品可用、X服务可用等，建议12字以内。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("use_limit_desc")
	private String useLimitDesc;

	public List<TemplateEInfoUnitDTO> getAuxiliaryFields() {
		return this.auxiliaryFields;
	}
	public void setAuxiliaryFields(List<TemplateEInfoUnitDTO> auxiliaryFields) {
		this.auxiliaryFields = auxiliaryFields;
	}

	public List<String> getAvailableItemIds() {
		return this.availableItemIds;
	}
	public void setAvailableItemIds(List<String> availableItemIds) {
		this.availableItemIds = availableItemIds;
	}

	public String getAvailableItemSource() {
		return this.availableItemSource;
	}
	public void setAvailableItemSource(String availableItemSource) {
		this.availableItemSource = availableItemSource;
	}

	public List<TemplateEInfoUnitDTO> getBackFields() {
		return this.backFields;
	}
	public void setBackFields(List<TemplateEInfoUnitDTO> backFields) {
		this.backFields = backFields;
	}

	public TemplateBannerDTO getBanner() {
		return this.banner;
	}
	public void setBanner(TemplateBannerDTO banner) {
		this.banner = banner;
	}

	public List<TemplateEInfoUnitDTO> getCustomFields() {
		return this.customFields;
	}
	public void setCustomFields(List<TemplateEInfoUnitDTO> customFields) {
		this.customFields = customFields;
	}

	public String getLogoText() {
		return this.logoText;
	}
	public void setLogoText(String logoText) {
		this.logoText = logoText;
	}

	public String getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public String getPassImg() {
		return this.passImg;
	}
	public void setPassImg(String passImg) {
		this.passImg = passImg;
	}

	public String getPassImgRatio() {
		return this.passImgRatio;
	}
	public void setPassImgRatio(String passImgRatio) {
		this.passImgRatio = passImgRatio;
	}

	public String getSecondLogoText() {
		return this.secondLogoText;
	}
	public void setSecondLogoText(String secondLogoText) {
		this.secondLogoText = secondLogoText;
	}

	public String getUseCondition() {
		return this.useCondition;
	}
	public void setUseCondition(String useCondition) {
		this.useCondition = useCondition;
	}

	public String getUseLimitDesc() {
		return this.useLimitDesc;
	}
	public void setUseLimitDesc(String useLimitDesc) {
		this.useLimitDesc = useLimitDesc;
	}

}
