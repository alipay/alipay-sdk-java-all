package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投放信息查询
 *
 * @author auto create
 * @since 1.0, 2026-03-23 15:50:26
 */
public class ISPTaskInfo extends AlipayObject {

	private static final long serialVersionUID = 8347964984894758414L;

	/**
	 * 投放设备bizTid列表
	 */
	@ApiListField("biz_ids")
	@ApiField("string")
	private List<String> bizIds;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Long createTime;

	/**
	 * 投放计划结束时间戳
	 */
	@ApiField("end_time")
	private Long endTime;

	/**
	 * 图片文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 修改时间
	 */
	@ApiField("modify_time")
	private Long modifyTime;

	/**
	 * 投放计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 投放计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 优先级
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 海报图片展位编码
电子海报:NORMAL_DISPLAY
支付结果页:PAY_SUCCESS_RESULT
商户信息海报:MERCHANT_INFO_POSTER
	 */
	@ApiField("space_code")
	private String spaceCode;

	/**
	 * 投放计划开始时间戳
	 */
	@ApiField("start_time")
	private Long startTime;

	/**
	 * 4---已上线
5---已失效
6---上线失败
	 */
	@ApiField("status_code")
	private Long statusCode;

	public List<String> getBizIds() {
		return this.bizIds;
	}
	public void setBizIds(List<String> bizIds) {
		this.bizIds = bizIds;
	}

	public Long getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public Long getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(Long modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getSpaceCode() {
		return this.spaceCode;
	}
	public void setSpaceCode(String spaceCode) {
		this.spaceCode = spaceCode;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}

}
