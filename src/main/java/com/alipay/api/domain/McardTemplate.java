package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板基本信息
 *
 * @author auto create
 * @since 1.0, 2018-02-05 15:47:28
 */
public class McardTemplate extends AlipayObject {

	private static final long serialVersionUID = 3694192568994214512L;

	/**
	 * 会员卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 会员卡模板创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 会员卡模板修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 会员卡模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 会员卡模板展示样式，会员卡在卡包中的卡面展示效果
	 */
	@ApiField("template_style_info")
	private TemplateStyleInfoDTO templateStyleInfo;

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public TemplateStyleInfoDTO getTemplateStyleInfo() {
		return this.templateStyleInfo;
	}
	public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
		this.templateStyleInfo = templateStyleInfo;
	}

}
