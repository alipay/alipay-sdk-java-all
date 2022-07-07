package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询个性化菜单返回对象
 *
 * @author auto create
 * @since 1.0, 2020-08-10 20:27:34
 */
public class QueryMenu extends AlipayObject {

	private static final long serialVersionUID = 7842183573855261479L;

	/**
	 * 一级菜单列表
	 */
	@ApiListField("button")
	@ApiField("button_object")
	private List<ButtonObject> button;

	/**
	 * 标签规则项列表
	 */
	@ApiListField("label_rule")
	@ApiField("query_label_rule")
	private List<QueryLabelRule> labelRule;

	/**
	 * 菜单唯一id
	 */
	@ApiField("menu_key")
	private String menuKey;

	/**
	 * 菜单类型，icon：icon型菜单，text：文本型菜单
	 */
	@ApiField("type")
	private String type;

	public List<ButtonObject> getButton() {
		return this.button;
	}
	public void setButton(List<ButtonObject> button) {
		this.button = button;
	}

	public List<QueryLabelRule> getLabelRule() {
		return this.labelRule;
	}
	public void setLabelRule(List<QueryLabelRule> labelRule) {
		this.labelRule = labelRule;
	}

	public String getMenuKey() {
		return this.menuKey;
	}
	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
