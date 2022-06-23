package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园搜索内容下架
 *
 * @author auto create
 * @since 1.0, 2022-05-13 14:39:46
 */
public class AlipayCommerceEducateSchoolcontentOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 7382182588591992131L;

	/**
	 * 支付宝返回的内容唯一ID
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
