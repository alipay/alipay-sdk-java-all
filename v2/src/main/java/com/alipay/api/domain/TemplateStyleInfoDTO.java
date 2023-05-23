package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡模板样式信息
 *
 * @author auto create
 * @since 1.0, 2019-03-12 12:07:09
 */
public class TemplateStyleInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4295294449864932239L;

	/**
	 * 背景图片Id，通过接口（alipay.offline.material.image.upload）上传图片

图片说明：2M以内，格式：bmp、png、jpeg、jpg、gif；
尺寸不小于1020*643px；
图片不得有圆角，不得拉伸变形
	 */
	@ApiField("background_id")
	private String backgroundId;

	/**
	 * banner图片地址。 通过接口（alipay.offline.material.image.upload）上传图片。
	 */
	@ApiField("banner_img_id")
	private String bannerImgId;

	/**
	 * banner跳转地址。
	 */
	@ApiField("banner_url")
	private String bannerUrl;

	/**
	 * 字体颜色（非背景色），只影响卡详情中部信息区域字体颜色
	 */
	@ApiField("bg_color")
	private String bgColor;

	/**
	 * 品牌商名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 钱包端显示名称（字符串长度）
	 */
	@ApiField("card_show_name")
	private String cardShowName;

	/**
	 * 注意：此字段已废弃。
卡片颜色
	 */
	@ApiField("color")
	private String color;

	/**
	 * 栏位信息布局。目前只支持list（列表）或grid（宫格）形式。如果为空则默认为list。
	 */
	@ApiField("column_info_layout")
	private String columnInfoLayout;

	/**
	 * 特色信息，用于领卡预览
	 */
	@ApiListField("feature_descriptions")
	@ApiField("string")
	private List<String> featureDescriptions;

	/**
	 * 设置是否在卡面展示（个人头像）图片信息，默认不展示；
当前仅用于身份验证信息类型的个人头像图片；
图片id随创建卡/更新卡时传入；
详见会员卡产品文档。
	 */
	@ApiField("front_image_enable")
	private Boolean frontImageEnable;

	/**
	 * 设置是否在卡面展示文案信息，默认不展示；
文案信息分行展示，最多展示4行文案，每行文案分为label和value两部分；
文案实际内容随创建卡/更新卡时传入；
详见会员卡产品说明文档。
	 */
	@ApiField("front_text_list_enable")
	private Boolean frontTextListEnable;

	/**
	 * logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片

图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；
尺寸不小于500*500px的正方形；
请优先使用商家LOGO；
	 */
	@ApiField("logo_id")
	private String logoId;

	/**
	 * 标语
	 */
	@ApiField("slogan")
	private String slogan;

	/**
	 * 标语图片， 通过接口（alipay.offline.material.image.upload）上传图片
	 */
	@ApiField("slogan_img_id")
	private String sloganImgId;

	public String getBackgroundId() {
		return this.backgroundId;
	}
	public void setBackgroundId(String backgroundId) {
		this.backgroundId = backgroundId;
	}

	public String getBannerImgId() {
		return this.bannerImgId;
	}
	public void setBannerImgId(String bannerImgId) {
		this.bannerImgId = bannerImgId;
	}

	public String getBannerUrl() {
		return this.bannerUrl;
	}
	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	public String getBgColor() {
		return this.bgColor;
	}
	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCardShowName() {
		return this.cardShowName;
	}
	public void setCardShowName(String cardShowName) {
		this.cardShowName = cardShowName;
	}

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getColumnInfoLayout() {
		return this.columnInfoLayout;
	}
	public void setColumnInfoLayout(String columnInfoLayout) {
		this.columnInfoLayout = columnInfoLayout;
	}

	public List<String> getFeatureDescriptions() {
		return this.featureDescriptions;
	}
	public void setFeatureDescriptions(List<String> featureDescriptions) {
		this.featureDescriptions = featureDescriptions;
	}

	public Boolean getFrontImageEnable() {
		return this.frontImageEnable;
	}
	public void setFrontImageEnable(Boolean frontImageEnable) {
		this.frontImageEnable = frontImageEnable;
	}

	public Boolean getFrontTextListEnable() {
		return this.frontTextListEnable;
	}
	public void setFrontTextListEnable(Boolean frontTextListEnable) {
		this.frontTextListEnable = frontTextListEnable;
	}

	public String getLogoId() {
		return this.logoId;
	}
	public void setLogoId(String logoId) {
		this.logoId = logoId;
	}

	public String getSlogan() {
		return this.slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getSloganImgId() {
		return this.sloganImgId;
	}
	public void setSloganImgId(String sloganImgId) {
		this.sloganImgId = sloganImgId;
	}

}
