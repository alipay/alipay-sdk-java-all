package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品标签信息
 *
 * @author auto create
 * @since 1.0, 2024-07-15 15:44:16
 */
public class ItemTagVO extends AlipayObject {

	private static final long serialVersionUID = 5583952532734569423L;

	/**
	 * 商品标签ID，例如：极速退款 TI00290152;晚发必赔 TI00311310
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 标签值
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
