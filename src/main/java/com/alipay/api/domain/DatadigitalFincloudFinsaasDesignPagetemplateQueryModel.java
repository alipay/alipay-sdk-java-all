package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询设计页面模版详情
 *
 * @author auto create
 * @since 1.0, 2022-07-21 14:57:03
 */
public class DatadigitalFincloudFinsaasDesignPagetemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3188344979894355625L;

	/**
	 * 页面模版code
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
