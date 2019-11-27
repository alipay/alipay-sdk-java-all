package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 延迟生效信息
 *
 * @author auto create
 * @since 1.0, 2016-05-01 18:53:21
 */
public class EffectiveDelayInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1475768818148483349L;

	/**
	 * 类型。W:按绝对值延迟,M:按天数延迟
	 */
	@ApiField("type")
	private String type;

	/**
	 * 值
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
