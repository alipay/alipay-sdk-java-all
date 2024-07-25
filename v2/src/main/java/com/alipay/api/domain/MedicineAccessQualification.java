package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗器械准入资质
 *
 * @author auto create
 * @since 1.0, 2024-05-09 14:35:20
 */
public class MedicineAccessQualification extends AlipayObject {

	private static final long serialVersionUID = 8891956287356236327L;

	/**
	 * 医疗器械产品审批名称
	 */
	@ApiField("access_qualification_approval_name")
	private String accessQualificationApprovalName;

	/**
	 * 医疗器械准入资质类型
	 */
	@ApiField("access_qualification_approval_type")
	private String accessQualificationApprovalType;

	/**
	 * 医疗器械注册证编号
	 */
	@ApiField("access_qualification_cert_no")
	private String accessQualificationCertNo;

	/**
	 * 注册或备案证明审批部门
	 */
	@ApiField("access_qualification_department")
	private String accessQualificationDepartment;

	/**
	 * 注册/备案生效日期
	 */
	@ApiField("access_qualification_effective_date")
	private String accessQualificationEffectiveDate;

	/**
	 * 注册/备案有效期至
	 */
	@ApiField("access_qualification_expiration_date")
	private String accessQualificationExpirationDate;

	/**
	 * 通过图片文件上传接口上传图片后获取文件Id
	 */
	@ApiField("access_qualification_image")
	private String accessQualificationImage;

	/**
	 * 注册人或备案人信息
	 */
	@ApiField("access_qualification_person")
	private String accessQualificationPerson;

	public String getAccessQualificationApprovalName() {
		return this.accessQualificationApprovalName;
	}
	public void setAccessQualificationApprovalName(String accessQualificationApprovalName) {
		this.accessQualificationApprovalName = accessQualificationApprovalName;
	}

	public String getAccessQualificationApprovalType() {
		return this.accessQualificationApprovalType;
	}
	public void setAccessQualificationApprovalType(String accessQualificationApprovalType) {
		this.accessQualificationApprovalType = accessQualificationApprovalType;
	}

	public String getAccessQualificationCertNo() {
		return this.accessQualificationCertNo;
	}
	public void setAccessQualificationCertNo(String accessQualificationCertNo) {
		this.accessQualificationCertNo = accessQualificationCertNo;
	}

	public String getAccessQualificationDepartment() {
		return this.accessQualificationDepartment;
	}
	public void setAccessQualificationDepartment(String accessQualificationDepartment) {
		this.accessQualificationDepartment = accessQualificationDepartment;
	}

	public String getAccessQualificationEffectiveDate() {
		return this.accessQualificationEffectiveDate;
	}
	public void setAccessQualificationEffectiveDate(String accessQualificationEffectiveDate) {
		this.accessQualificationEffectiveDate = accessQualificationEffectiveDate;
	}

	public String getAccessQualificationExpirationDate() {
		return this.accessQualificationExpirationDate;
	}
	public void setAccessQualificationExpirationDate(String accessQualificationExpirationDate) {
		this.accessQualificationExpirationDate = accessQualificationExpirationDate;
	}

	public String getAccessQualificationImage() {
		return this.accessQualificationImage;
	}
	public void setAccessQualificationImage(String accessQualificationImage) {
		this.accessQualificationImage = accessQualificationImage;
	}

	public String getAccessQualificationPerson() {
		return this.accessQualificationPerson;
	}
	public void setAccessQualificationPerson(String accessQualificationPerson) {
		this.accessQualificationPerson = accessQualificationPerson;
	}

}
