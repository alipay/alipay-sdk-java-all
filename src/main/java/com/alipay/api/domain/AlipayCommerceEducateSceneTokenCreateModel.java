package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育场景token生成处理器
 *
 * @author auto create
 * @since 1.0, 2021-06-01 14:04:45
 */
public class AlipayCommerceEducateSceneTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7378432129881856799L;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 1:身份证
2:军官证
3:士兵证
8:台湾居民通行证
A:护照
B:户口簿
Z:其它证件
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 采集人员的支付宝会员标识
	 */
	@ApiField("operator_user_id")
	private String operatorUserId;

	/**
	 * 家长手机号码
	 */
	@ApiField("parent_phone")
	private String parentPhone;

	/**
	 * 学校外标（即学校的统一信用编码）
	 */
	@ApiField("school_std_code")
	private String schoolStdCode;

	/**
	 * 学生姓名
	 */
	@ApiField("student_name")
	private String studentName;

	/**
	 * 教育场景子业务。SCHOOL_PAYMENT_REMOTE_OPEN_ACCOUNT：校园一脸通行集采邀请（生成的token用于集采邀请发送采集阶段）；
SCHOOL_FACE_PASS_QUERY：校园一脸通行查询（生成的token用于查询同学的一脸通行开通状态）；
SCHOOL_FACE_PASS_NAVIGATE：校园一脸通行跳转（生成的token用于个采开通阶段的用户信息填充）；
	 */
	@ApiField("sub_code")
	private String subCode;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getOperatorUserId() {
		return this.operatorUserId;
	}
	public void setOperatorUserId(String operatorUserId) {
		this.operatorUserId = operatorUserId;
	}

	public String getParentPhone() {
		return this.parentPhone;
	}
	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}

	public String getSchoolStdCode() {
		return this.schoolStdCode;
	}
	public void setSchoolStdCode(String schoolStdCode) {
		this.schoolStdCode = schoolStdCode;
	}

	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSubCode() {
		return this.subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

}
