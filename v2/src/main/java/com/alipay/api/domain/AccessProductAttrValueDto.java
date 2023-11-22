package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 产品属性
 *
 * @author auto create
 * @since 1.0, 2023-04-26 10:20:06
 */
public class AccessProductAttrValueDto extends AlipayObject {

	private static final long serialVersionUID = 6165242473156625895L;

	/**
	 * attr_name，用于商品同步，由调用方传入
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * attr_value_name_list，用于商品同步，由调用方传入
	 */
	@ApiListField("attr_value_name_list")
	@ApiField("string")
	private List<String> attrValueNameList;

	public String getAttrName() {
		return this.attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public List<String> getAttrValueNameList() {
		return this.attrValueNameList;
	}
	public void setAttrValueNameList(List<String> attrValueNameList) {
		this.attrValueNameList = attrValueNameList;
	}

}
