package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.bkcustgrowprod.cardstyle.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-26 18:14:56
 */
public class MybankMarketingBkcustgrowprodCardstyleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2588719595725854661L;

	/** 
	 * 是否切换成功
	 */
	@ApiField("selected")
	private Boolean selected;

	/** 
	 * id
	 */
	@ApiField("style_id")
	private String styleId;

	/** 
	 * success,业务处理状态，不唯一，Boolea类型
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 模版id
	 */
	@ApiField("template_id")
	private String templateId;

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	public Boolean getSelected( ) {
		return this.selected;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}
	public String getStyleId( ) {
		return this.styleId;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
