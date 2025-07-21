package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 儿童账户关联
 *
 * @author auto create
 * @since 1.0, 2023-03-20 15:43:39
 */
public class AlipayCommerceKidsAccountBindModel extends AlipayObject {

	private static final long serialVersionUID = 2866348947583585672L;

	/**
	 * 与child_cert_type对应，如果child_cert_type为IDENTITY_CARD，对应的取值为身份证号
	 */
	@ApiField("child_cert_no")
	private String childCertNo;

	/**
	 * 证件类型，暂时只支持身份证
	 */
	@ApiField("child_cert_type")
	private String childCertType;

	/**
	 * 儿童唯一id
	 */
	@ApiField("child_id")
	private String childId;

	/**
	 * 儿童名字
	 */
	@ApiField("child_name")
	private String childName;

	/**
	 * 所在班级
	 */
	@ApiField("class_name")
	private String className;

	/**
	 * 联系人手机
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 家长支付宝openid，创建的账户将会同时与家长绑定关系
	 */
	@ApiField("parent_open_id")
	private String parentOpenId;

	/**
	 * 家长支付宝userId，创建的账户将会同时与家长绑定关系
	 */
	@ApiField("parent_uid")
	private String parentUid;

	/**
	 * 场景码，接入前需要进行申请
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 学校id，建议采用支付宝分配的学校编号
	 */
	@ApiField("school_id")
	private String schoolId;

	/**
	 * 学号
	 */
	@ApiField("student_no")
	private String studentNo;

	public String getChildCertNo() {
		return this.childCertNo;
	}
	public void setChildCertNo(String childCertNo) {
		this.childCertNo = childCertNo;
	}

	public String getChildCertType() {
		return this.childCertType;
	}
	public void setChildCertType(String childCertType) {
		this.childCertType = childCertType;
	}

	public String getChildId() {
		return this.childId;
	}
	public void setChildId(String childId) {
		this.childId = childId;
	}

	public String getChildName() {
		return this.childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}

	public String getClassName() {
		return this.className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getParentOpenId() {
		return this.parentOpenId;
	}
	public void setParentOpenId(String parentOpenId) {
		this.parentOpenId = parentOpenId;
	}

	public String getParentUid() {
		return this.parentUid;
	}
	public void setParentUid(String parentUid) {
		this.parentUid = parentUid;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getStudentNo() {
		return this.studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

}
