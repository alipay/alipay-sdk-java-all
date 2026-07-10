package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活服务商品自定义属性
 *
 * @author auto create
 * @since 1.0, 2026-04-27 17:15:57
 */
public class LsItemCustomAttr extends AlipayObject {

	private static final long serialVersionUID = 6438521389333234826L;

	/**
	 * 自定义属性列表
	 */
	@ApiListField("attrs")
	@ApiField("ls_item_custom_attr_item")
	private List<LsItemCustomAttrItem> attrs;

	/**
	 * 属性分组名，如果属性无需分组名可不传
	 */
	@ApiField("group_name")
	private String groupName;

	public List<LsItemCustomAttrItem> getAttrs() {
		return this.attrs;
	}
	public void setAttrs(List<LsItemCustomAttrItem> attrs) {
		this.attrs = attrs;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
