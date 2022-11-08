package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 使用规则id信息
 *
 * @author auto create
 * @since 1.0, 2022-08-17 17:59:26
 */
public class StandardIdInfo extends AlipayObject {

	private static final long serialVersionUID = 5847335513696952543L;

	/**
	 * 外部使用规则id
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 使用规则id
	 */
	@ApiField("standard_id")
	private String standardId;

	public String getOuterSourceId() {
		return this.outerSourceId;
	}
	public void setOuterSourceId(String outerSourceId) {
		this.outerSourceId = outerSourceId;
	}

	public String getStandardId() {
		return this.standardId;
	}
	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

}
