package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应聘回调接口
 *
 * @author auto create
 * @since 1.0, 2019-06-27 13:58:54
 */
public class AlipayEcoEduCampusJobdeliverModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5731242171524795791L;

	/**
	 * 用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 补充文案
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 备用字段
	 */
	@ApiField("content_var")
	private String contentVar;

	/**
	 * 面试地点
	 */
	@ApiField("interview_location")
	private String interviewLocation;

	/**
	 * 面试时间(毫秒)
	 */
	@ApiField("interview_time")
	private String interviewTime;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 职位来源方编码
	 */
	@ApiField("source_code")
	private String sourceCode;

	/**
	 * 职位来源方id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 投递状态: 4被查看;5待处理;6邀面试;7已拒绝;8已录用;9已结束
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 状态更新时间(毫秒)
	 */
	@ApiField("update_time")
	private String updateTime;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getContentVar() {
		return this.contentVar;
	}
	public void setContentVar(String contentVar) {
		this.contentVar = contentVar;
	}

	public String getInterviewLocation() {
		return this.interviewLocation;
	}
	public void setInterviewLocation(String interviewLocation) {
		this.interviewLocation = interviewLocation;
	}

	public String getInterviewTime() {
		return this.interviewTime;
	}
	public void setInterviewTime(String interviewTime) {
		this.interviewTime = interviewTime;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
