package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新菜单
 *
 * @author auto create
 * @since 1.0, 2018-11-05 19:08:54
 */
public class AlipayOpenPublicMenuModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1526934828187853276L;

	/**
	 * 一级菜单列表。最多有4个一级菜单，若开发者在后台打开了"咨询反馈"的开关，则只能有3个一级菜单.
	 */
	@ApiListField("button")
	@ApiField("button_object")
	private List<ButtonObject> button;

	/**
	 * 菜单类型，支持值为icon：icon型菜单，text：文本型菜单，不传时默认为"text"，当传值为"icon"时，菜单节点的icon字段必传。
	 */
	@ApiField("type")
	private String type;

	public List<ButtonObject> getButton() {
		return this.button;
	}
	public void setButton(List<ButtonObject> button) {
		this.button = button;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
