package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签
 *
 * @author auto create
 * @since 1.0, 2026-06-11 16:31:37
 */
public class RecycleOrderTagInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7221444626485259361L;

	/**
	 * 标签编码
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 标签类型
	 */
	@ApiField("tag_type")
	private String tagType;

	/**
	 * 标签值
	 */
	@ApiField("tag_value")
	private String tagValue;

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

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
