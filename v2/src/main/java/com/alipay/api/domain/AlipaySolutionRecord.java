package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连解决方案数据提报记录
 *
 * @author auto create
 * @since 1.0, 2024-06-05 18:57:15
 */
public class AlipaySolutionRecord extends AlipayObject {

	private static final long serialVersionUID = 3482961275539983131L;

	/**
	 * 数据记录字段的key
	 */
	@ApiField("data_key")
	private String dataKey;

	/**
	 * 数据记录字段的值
	 */
	@ApiField("data_value")
	private String dataValue;

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public String getDataValue() {
		return this.dataValue;
	}
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}

}
