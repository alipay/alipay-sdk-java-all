package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上传设备行为日志
 *
 * @author auto create
 * @since 1.0, 2020-04-10 10:50:25
 */
public class AlipayCommerceIotMdeviceprodDevicelogUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5875419414871952615L;

	/**
	 * 行为日志主体
	 */
	@ApiField("body")
	private String body;

	/**
	 * 日志模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
