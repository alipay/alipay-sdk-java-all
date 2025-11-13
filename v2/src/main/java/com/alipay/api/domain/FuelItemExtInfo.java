package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加油商品扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-10-10 11:51:54
 */
public class FuelItemExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8147221166986113924L;

	/**
	 * MY_KEY
	 */
	@ApiField("ext_key")
	private String extKey;

	/**
	 * 扩展信息的值
	 */
	@ApiField("ext_value")
	private String extValue;

	public String getExtKey() {
		return this.extKey;
	}
	public void setExtKey(String extKey) {
		this.extKey = extKey;
	}

	public String getExtValue() {
		return this.extValue;
	}
	public void setExtValue(String extValue) {
		this.extValue = extValue;
	}

}
