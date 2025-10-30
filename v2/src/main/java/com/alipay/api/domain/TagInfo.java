package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签信息
 *
 * @author auto create
 * @since 1.0, 2024-05-16 16:02:51
 */
public class TagInfo extends AlipayObject {

	private static final long serialVersionUID = 4667382457198313325L;

	/**
	 * 计算条件表达式
	 */
	@ApiField("pre_identity")
	private String preIdentity;

	/**
	 * 标签名称
	 */
	@ApiField("tag_key")
	private String tagKey;

	/**
	 * 标签值
	 */
	@ApiField("tag_value")
	private String tagValue;

	public String getPreIdentity() {
		return this.preIdentity;
	}
	public void setPreIdentity(String preIdentity) {
		this.preIdentity = preIdentity;
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
