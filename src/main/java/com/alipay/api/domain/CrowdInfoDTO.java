package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群信息
 *
 * @author auto create
 * @since 1.0, 2022-06-27 21:21:35
 */
public class CrowdInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2542338712663342253L;

	/**
	 * 人群创建时间+不唯一
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 创建人ID+唯一
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 创建人+不唯一
	 */
	@ApiField("creator_name")
	private String creatorName;

	/**
	 * 人群名称+不唯一
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 人群大小+不唯一
	 */
	@ApiField("crowd_num")
	private Long crowdNum;

	/**
	 * 人群有效时间+不唯一
	 */
	@ApiField("effective_time")
	private String effectiveTime;

	/**
	 * 人群外部key+唯一
	 */
	@ApiField("ext_crowd_key")
	private String extCrowdKey;

	/**
	 * 人群ID+唯一
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 人群状态+不唯一
	 */
	@ApiField("status")
	private String status;

	/**
	 * 人群创建方式+不唯一
	 */
	@ApiField("type")
	private String type;

	/**
	 * 人群更新时间+不唯一
	 */
	@ApiField("update_time")
	private String updateTime;

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return this.creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public Long getCrowdNum() {
		return this.crowdNum;
	}
	public void setCrowdNum(Long crowdNum) {
		this.crowdNum = crowdNum;
	}

	public String getEffectiveTime() {
		return this.effectiveTime;
	}
	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getExtCrowdKey() {
		return this.extCrowdKey;
	}
	public void setExtCrowdKey(String extCrowdKey) {
		this.extCrowdKey = extCrowdKey;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
