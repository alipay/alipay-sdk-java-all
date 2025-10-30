package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短信模板删除接口
 *
 * @author auto create
 * @since 1.0, 2024-02-22 15:26:23
 */
public class AlipayCloudCloudpromoMessageTemplateDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2782861978358237943L;

	/**
	 * 短信模板Code
	 */
	@ApiField("template_code")
	private String templateCode;

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
