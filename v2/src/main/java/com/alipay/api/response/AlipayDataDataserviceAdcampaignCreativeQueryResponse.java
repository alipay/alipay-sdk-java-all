package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreativeActionProperty;
import com.alipay.api.domain.CreativeMaterial;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.creative.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-07 13:45:49
 */
public class AlipayDataDataserviceAdcampaignCreativeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2578754569455187948L;

	/** 
	 * 交互动作属性集合
	 */
	@ApiListField("action_property_list")
	@ApiField("creative_action_property")
	private List<CreativeActionProperty> actionPropertyList;

	/** 
	 * 选择的创意交互动作方式，该字段类型说明可参考对客接口文档落地页部分
	 */
	@ApiField("action_type")
	private String actionType;

	/** 
	 * 创意id
	 */
	@ApiField("ad_id")
	private Long adId;

	/** 
	 * 创意名称
	 */
	@ApiField("ad_name")
	private String adName;

	/** 
	 * 创意点击检测地址
	 */
	@ApiField("click_track_url")
	private String clickTrackUrl;

	/** 
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 所属单元id
	 */
	@ApiField("group_id")
	private Long groupId;

	/** 
	 * 所属单元名称
	 */
	@ApiField("group_name")
	private String groupName;

	/** 
	 * 创意曝光检测地址
	 */
	@ApiField("impression_track_url")
	private String impressionTrackUrl;

	/** 
	 * 二级营销目标code
	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/** 
	 * 二级营销目标名称
	 */
	@ApiField("market_target_name")
	private String marketTargetName;

	/** 
	 * 组成创意的文案/视频/图片等素材
	 */
	@ApiListField("material_list")
	@ApiField("creative_material")
	private List<CreativeMaterial> materialList;

	/** 
	 * 所属计划id
	 */
	@ApiField("plan_id")
	private Long planId;

	/** 
	 * 计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/** 
	 * 商家id
	 */
	@ApiField("principal_id")
	private Long principalId;

	/** 
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/** 
	 * 创意状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 创意模板ID
	 */
	@ApiField("template_id")
	private Long templateId;

	public void setActionPropertyList(List<CreativeActionProperty> actionPropertyList) {
		this.actionPropertyList = actionPropertyList;
	}
	public List<CreativeActionProperty> getActionPropertyList( ) {
		return this.actionPropertyList;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public String getActionType( ) {
		return this.actionType;
	}

	public void setAdId(Long adId) {
		this.adId = adId;
	}
	public Long getAdId( ) {
		return this.adId;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAdName( ) {
		return this.adName;
	}

	public void setClickTrackUrl(String clickTrackUrl) {
		this.clickTrackUrl = clickTrackUrl;
	}
	public String getClickTrackUrl( ) {
		return this.clickTrackUrl;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Long getGroupId( ) {
		return this.groupId;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupName( ) {
		return this.groupName;
	}

	public void setImpressionTrackUrl(String impressionTrackUrl) {
		this.impressionTrackUrl = impressionTrackUrl;
	}
	public String getImpressionTrackUrl( ) {
		return this.impressionTrackUrl;
	}

	public void setMarketTargetCode(String marketTargetCode) {
		this.marketTargetCode = marketTargetCode;
	}
	public String getMarketTargetCode( ) {
		return this.marketTargetCode;
	}

	public void setMarketTargetName(String marketTargetName) {
		this.marketTargetName = marketTargetName;
	}
	public String getMarketTargetName( ) {
		return this.marketTargetName;
	}

	public void setMaterialList(List<CreativeMaterial> materialList) {
		this.materialList = materialList;
	}
	public List<CreativeMaterial> getMaterialList( ) {
		return this.materialList;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public Long getPlanId( ) {
		return this.planId;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanName( ) {
		return this.planName;
	}

	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}
	public Long getPrincipalId( ) {
		return this.principalId;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode( ) {
		return this.sceneCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}
	public Long getTemplateId( ) {
		return this.templateId;
	}

}
