package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新增或修改创意
 *
 * @author auto create
 * @since 1.0, 2021-09-23 09:36:23
 */
public class AlipayDataDataserviceAdCreativeCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 6131389291982788438L;

	/**
	 * 创意交互行为属性实例值
	 */
	@ApiListField("action_property_list")
	@ApiField("action_property")
	private List<ActionProperty> actionPropertyList;

	/**
	 * 落地页动作类型，NO_ACTION-无动作；LP-普通落地页；OPEN_TINYAPP-打开小程序；OPEN_CHANNELS-打开生活号；COLLECT_TINYAPP-收藏小程序；
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 转化监控URL，如留资等
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 创意补充资质
	 */
	@ApiListField("attachment_list")
	@ApiField("outer_attachment")
	private List<OuterAttachment> attachmentList;

	/**
	 * 创意分组标识，多个创意可按业务逻辑标识为一个分组
	 */
	@ApiField("batch_tag")
	private String batchTag;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 点击监控URL
	 */
	@ApiField("click_track_url")
	private String clickTrackUrl;

	/**
	 * 外部平台导入广告库后，广告投放创意对应的外部资源ID
	 */
	@ApiField("creative_outer_id")
	private String creativeOuterId;

	/**
	 * 创意业务扩展参数字段，根据第三方需要使用，投放端只做存储并向检索端透传
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 外部平台导入广告库后，广告投放单元对应的外部资源ID
	 */
	@ApiField("group_outer_id")
	private String groupOuterId;

	/**
	 * 展现监控URL
	 */
	@ApiField("impression_track_url")
	private String impressionTrackUrl;

	/**
	 * 门店LBS信息，目前仅口碑使用，格式为：经度:纬度:半径(单位:KM,无半径限制直接设置为0)
	 */
	@ApiListField("lbs_list")
	@ApiField("string")
	private List<String> lbsList;

	/**
	 * 创意关联物料元素列表
	 */
	@ApiListField("material_list")
	@ApiField("material_unit")
	private List<MaterialUnit> materialList;

	/**
	 * 创意名称，同一单元下的创意名称不能重复，默认设置为门店名称+outer_id
	 */
	@ApiField("name")
	private String name;

	/**
	 * 门店创意关联的城市ID列表，目前仅口碑使用
	 */
	@ApiListField("region_list")
	@ApiField("string")
	private List<String> regionList;

	/**
	 * 广告关联rta请求编号
	 */
	@ApiField("rta_id")
	private String rtaId;

	/**
	 * 创意状态，ENABLE-生效；PAUSE-暂停
	 */
	@ApiField("status")
	private String status;

	/**
	 * 门店创意关联门店ID，目前仅口碑使用
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 落地页关联的支付宝生活号或小程序关联appId
	 */
	@ApiField("target_app_id")
	private String targetAppId;

	/**
	 * 创意落地页url地址
	 */
	@ApiField("target_url")
	private String targetUrl;

	/**
	 * 创意关联模板ID，由投放平台管理生成
	 */
	@ApiField("template_id")
	private Long templateId;

	public List<ActionProperty> getActionPropertyList() {
		return this.actionPropertyList;
	}
	public void setActionPropertyList(List<ActionProperty> actionPropertyList) {
		this.actionPropertyList = actionPropertyList;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public List<OuterAttachment> getAttachmentList() {
		return this.attachmentList;
	}
	public void setAttachmentList(List<OuterAttachment> attachmentList) {
		this.attachmentList = attachmentList;
	}

	public String getBatchTag() {
		return this.batchTag;
	}
	public void setBatchTag(String batchTag) {
		this.batchTag = batchTag;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getClickTrackUrl() {
		return this.clickTrackUrl;
	}
	public void setClickTrackUrl(String clickTrackUrl) {
		this.clickTrackUrl = clickTrackUrl;
	}

	public String getCreativeOuterId() {
		return this.creativeOuterId;
	}
	public void setCreativeOuterId(String creativeOuterId) {
		this.creativeOuterId = creativeOuterId;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getGroupOuterId() {
		return this.groupOuterId;
	}
	public void setGroupOuterId(String groupOuterId) {
		this.groupOuterId = groupOuterId;
	}

	public String getImpressionTrackUrl() {
		return this.impressionTrackUrl;
	}
	public void setImpressionTrackUrl(String impressionTrackUrl) {
		this.impressionTrackUrl = impressionTrackUrl;
	}

	public List<String> getLbsList() {
		return this.lbsList;
	}
	public void setLbsList(List<String> lbsList) {
		this.lbsList = lbsList;
	}

	public List<MaterialUnit> getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(List<MaterialUnit> materialList) {
		this.materialList = materialList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getRegionList() {
		return this.regionList;
	}
	public void setRegionList(List<String> regionList) {
		this.regionList = regionList;
	}

	public String getRtaId() {
		return this.rtaId;
	}
	public void setRtaId(String rtaId) {
		this.rtaId = rtaId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTargetAppId() {
		return this.targetAppId;
	}
	public void setTargetAppId(String targetAppId) {
		this.targetAppId = targetAppId;
	}

	public String getTargetUrl() {
		return this.targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

}
