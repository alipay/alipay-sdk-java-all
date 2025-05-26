package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转化事件基础信息
 *
 * @author auto create
 * @since 1.0, 2025-05-12 14:24:25
 */
public class ConvertedDetail extends AlipayObject {

	private static final long serialVersionUID = 4745133835998159897L;

	/**
	 * 转化事件id
	 */
	@ApiField("converted_id")
	private String convertedId;

	/**
	 * 转化事件名称
	 */
	@ApiField("converted_name")
	private String convertedName;

	public String getConvertedId() {
		return this.convertedId;
	}
	public void setConvertedId(String convertedId) {
		this.convertedId = convertedId;
	}

	public String getConvertedName() {
		return this.convertedName;
	}
	public void setConvertedName(String convertedName) {
		this.convertedName = convertedName;
	}

}
