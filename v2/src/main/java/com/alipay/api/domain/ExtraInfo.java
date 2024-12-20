package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展信息
 *
 * @author auto create
 * @since 1.0, 2021-03-19 16:44:02
 */
public class ExtraInfo extends AlipayObject {

	private static final long serialVersionUID = 2534332495526298223L;

	/**
	 * 扩展信息key
	 */
	@ApiField("extra_info_key")
	private String extraInfoKey;

	/**
	 * 扩展信息value
	 */
	@ApiField("extra_info_value")
	private String extraInfoValue;

	public String getExtraInfoKey() {
		return this.extraInfoKey;
	}
	public void setExtraInfoKey(String extraInfoKey) {
		this.extraInfoKey = extraInfoKey;
	}

	public String getExtraInfoValue() {
		return this.extraInfoValue;
	}
	public void setExtraInfoValue(String extraInfoValue) {
		this.extraInfoValue = extraInfoValue;
	}

}
