package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 补充凭证
 *
 * @author auto create
 * @since 1.0, 2026-04-10 15:01:50
 */
public class FulfillmentAdditionalMediaInfo extends AlipayObject {

	private static final long serialVersionUID = 2599399522861345762L;

	/**
	 * 补充凭证类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 补充凭证数据
	 */
	@ApiField("value")
	private String value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
