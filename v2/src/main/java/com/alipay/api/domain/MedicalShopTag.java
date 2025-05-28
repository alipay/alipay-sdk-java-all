package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗健康门店标签
 *
 * @author auto create
 * @since 1.0, 2024-05-09 14:35:44
 */
public class MedicalShopTag extends AlipayObject {

	private static final long serialVersionUID = 7112998646789748357L;

	/**
	 * 门店标签类型
	 */
	@ApiField("tag_type")
	private String tagType;

	/**
	 * 标签文案，有多个时用英文逗号分隔
	 */
	@ApiField("tag_value")
	private String tagValue;

	public String getTagType() {
		return this.tagType;
	}
	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
