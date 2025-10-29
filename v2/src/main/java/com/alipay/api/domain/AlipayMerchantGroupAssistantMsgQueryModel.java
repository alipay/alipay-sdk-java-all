package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小助手定向消息详情查询
 *
 * @author auto create
 * @since 1.0, 2025-10-22 09:34:46
 */
public class AlipayMerchantGroupAssistantMsgQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4356865884754971692L;

	/**
	 * 小助手内容id，创建定向消息时返回的数据唯一id
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
