package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机构自定义备注规则
 *
 * @author auto create
 * @since 1.0, 2022-11-03 11:24:36
 */
public class InstRuleCustomMemoVO extends AlipayObject {

	private static final long serialVersionUID = 1325588115661748514L;

	/**
	 * 备注要素
	 */
	@ApiListField("element_list")
	@ApiField("memo_element")
	private List<MemoElement> elementList;

	/**
	 * 连接符，默认为空字符串
	 */
	@ApiField("split_str")
	private String splitStr;

	public List<MemoElement> getElementList() {
		return this.elementList;
	}
	public void setElementList(List<MemoElement> elementList) {
		this.elementList = elementList;
	}

	public String getSplitStr() {
		return this.splitStr;
	}
	public void setSplitStr(String splitStr) {
		this.splitStr = splitStr;
	}

}
