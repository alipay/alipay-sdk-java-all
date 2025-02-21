package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 个性化菜单创建
 *
 * @author auto create
 * @since 1.0, 2024-09-10 19:38:53
 */
public class AlipayOpenPublicPersonalizedMenuCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7337229328662242113L;

	/**
	 * 一级菜单列表。说明：
* 如果是文本菜单，最多有4个一级菜单，若开发者在后台打开了"咨询反馈"的开关，则只能有3个一级菜单。
* 如果是 ICON 菜单信息，最多有80个一级菜单(忽略二级菜单)。
	 */
	@ApiListField("button")
	@ApiField("button_object")
	private List<ButtonObject> button;

	/**
	 * 人群分组id。分组创建及管理接入详情参见 <a href="https://opendocs.alipay.com/fw/api/106931">分组管理</a>。
注意：group_id 与 label_rule（标签规则）不能同时为空。
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 标签规则，目前限定只能传入1条，在个性化菜单创建成功后，满足该标签规则的用户进入生活号首页，将看到该套菜单。生成标签及打标详情参见<a href="https://opendocs.alipay.com/fw/api/106877">标签管理</a>。
注意：group_id（人群分组id） 与 label_rule 不能同时为空。
	 */
	@ApiListField("label_rule")
	@ApiField("label_rule")
	private List<LabelRule> labelRule;

	/**
	 * 手机客户端类型，枚举支持：
*iphone；
*android；
*wp；
说明：不填为不区分机型。
	 */
	@ApiField("mobile_client_type")
	private String mobileClientType;

	/**
	 * 菜单类型，不填时默认为 text（文本型菜单）。枚举值如下：
* text：文本型菜单。
* icon：表示 icon 型菜单，当传值为"icon"时，菜单节点的icon字段必传。
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
