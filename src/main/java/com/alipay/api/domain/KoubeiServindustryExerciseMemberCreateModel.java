package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑健身会籍创建
 *
 * @author auto create
 * @since 1.0, 2019-08-01 10:37:15
 */
public class KoubeiServindustryExerciseMemberCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2214956349225499128L;

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
	 * 会籍的到期时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 会籍的开始时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 会籍级别
	 */
	@ApiField("level")
	private String level;

	/**
	 * 会籍名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户ID
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 外部请求ID
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
	 * 关联类型
	 */
	@ApiField("subject_type")
	private String subjectType;

	/**
	 * 口碑的用户id
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
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

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
