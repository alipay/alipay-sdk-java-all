package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职业培训课程修改
 *
 * @author auto create
 * @since 1.0, 2025-08-18 13:31:45
 */
public class CourseTagVO extends AlipayObject {

	private static final long serialVersionUID = 1262532343574789192L;

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
