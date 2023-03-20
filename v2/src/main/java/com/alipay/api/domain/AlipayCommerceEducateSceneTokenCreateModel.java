package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育场景token生成处理器
 *
 * @author auto create
 * @since 1.0, 2022-11-17 14:53:49
 */
public class AlipayCommerceEducateSceneTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2136285133757345918L;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型。{1:居民身份证；A:护照；X:学工号}
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 采集人员的支付宝openId。（当sub_code为SCHOOL_PAYMENT_REMOTE_OPEN_ACCOUNT时，当前参数必选）
	 */
	@ApiField("operator_open_id")
	private String operatorOpenId;

	/**
	 * 采集人员的支付宝会员标识。（当sub_code为SCHOOL_PAYMENT_REMOTE_OPEN_ACCOUNT时，当前参数必选）
	 */
	@ApiField("operator_user_id")
	private String operatorUserId;

	/**
	 * 服务商内部唯一ID，升级token模式后必须提供，默认可以不填
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 家长手机号码。
	 */
	@ApiField("parent_phone")
	private String parentPhone;

	/**
	 * 学校外标
	 */
	@ApiField("school_std_code")
	private String schoolStdCode;

	/**
	 * 学生/教职工/访客姓名
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

	public String getOperatorOpenId() {
		return this.operatorOpenId;
	}
	public void setOperatorOpenId(String operatorOpenId) {
		this.operatorOpenId = operatorOpenId;
	}

	public String getOperatorUserId() {
		return this.operatorUserId;
	}
	public void setOperatorUserId(String operatorUserId) {
		this.operatorUserId = operatorUserId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
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
