package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 邀请面试
 *
 * @author auto create
 * @since 1.0, 2026-08-25 10:22:54
 */
public class AlipayEbppJobinterviewInterviewInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 3118626654413412823L;

	/**
	 * 渠道归因码,透传用于面试链接渠道统计。
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 供应商侧候选人唯一ID。平台据此生成内部 candidateId,后续查状态/结果/回传时以返回的 candidateId 为准
	 */
	@ApiField("external_candidate_id")
	private String externalCandidateId;

	/**
	 * 候选人性别。枚举:男=MALE、女=FEMALE
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 候选人身份证号码,用于身份校验。敏感信息,透传存储、不单独展示,请按数据安全规范传输
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 岗位所在城市行政区划编码(如 330100=杭州),用于城市维度归因
	 */
	@ApiField("job_city_code")
	private String jobCityCode;

	/**
	 * 关联岗位ID
	 */
	@ApiField("job_id")
	private String jobId;

	/**
	 * 招聘岗位名称,用于发送面试短信时展示岗位信息。请与门店实际岗位保持一致
	 */
	@ApiField("job_name")
	private String jobName;

	/**
	 * 候选人真实姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 候选人手机号,用于面试短信通知。敏感信息,请按数据安全规范传输
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 面试间唯一ID,由供应商发布面试间后获得,决定候选人进入哪个面试间
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 供应商接入租户唯一标识,由平台分配,所有接口一致透传
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getExternalCandidateId() {
		return this.externalCandidateId;
	}
	public void setExternalCandidateId(String externalCandidateId) {
		this.externalCandidateId = externalCandidateId;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getJobCityCode() {
		return this.jobCityCode;
	}
	public void setJobCityCode(String jobCityCode) {
		this.jobCityCode = jobCityCode;
	}

	public String getJobId() {
		return this.jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return this.jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
