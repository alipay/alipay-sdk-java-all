package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 个性化菜单创建
 *
 * @author auto create
 * @since 1.0, 2020-08-20 17:42:17
 */
public class AlipayOpenPublicPersonalizedMenuCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6291966499795195891L;

	/**
	 * 一级菜单列表。如果是文本菜单，最多有3个一级菜单，最多5个二级菜单；如果是 ICON 菜单信息，最多有80个一级菜单，ICON菜单不支持二级菜单
	 */
	@ApiListField("button")
	@ApiField("button_object")
	private List<ButtonObject> button;

	/**
	 * 人群分组id。人群分组与标签规则不能同时为空
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 标签规则，目前限定只能传入1条，在个性化菜单创建成功后，满足该标签规则的用户进入生活号首页，将看到该套菜单。人群分组ID与标签规则不能同时为空
	 */
	@ApiListField("label_rule")
	@ApiField("label_rule")
	private List<LabelRule> labelRule;

	/**
	 * 手机客户端类型，iphone、android、wp,不填为不区分机型
	 */
	@ApiField("mobile_client_type")
	private String mobileClientType;

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

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<LabelRule> getLabelRule() {
		return this.labelRule;
	}
	public void setLabelRule(List<LabelRule> labelRule) {
		this.labelRule = labelRule;
	}

	public String getMobileClientType() {
		return this.mobileClientType;
	}
	public void setMobileClientType(String mobileClientType) {
		this.mobileClientType = mobileClientType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
