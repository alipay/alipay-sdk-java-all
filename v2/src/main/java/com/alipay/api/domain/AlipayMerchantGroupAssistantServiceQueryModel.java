package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小助手快捷服务
 *
 * @author auto create
 * @since 1.0, 2024-08-13 16:35:53
 */
public class AlipayMerchantGroupAssistantServiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6264779176838131457L;

	/**
	 * 小助手内容id，创建快捷服务时返回的数据唯一id
	 */
	@ApiField("content_id")
	private String contentId;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

}
