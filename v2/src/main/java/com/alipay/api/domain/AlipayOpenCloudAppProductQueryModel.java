package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云调用应用已添加产品信息查询
 *
 * @author auto create
 * @since 1.0, 2025-01-16 12:06:14
 */
public class AlipayOpenCloudAppProductQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2126549777943441546L;

	/**
	 * 需要查询的应用appId
	 */
	@ApiField("invoke_app_id")
	private String invokeAppId;

	public String getInvokeAppId() {
		return this.invokeAppId;
	}
	public void setInvokeAppId(String invokeAppId) {
		this.invokeAppId = invokeAppId;
	}

}
