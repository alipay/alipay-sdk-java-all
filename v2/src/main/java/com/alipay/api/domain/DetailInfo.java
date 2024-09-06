package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * DetailInfo
 *
 * @author auto create
 * @since 1.0, 2024-05-21 16:28:52
 */
public class DetailInfo extends AlipayObject {

	private static final long serialVersionUID = 1428148652967222796L;

	/**
	 * 数据类型
	 */
	@ApiField("data_name")
	private String dataName;

	/**
	 * 数据值
	 */
	@ApiField("data_value")
	private String dataValue;

	public String getDataName() {
		return this.dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public String getDataValue() {
		return this.dataValue;
	}
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}

}
