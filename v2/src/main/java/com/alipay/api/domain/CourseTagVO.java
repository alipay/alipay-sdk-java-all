package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职业培训课程修改
 *
 * @author auto create
 * @since 1.0, 2025-12-16 15:03:40
 */
public class CourseTagVO extends AlipayObject {

	private static final long serialVersionUID = 2352384952822594662L;

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
	 * 链接
	 */
	@ApiField("tag_url")
	private String tagUrl;

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

	public String getTagUrl() {
		return this.tagUrl;
	}
	public void setTagUrl(String tagUrl) {
		this.tagUrl = tagUrl;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
