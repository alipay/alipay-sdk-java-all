package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园小荷包账号咨询接口
 *
 * @author auto create
 * @since 1.0, 2025-07-16 15:45:54
 */
public class AlipayFundJointaccountSchoolAccountConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8885764871991539192L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 小荷包开户群主openId，用于查询该用户是否开通小荷包。master_user_id与master_open_id不能同时为空，如果同时传值需保证master_user_id和master_open_id的关联性。
	 */
	@ApiField("master_open_id")
	private String masterOpenId;

	/**
	 * 小荷包开户群主userId，用于查询该用户是否开通小荷包。master_user_id与master_open_id不能同时为空，如果同时传值需保证master_user_id和master_open_id的关联性。
	 */
	@ApiField("master_user_id")
	private String masterUserId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 学生证件号，用于验证该学生是否已经加入到指定的小荷包，判断时会验证学生姓名、证件类型、证件号与支付宝侧预留的是否一致
	 */
	@ApiField("student_cert_no")
	private String studentCertNo;

	/**
	 * 学生证件号，用于验证该学生是否已经加入到指定的小荷包，判断时会验证学生姓名、证件类型、证件号与支付宝侧预留的是否一致
	 */
	@ApiField("student_cert_type")
	private String studentCertType;

	/**
	 * 学生姓名，用于验证该学生是否已经加入到指定的小荷包，判断时会验证学生姓名、证件类型、证件号与支付宝侧预留的是否一致
	 */
	@ApiField("student_name")
	private String studentName;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMasterOpenId() {
		return this.masterOpenId;
	}
	public void setMasterOpenId(String masterOpenId) {
		this.masterOpenId = masterOpenId;
	}

	public String getMasterUserId() {
		return this.masterUserId;
	}
	public void setMasterUserId(String masterUserId) {
		this.masterUserId = masterUserId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStudentCertNo() {
		return this.studentCertNo;
	}
	public void setStudentCertNo(String studentCertNo) {
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
