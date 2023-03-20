package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序内容属性
 *
 * @author auto create
 * @since 1.0, 2022-12-15 19:38:16
 */
public class MiniContentPropertyInfo extends AlipayObject {

	private static final long serialVersionUID = 1779249168733475347L;

	/**
	 * 属性key，必须是平台预先定义的，否则不允许录入
	 */
	@ApiField("key")
	private String key;

	/**
	 * 属性值
	 */
	@ApiListField("value_list")
	@ApiField("string")
	private List<String> valueList;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public List<String> getValueList() {
		return this.valueList;
	}
	public void setValueList(List<String> valueList) {
		this.valueList = valueList;
	}

}
