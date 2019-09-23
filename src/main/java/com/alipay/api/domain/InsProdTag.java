package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险产品业务标记
 *
 * @author auto create
 * @since 1.0, 2019-07-30 17:11:17
 */
public class InsProdTag extends AlipayObject {

	private static final long serialVersionUID = 7121471835697349917L;

	/**
	 * 业务标记代码
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 业务标记值
	 */
	@ApiField("tag_value")
	private String tagValue;

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
