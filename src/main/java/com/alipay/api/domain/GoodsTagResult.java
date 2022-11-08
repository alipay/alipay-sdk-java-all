package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品标签返回结果集
 *
 * @author auto create
 * @since 1.0, 2022-08-15 14:30:07
 */
public class GoodsTagResult extends AlipayObject {

	private static final long serialVersionUID = 6659842575696713159L;

	/**
	 * 标签code
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 标签名称
	 */
	@ApiField("tag_name")
	private String tagName;

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
