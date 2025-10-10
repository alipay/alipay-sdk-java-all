package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创意新增或者编辑
 *
 * @author auto create
 * @since 1.0, 2025-07-15 19:51:26
 */
public class AlipayDataDataserviceAdcampaignCreativeCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 2463221419955959536L;

	/**
	 * 创意交互动作属性集合，根据接入文档落地页参数配置来补充相关字段
	 */
	@ApiListField("action_property_list")
	@ApiField("creative_action_property")
	private List<CreativeActionProperty> actionPropertyList;

	/**
	 * 选择的创意交互动作类型需从接口获取，该字段类型从前置模版配置接口获取当前创意可提交的落地页类型
alipay.data.dataservice.adcampaign.actionandtemplate.query
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 创意ID,新增创意时不填写
	 */
	@ApiField("ad_id")
	private Long adId;

	/**
	 * 创意名称
	 */
	@ApiField("ad_name")
	private String adName;

	/**
	 * 创意点击监测地址S2S
	 */
	@ApiField("click_track_url")
	private String clickTrackUrl;

	/**
	 * 创意所属单元id
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 创意曝光监测地址S2S
	 */
	@ApiField("impression_track_url")
	private String impressionTrackUrl;

	/**
	 * 组成创意的文案/视频/图片等素材
	 */
	@ApiListField("material_list")
	@ApiField("creative_material")
	private List<CreativeMaterial> materialList;

	/**
	 * 委托人标识
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * true打开/false关闭
	 */
	@ApiField("smart_switch")
	private Boolean smartSwitch;

	/**
	 * 创意模版ID，根据前置API获取模版配置
alipay.data.dataservice.adcampaign.actionandtemplate.query
	 */
	@ApiField("template_id")
	private Long templateId;

	public List<CreativeActionProperty> getActionPropertyList() {
		return this.actionPropertyList;
	}
	public void setActionPropertyList(List<CreativeActionProperty> actionPropertyList) {
		this.actionPropertyList = actionPropertyList;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public Long getAdId() {
		return this.adId;
	}
	public void setAdId(Long adId) {
		this.adId = adId;
	}

	public String getAdName() {
		return this.adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getClickTrackUrl() {
		return this.clickTrackUrl;
	}
	public void setClickTrackUrl(String clickTrackUrl) {
		this.clickTrackUrl = clickTrackUrl;
	}

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getImpressionTrackUrl() {
		return this.impressionTrackUrl;
	}
	public void setImpressionTrackUrl(String impressionTrackUrl) {
		this.impressionTrackUrl = impressionTrackUrl;
	}

	public List<CreativeMaterial> getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(List<CreativeMaterial> materialList) {
		this.materialList = materialList;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public Boolean getSmartSwitch() {
		return this.smartSwitch;
	}
	public void setSmartSwitch(Boolean smartSwitch) {
		this.smartSwitch = smartSwitch;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

}
