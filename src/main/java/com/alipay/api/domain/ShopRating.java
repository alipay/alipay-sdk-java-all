package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺评分
 *
 * @author auto create
 * @since 1.0, 2021-01-06 11:22:40
 */
public class ShopRating extends AlipayObject {

	private static final long serialVersionUID = 6567354335331519279L;

	/**
	 * 店铺评分下限,必须为0~1000的整数
	 */
	@ApiField("lower_bound")
	private String lowerBound;

	/**
	 * 店铺评分上线，必须为0~1000的整数
	 */
	@ApiField("upper_bound")
	private String upperBound;

	/**
	 * 当前店铺评分,为0~1000内的值。
可保留一位小数
	 */
	@ApiField("value")
	private String value;

	public String getLowerBound() {
		return this.lowerBound;
	}
	public void setLowerBound(String lowerBound) {
		this.lowerBound = lowerBound;
	}

	public String getUpperBound() {
		return this.upperBound;
	}
	public void setUpperBound(String upperBound) {
		this.upperBound = upperBound;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
