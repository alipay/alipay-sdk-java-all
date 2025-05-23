package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签列表
 *
 * @author auto create
 * @since 1.0, 2021-03-10 16:55:17
 */
public class CourseTagInfo extends AlipayObject {

	private static final long serialVersionUID = 4855843676584586983L;

	/**
	 * 标签code (从标签列表接口选取)
	 */
	@ApiField("tag_code")
	private String tagCode;

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

}
