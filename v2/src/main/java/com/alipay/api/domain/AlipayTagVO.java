package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店相册信息，采用tagId和TagValue来表示
tagId = 相册ID，唯一
tagValue=图片地址
 *
 * @author auto create
 * @since 1.0, 2025-10-10 14:19:45
 */
public class AlipayTagVO extends AlipayObject {

	private static final long serialVersionUID = 7561526367697261126L;

	/**
	 * 标签唯一ID
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 图片相册值
	 */
	@ApiField("tag_value")
	private String tagValue;

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
