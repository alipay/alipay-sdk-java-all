package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创意详情列表
 *
 * @author auto create
 * @since 1.0, 2020-11-24 15:18:30
 */
public class CreativeDetail extends AlipayObject {

	private static final long serialVersionUID = 3612431883574443162L;

	/**
	 * 落地页动作类型，NO_ACTION-无动作；LP-普通落地页；OPEN_TINYAPP-打开小程序；OPEN_CHANNELS-打开生活号；COLLECT_TINYAPP-收藏小程序；
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 创意最新审核工单号
	 */
	@ApiField("audit_order_id")
	private String auditOrderId;

	/**
	 * 创意分组标识，多个创意可按业务逻辑标识为一个分组
	 */
	@ApiField("batch_tag")
	private String batchTag;

	/**
	 * 创意点击量
	 */
	@ApiField("click")
	private Long click;

	/**
	 * 创意消费数据，单元：分
	 */
	@ApiField("cost")
	private Long cost;

	/**
	 * 广告投放平台生成的创意ID
	 */
	@ApiField("creative_id")
	private Long creativeId;

	/**
	 * 外部平台导入广告库后，广告投放创意对应的外部资源ID
	 */
	@ApiField("creative_outer_id")
	private String creativeOuterId;

	/**
	 * 创意关联的描述列表
	 */
	@ApiListField("desc_list")
	@ApiField("text_instance")
	private List<TextInstance> descList;

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
	 * 创意关联的图片物料列表
	 */
	@ApiListField("img_list")
	@ApiField("material_detail")
	private List<MaterialDetail> imgList;

	/**
	 * 创意展现量
	 */
	@ApiField("impression")
	private Long impression;

	/**
	 * 门店LBS信息，目前仅口碑使用，格式为：经度:纬度:半径(单位:KM,无半径限制直接设置为0)
	 */
	@ApiListField("lbs_list")
	@ApiField("string")
	private List<String> lbsList;

	/**
	 * 创意名称，同一单元下的创意名称不能重复，默认设置为门店名称+outer_id
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部平台导入广告库后，广告投放计划对应的外部资源ID
	 */
	@ApiField("plan_outer_id")
	private String planOuterId;

	/**
	 * 广告投放平台生成委托人ID
	 */
	@ApiField("principal_id")
	private Long principalId;

	/**
	 * 创意审核拒绝的扩展信息
	 */
	@ApiField("refuse_extend_info")
	private CreativeRefuseExtendInfo refuseExtendInfo;

	/**
	 * 创意审核拒绝原因
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	/**
	 * 门店创意关联的城市ID列表，目前仅口碑使用
	 */
	@ApiListField("region_list")
	@ApiField("string")
	private List<String> regionList;

	/**
	 * 创意状态，ENABLE-生效；PAUSE-暂停；DELETE-删除；AUDIT-审核中；REFUSED-审核拒绝
	 */
	@ApiField("status")
	private String status;

	/**
	 * 门店创意关联门店ID，目前仅口碑使用
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 落地页appId
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

	/**
	 * 创意关联的标题列表
	 */
	@ApiListField("title_list")
	@ApiField("text_instance")
	private List<TextInstance> titleList;

	/**
	 * 广告投放平台生成广告主/代理商ID
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * 创意关联的视频物料列表
	 */
	@ApiListField("video_list")
	@ApiField("material_detail")
	private List<MaterialDetail> videoList;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAuditOrderId() {
		return this.auditOrderId;
	}
	public void setAuditOrderId(String auditOrderId) {
		this.auditOrderId = auditOrderId;
	}

	public String getBatchTag() {
		return this.batchTag;
	}
	public void setBatchTag(String batchTag) {
		this.batchTag = batchTag;
	}

	public Long getClick() {
		return this.click;
	}
	public void setClick(Long click) {
		this.click = click;
	}

	public Long getCost() {
		return this.cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}

	public Long getCreativeId() {
		return this.creativeId;
	}
	public void setCreativeId(Long creativeId) {
		this.creativeId = creativeId;
	}

	public String getCreativeOuterId() {
		return this.creativeOuterId;
	}
	public void setCreativeOuterId(String creativeOuterId) {
		this.creativeOuterId = creativeOuterId;
	}

	public List<TextInstance> getDescList() {
		return this.descList;
	}
	public void setDescList(List<TextInstance> descList) {
		this.descList = descList;
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

	public List<MaterialDetail> getImgList() {
		return this.imgList;
	}
	public void setImgList(List<MaterialDetail> imgList) {
		this.imgList = imgList;
	}

	public Long getImpression() {
		return this.impression;
	}
	public void setImpression(Long impression) {
		this.impression = impression;
	}

	public List<String> getLbsList() {
		return this.lbsList;
	}
	public void setLbsList(List<String> lbsList) {
		this.lbsList = lbsList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPlanOuterId() {
		return this.planOuterId;
	}
	public void setPlanOuterId(String planOuterId) {
		this.planOuterId = planOuterId;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

	public CreativeRefuseExtendInfo getRefuseExtendInfo() {
		return this.refuseExtendInfo;
	}
	public void setRefuseExtendInfo(CreativeRefuseExtendInfo refuseExtendInfo) {
		this.refuseExtendInfo = refuseExtendInfo;
	}

	public String getRefuseReason() {
		return this.refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public List<String> getRegionList() {
		return this.regionList;
	}
	public void setRegionList(List<String> regionList) {
		this.regionList = regionList;
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

	public List<TextInstance> getTitleList() {
		return this.titleList;
	}
	public void setTitleList(List<TextInstance> titleList) {
		this.titleList = titleList;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<MaterialDetail> getVideoList() {
		return this.videoList;
	}
	public void setVideoList(List<MaterialDetail> videoList) {
		this.videoList = videoList;
	}

}
