package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券可用时段
 *
 * @author auto create
 * @since 1.0, 2016-05-01 18:45:50
 */
public class AvailableVoucherTimeDTO extends AlipayObject {

	private static final long serialVersionUID = 6373194253113328896L;

	/**
	 * 单位.M:月,W:周
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 值
	 */
	@ApiField("values")
	private String values;

	public String getDimension() {
		return this.dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getValues() {
		return this.values;
	}
	public void setValues(String values) {
		this.values = values;
	}

}
