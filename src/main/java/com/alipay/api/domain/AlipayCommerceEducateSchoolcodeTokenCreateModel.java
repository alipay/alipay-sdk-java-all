package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请校园码根据用户信息生成token
 *
 * @author auto create
 * @since 1.0, 2020-06-17 21:25:08
 */
public class AlipayCommerceEducateSchoolcodeTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1848854182267417289L;

	/**
	 * 对应证件类型的证件号，用于生成token，学校提供
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 学校国标码，用于生成token，学校提供
	 */
	@ApiField("school_std_code")
	private String schoolStdCode;

	/**
	 * 废弃、请勿使用！！！
对应证件类型的证件号，用于生成token，学校提供
	 */
	@ApiField("student_cert_no")
	private Long studentCertNo;

	/**
	 * 学生证件类型，用于生成token，枚举值: {"1": "居民身份证", "2": "军官证", "3": "士兵证", "4": "文职干部证", "5": "部队离退休证", "6": "香港特区护照/身份证明", "7": "澳门特区护照/身份证明", "8": "台湾居民来往大陆通行证", "9": "境外永久居住证", "A": "护照", "B": "户口簿", "Z": "其他"} ，学校提供
	 */
	@ApiField("student_cert_type")
	private String studentCertType;

	/**
	 * 学生名称，用于生成token，学校提供
	 */
	@ApiField("student_name")
	private String studentName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getSchoolStdCode() {
		return this.schoolStdCode;
	}
	public void setSchoolStdCode(String schoolStdCode) {
		this.schoolStdCode = schoolStdCode;
	}

	public Long getStudentCertNo() {
		return this.studentCertNo;
	}
	public void setStudentCertNo(Long studentCertNo) {
		this.studentCertNo = studentCertNo;
	}

	public String getStudentCertType() {
		return this.studentCertType;
	}
	public void setStudentCertType(String studentCertType) {
		this.studentCertType = studentCertType;
	}

	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
