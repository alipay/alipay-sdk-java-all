package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TemplateEvoucherDTO;
import com.alipay.api.domain.TemplateFileDTO;
import com.alipay.api.domain.TemplateImageDTO;
import com.alipay.api.domain.TemplateMerchantDTO;
import com.alipay.api.domain.TemplatePlatformDTO;
import com.alipay.api.domain.TemplateStyleDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.pass.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:00
 */
public class AlipayUserPassTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4543828516369134619L;

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

	public void setEvoucherInfo(TemplateEvoucherDTO evoucherInfo) {
		this.evoucherInfo = evoucherInfo;
	}
	public TemplateEvoucherDTO getEvoucherInfo( ) {
		return this.evoucherInfo;
	}

	public void setFileInfo(TemplateFileDTO fileInfo) {
		this.fileInfo = fileInfo;
	}
	public TemplateFileDTO getFileInfo( ) {
		return this.fileInfo;
	}

	public void setImage(TemplateImageDTO image) {
		this.image = image;
	}
	public TemplateImageDTO getImage( ) {
		return this.image;
	}

	public void setMerchant(TemplateMerchantDTO merchant) {
		this.merchant = merchant;
	}
	public TemplateMerchantDTO getMerchant( ) {
		return this.merchant;
	}

	public void setPlatform(TemplatePlatformDTO platform) {
		this.platform = platform;
	}
	public TemplatePlatformDTO getPlatform( ) {
		return this.platform;
	}

	public void setStyle(TemplateStyleDTO style) {
		this.style = style;
	}
	public TemplateStyleDTO getStyle( ) {
		return this.style;
	}

}
