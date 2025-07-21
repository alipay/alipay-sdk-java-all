package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商圈会员卡模型
 *
 * @author auto create
 * @since 1.0, 2018-06-28 21:01:01
 */
public class MallCardBo extends AlipayObject {

	private static final long serialVersionUID = 7878273282677631541L;

	/**
	 * 商圈会员卡权益描述
	 */
	@ApiListField("benefit_desc")
	@ApiField("string")
	private List<String> benefitDesc;

	/**
	 * 会员卡图片url
	 */
	@ApiField("card_logo_url")
	private String cardLogoUrl;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 等级展示名称
	 */
	@ApiField("level_show_name")
	private String levelShowName;

	/**
	 * 会员卡卡模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 权益标题 多个权益用,分隔
	 */
	@ApiField("title")
	private String title;

	public List<String> getBenefitDesc() {
		return this.benefitDesc;
	}
	public void setBenefitDesc(List<String> benefitDesc) {
		this.benefitDesc = benefitDesc;
	}

	public String getCardLogoUrl() {
		return this.cardLogoUrl;
	}
	public void setCardLogoUrl(String cardLogoUrl) {
		this.cardLogoUrl = cardLogoUrl;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getLevelShowName() {
		return this.levelShowName;
	}
	public void setLevelShowName(String levelShowName) {
		this.levelShowName = levelShowName;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
