package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模板表单配置
 *
 * @author auto create
 * @since 1.0, 2023-12-27 18:18:54
 */
public class TemplateFormConfig extends AlipayObject {

	private static final long serialVersionUID = 8322544599931597882L;

	/**
	 * 表单可选字段，required里面的选项与optional里面的选项不能存在重复
	 */
	@ApiField("fields")
	private TemplateFormFields fields;

	/**
	 * 入会时承接入会弹层的小程序appId
	 */
	@ApiField("open_card_mini_app_id")
	private String openCardMiniAppId;

	public TemplateFormFields getFields() {
		return this.fields;
	}
	public void setFields(TemplateFormFields fields) {
		this.fields = fields;
	}

	public String getOpenCardMiniAppId() {
		return this.openCardMiniAppId;
	}
	public void setOpenCardMiniAppId(String openCardMiniAppId) {
		this.openCardMiniAppId = openCardMiniAppId;
	}

}
