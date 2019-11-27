package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参与次数规则
 *
 * @author auto create
 * @since 1.0, 2016-03-28 13:44:16
 */
public class ParticipateCountDto extends AlipayObject {

	private static final long serialVersionUID = 8542779948479565594L;

	/**
	 * 周期单位
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 周期值
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
