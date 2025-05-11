package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.task.operation.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:09:38
 */
public class AlipayCommerceTaskOperationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8683457815921362463L;

	/** 
	 * 平台任务模版id
	 */
	@ApiField("platform_template_id")
	private String platformTemplateId;

	/** 
	 * 行业任务模版id
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 任务类型
	 */
	@ApiField("type")
	private String type;

	public void setPlatformTemplateId(String platformTemplateId) {
		this.platformTemplateId = platformTemplateId;
	}
	public String getPlatformTemplateId( ) {
		return this.platformTemplateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
