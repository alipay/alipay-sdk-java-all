package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模板相关参数，其中包括templateId模板ID和context模板上下文
 *
 * @author auto create
 * @since 1.0, 2018-04-19 11:28:05
 */
public class Template extends AlipayObject {

	private static final long serialVersionUID = 8382936758441381313L;

	/**
	 * 消息模板上下文，即模板中定义的参数及参数值
	 */
	@ApiField("context")
	private Context context;

	/**
	 * 消息模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public Context getContext() {
		return this.context;
	}
	public void setContext(Context context) {
		this.context = context;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
