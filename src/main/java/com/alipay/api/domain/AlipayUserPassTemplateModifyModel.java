package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡包卡券模板更新接口
 *
 * @author auto create
 * @since 1.0, 2020-09-03 15:39:45
 */
public class AlipayUserPassTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8514636453459813356L;

	/**
	 * 基础属性
	 */
	@ApiField("evoucher_info")
	private TemplateEvoucherDTO evoucherInfo;

	/**
	 * 文件属性
	 */
	@ApiField("file_info")
	private TemplateFileDTO fileInfo;

	/**
	 * 图片属性
	 */
	@ApiField("image")
	private TemplateImageDTO image;

	/**
	 * 商户属性
	 */
	@ApiField("merchant")
	private TemplateMerchantDTO merchant;

	/**
	 * 渠道属性
	 */
	@ApiField("platform")
	private TemplatePlatformDTO platform;

	/**
	 * 样式属性
	 */
	@ApiField("style")
	private TemplateStyleDTO style;

	/**
	 * 支付宝模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	public TemplateEvoucherDTO getEvoucherInfo() {
		return this.evoucherInfo;
	}
	public void setEvoucherInfo(TemplateEvoucherDTO evoucherInfo) {
		this.evoucherInfo = evoucherInfo;
	}

	public TemplateFileDTO getFileInfo() {
		return this.fileInfo;
	}
	public void setFileInfo(TemplateFileDTO fileInfo) {
		this.fileInfo = fileInfo;
	}

	public TemplateImageDTO getImage() {
		return this.image;
	}
	public void setImage(TemplateImageDTO image) {
		this.image = image;
	}

	public TemplateMerchantDTO getMerchant() {
		return this.merchant;
	}
	public void setMerchant(TemplateMerchantDTO merchant) {
		this.merchant = merchant;
	}

	public TemplatePlatformDTO getPlatform() {
		return this.platform;
	}
	public void setPlatform(TemplatePlatformDTO platform) {
		this.platform = platform;
	}

	public TemplateStyleDTO getStyle() {
		return this.style;
	}
	public void setStyle(TemplateStyleDTO style) {
		this.style = style;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
