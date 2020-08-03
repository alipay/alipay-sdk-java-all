package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生信息查询
 *
 * @author auto create
 * @since 1.0, 2017-08-14 11:04:54
 */
public class AlipayEcoEduKtStudentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6482872649159466592L;

	/**
	 * 已经签约教育缴费的isv的支付宝PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 学校编号，调用alipay.eco.edu.kt.schoolinfo.modify接口录入学校信息时，接口返回的编号
	 */
	@ApiField("school_no")
	private String schoolNo;

	/**
	 * 学校用来签约支付宝教育缴费的支付宝PID
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 通过alipay.eco.edu.kt.billing.send发送教育缴费账单时，支付宝返回这个student_no,如果支付宝系统中还没有这个学生，则会根据学生的属性，创建一个全局唯一的学生缴费账号并返回。
	 */
	@ApiField("student_no")
	private String studentNo;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getSchoolNo() {
		return this.schoolNo;
	}
	public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}

	public String getSchoolPid() {
		return this.schoolPid;
	}
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

	public String getStudentNo() {
		return this.studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

}
