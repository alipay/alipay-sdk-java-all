package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户年龄标签信息
 *
 * @author auto create
 * @since 1.0, 2024-03-06 20:22:13
 */
public class UserAgeTagDTO extends AlipayObject {

	private static final long serialVersionUID = 1171448321219788892L;

	/**
	 * 用户年龄段占比
	 */
	@ApiField("ratio")
	private String ratio;

	/**
	 * 用户年龄标签值
	 */
	@ApiField("tag_value")
	private String tagValue;

	public String getRatio() {
		return this.ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
