package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品属性
 *
 * @author auto create
 * @since 1.0, 2020-07-23 15:13:51
 */
public class ItemProperty extends AlipayObject {

	private static final long serialVersionUID = 6641264564377916485L;

	/**
	 * 属性；内容不能有空格
	 */
	@ApiField("prop_key")
	private String propKey;

	/**
	 * 属性值；内容不能有空格
	 */
	@ApiListField("prop_values")
	@ApiField("string")
	private List<String> propValues;

	public String getPropKey() {
		return this.propKey;
	}
	public void setPropKey(String propKey) {
		this.propKey = propKey;
	}

	public List<String> getPropValues() {
		return this.propValues;
	}
	public void setPropValues(List<String> propValues) {
		this.propValues = propValues;
	}

}
