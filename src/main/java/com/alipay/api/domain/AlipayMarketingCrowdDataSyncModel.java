package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群信息同步
 *
 * @author auto create
 * @since 1.0, 2019-06-06 16:22:17
 */
public class AlipayMarketingCrowdDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8595675477958724141L;

	/**
	 * 人群来源业务方，枚举：DATANEST=金融云
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 人群创建者ID
	 */
	@ApiField("create_id")
	private String createId;

	/**
	 * 人群ID
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 人群名称
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 人群中的用户数
	 */
	@ApiField("crowd_size")
	private Long crowdSize;

	/**
	 * 人群状态，枚举：INIT=待生成、EFFECTIVE=已生成、DELETE=已删除
	 */
	@ApiField("crowd_status")
	private String crowdStatus;

	/**
	 * 人群有效期截止时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 人群拥有者ID
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 人群有效期开始时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 人群更新周期，枚举：DAILY=每日更新
	 */
	@ApiField("update_circle_type")
	private String updateCircleType;

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getCreateId() {
		return this.createId;
	}
	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public Long getCrowdSize() {
		return this.crowdSize;
	}
	public void setCrowdSize(Long crowdSize) {
		this.crowdSize = crowdSize;
	}

	public String getCrowdStatus() {
		return this.crowdStatus;
	}
	public void setCrowdStatus(String crowdStatus) {
		this.crowdStatus = crowdStatus;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUpdateCircleType() {
		return this.updateCircleType;
	}
	public void setUpdateCircleType(String updateCircleType) {
		this.updateCircleType = updateCircleType;
	}

}
