package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 触享同步语音配置任务入库
 *
 * @author auto create
 * @since 1.0, 2026-09-20 10:07:53
 */
public class AlipayCommerceRetailvoiceConfigSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5833891779794618288L;

	/**
	 * 广告主名称
	 */
	@ApiField("advertiser_name")
	private String advertiserName;

	/**
	 * 投放结束时间
	 */
	@ApiField("delivery_end_time")
	private Date deliveryEndTime;

	/**
	 * 投放开始时间
	 */
	@ApiField("delivery_start_time")
	private Date deliveryStartTime;

	/**
	 * SN数量(对账基准)
	 */
	@ApiField("expected_sn_count")
	private Long expectedSnCount;

	/**
	 * null
	 */
	@ApiListField("material_ids")
	@ApiField("string")
	private List<String> materialIds;

	/**
	 * AFTS文件ID
	 */
	@ApiField("scope_file_id")
	private String scopeFileId;

	/**
	 * 范围类型(DEVICE_SN)
	 */
	@ApiField("scope_type")
	private String scopeType;

	/**
	 * 触享业务主键(幂等键1)
	 */
	@ApiField("source_task_id")
	private String sourceTaskId;

	/**
	 * 触享版本号(幂等键2)
	 */
	@ApiField("source_version")
	private String sourceVersion;

	/**
	 * 模板类型(LINKAGE_VOICE)
	 */
	@ApiField("template_type")
	private String templateType;

	/**
	 * 触点类型ALL/BEFORE/AFTER
	 */
	@ApiField("touchpoint_type")
	private String touchpointType;

	/**
	 * null
	 */
	@ApiListField("voice_content_list")
	@ApiField("voice_content")
	private List<VoiceContent> voiceContentList;

	public String getAdvertiserName() {
		return this.advertiserName;
	}
	public void setAdvertiserName(String advertiserName) {
		this.advertiserName = advertiserName;
	}

	public Date getDeliveryEndTime() {
		return this.deliveryEndTime;
	}
	public void setDeliveryEndTime(Date deliveryEndTime) {
		this.deliveryEndTime = deliveryEndTime;
	}

	public Date getDeliveryStartTime() {
		return this.deliveryStartTime;
	}
	public void setDeliveryStartTime(Date deliveryStartTime) {
		this.deliveryStartTime = deliveryStartTime;
	}

	public Long getExpectedSnCount() {
		return this.expectedSnCount;
	}
	public void setExpectedSnCount(Long expectedSnCount) {
		this.expectedSnCount = expectedSnCount;
	}

	public List<String> getMaterialIds() {
		return this.materialIds;
	}
	public void setMaterialIds(List<String> materialIds) {
		this.materialIds = materialIds;
	}

	public String getScopeFileId() {
		return this.scopeFileId;
	}
	public void setScopeFileId(String scopeFileId) {
		this.scopeFileId = scopeFileId;
	}

	public String getScopeType() {
		return this.scopeType;
	}
	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
	}

	public String getSourceTaskId() {
		return this.sourceTaskId;
	}
	public void setSourceTaskId(String sourceTaskId) {
		this.sourceTaskId = sourceTaskId;
	}

	public String getSourceVersion() {
		return this.sourceVersion;
	}
	public void setSourceVersion(String sourceVersion) {
		this.sourceVersion = sourceVersion;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	public String getTouchpointType() {
		return this.touchpointType;
	}
	public void setTouchpointType(String touchpointType) {
		this.touchpointType = touchpointType;
	}

	public List<VoiceContent> getVoiceContentList() {
		return this.voiceContentList;
	}
	public void setVoiceContentList(List<VoiceContent> voiceContentList) {
		this.voiceContentList = voiceContentList;
	}

}
