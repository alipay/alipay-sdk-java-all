package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职业培训课程修改
 *
 * @author auto create
 * @since 1.0, 2025-11-21 14:19:58
 */
public class CourseTagVO extends AlipayObject {

	private static final long serialVersionUID = 2394155224943423118L;

	/**
	 * 描述
	 */
	@ApiField("tag_desc")
	private String tagDesc;

	/**
	 * 标题
	 */
	@ApiField("tag_key")
	private String tagKey;

	/**
	 * 内容
	 */
	@ApiField("tag_value")
	private String tagValue;

	public String getTagDesc() {
		return this.tagDesc;
	}
	public void setTagDesc(String tagDesc) {
		this.tagDesc = tagDesc;
	}

	public String getTagKey() {
		return this.tagKey;
	}
	public void setTagKey(String tagKey) {
		this.tagKey = tagKey;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
