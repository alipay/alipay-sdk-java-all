package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 学生信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class EduStudentInfoShareResult extends AlipayObject {

	private static final long serialVersionUID = 2183256293944327842L;

	/**
	 * 教育分类
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 学生详细信息
	 */
	@ApiListField("student_infos")
	@ApiField("student_info")
	private List<StudentInfo> studentInfos;

	/**
	 * 用户的userid
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public List<StudentInfo> getStudentInfos() {
		return this.studentInfos;
	}
	public void setStudentInfos(List<StudentInfo> studentInfos) {
		this.studentInfos = studentInfos;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
