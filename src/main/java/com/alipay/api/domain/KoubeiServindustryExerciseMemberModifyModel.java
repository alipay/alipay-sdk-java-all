package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑健身会籍修改
 *
 * @author auto create
 * @since 1.0, 2019-08-02 11:41:10
 */
public class KoubeiServindustryExerciseMemberModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6821363324467818354L;

	/**
	 * 外部会籍id
	 */
	@ApiField("external_member_id")
	private String externalMemberId;

	/**
	 * 健身用户id
	 */
	@ApiField("fitness_id")
	private String fitnessId;

	/**
	 * 会籍的到期时间 注：name与会籍的到期时间两个可选字段至少传一个
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 口碑的会籍id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 会籍名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 适用的口碑门店id或商户列表
	 */
	@ApiListField("subject_id_list")
	@ApiField("string")
	private List<String> subjectIdList;

	/**
	 * 新增或者删除关联类型，注：ADD=新增，DELETE=删除
	 */
	@ApiField("subject_operate_type")
	private String subjectOperateType;

	/**
	 * 关联类型，店铺(MEMBER_SHOP)，商户（MEMBER_PARTNER）
	 */
	@ApiField("subject_type")
	private String subjectType;

	public String getExternalMemberId() {
		return this.externalMemberId;
	}
	public void setExternalMemberId(String externalMemberId) {
		this.externalMemberId = externalMemberId;
	}

	public String getFitnessId() {
		return this.fitnessId;
	}
	public void setFitnessId(String fitnessId) {
		this.fitnessId = fitnessId;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getSubjectIdList() {
		return this.subjectIdList;
	}
	public void setSubjectIdList(List<String> subjectIdList) {
		this.subjectIdList = subjectIdList;
	}

	public String getSubjectOperateType() {
		return this.subjectOperateType;
	}
	public void setSubjectOperateType(String subjectOperateType) {
		this.subjectOperateType = subjectOperateType;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

}
