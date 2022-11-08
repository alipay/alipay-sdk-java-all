package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家用户标签
 *
 * @author auto create
 * @since 1.0, 2022-06-29 13:17:34
 */
public class MrchCrmUserTagInfo extends AlipayObject {

	private static final long serialVersionUID = 7422688197116663381L;

	/**
	 * 标签code
<br>
需保证同一商户下tag_code唯一
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 标签名
	 */
	@ApiField("tag_name")
	private String tagName;

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

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
