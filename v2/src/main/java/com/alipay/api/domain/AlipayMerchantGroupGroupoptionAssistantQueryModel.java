package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小助手所有群组选项
 *
 * @author auto create
 * @since 1.0, 2024-08-13 16:36:24
 */
public class AlipayMerchantGroupGroupoptionAssistantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3219596231337437611L;

	/**
	 * 需要排除的小助手内容id，创建小助手时返回的数据唯一id。修改的时候，务必传入当前小助手content_id作为excluded_content_id，才能将当前小助手的群组返回，让用户可选。
	 */
	@ApiField("excluded_content_id")
	private String excludedContentId;

	/**
	 * 小助手类型
	 */
	@ApiField("type")
	private String type;

	public String getExcludedContentId() {
		return this.excludedContentId;
	}
	public void setExcludedContentId(String excludedContentId) {
		this.excludedContentId = excludedContentId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
