package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品标签
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class DishTag extends AlipayObject {

	private static final long serialVersionUID = 6688691338227931832L;

	/**
	 * 标签类型 : 如"菜属性"，"菜推荐"
	 */
	@ApiField("type")
	private String type;

	/**
	 * 标签值：如"重辣","中辣","招牌菜","创意菜"
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
