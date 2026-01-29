package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序负责人信息
 *
 * @author auto create
 * @since 1.0, 2024-01-26 16:21:51
 */
public class IcpAppletsPrincipalInfo extends AlipayObject {

	private static final long serialVersionUID = 8386922284431677464L;

	/**
	 * 小程序负责人授权书
	 */
	@ApiListField("authorization_materials")
	@ApiField("string")
	private List<String> authorizationMaterials;

	/**
	 * 小程序负责人证件号码
	 */
	@ApiField("certificate_number")
	private String certificateNumber;

	/**
	 * 小程序负责人证件反面文件材料凭证media_id（参考：备案文件材料上传接口）
	 */
	@ApiField("certificate_photo_back")
	private String certificatePhotoBack;

	/**
	 * 小程序负责人证件正面文件材料凭证media_id（参考：备案文件材料上传接口）
	 */
	@ApiField("certificate_photo_front")
	private String certificatePhotoFront;

	/**
	 * 小程序负责人证件类型（参考：获取证件类型的接口）
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 小程序负责人证件有效期结束日期，格式为 yyyy-MM-dd
如果是长期有效，填写"长期"
	 */
	@ApiField("certificate_validate_end")
	private String certificateValidateEnd;

	/**
	 * 小程序负责人证件有效期起始日期，格式为 yyyy-MM-dd
	 */
	@ApiField("certificate_validate_start")
	private String certificateValidateStart;

	/**
	 * 互联网承诺书文件材料凭证media_id（参考：备案文件材料上传接口）
	 */
	@ApiListField("commit_letter_materials")
	@ApiField("string")
	private List<String> commitLetterMaterials;

	/**
	 * 小程序联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 小程序联系人应急手机号
	 */
	@ApiField("contact_emergency_phone_number")
	private String contactEmergencyPhoneNumber;

	/**
	 * 小程序联系人手机号
	 */
	@ApiField("contact_phone_number")
	private String contactPhoneNumber;

	/**
	 * 小程序负责人姓名
	 */
	@ApiField("name")
	private String name;

	public List<String> getAuthorizationMaterials() {
		return this.authorizationMaterials;
	}
	public void setAuthorizationMaterials(List<String> authorizationMaterials) {
		this.authorizationMaterials = authorizationMaterials;
	}

	public String getCertificateNumber() {
		return this.certificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getCertificatePhotoBack() {
		return this.certificatePhotoBack;
	}
	public void setCertificatePhotoBack(String certificatePhotoBack) {
		this.certificatePhotoBack = certificatePhotoBack;
	}

	public String getCertificatePhotoFront() {
		return this.certificatePhotoFront;
	}
	public void setCertificatePhotoFront(String certificatePhotoFront) {
		this.certificatePhotoFront = certificatePhotoFront;
	}

	public String getCertificateType() {
		return this.certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertificateValidateEnd() {
		return this.certificateValidateEnd;
	}
	public void setCertificateValidateEnd(String certificateValidateEnd) {
		this.certificateValidateEnd = certificateValidateEnd;
	}

	public String getCertificateValidateStart() {
		return this.certificateValidateStart;
	}
	public void setCertificateValidateStart(String certificateValidateStart) {
		this.certificateValidateStart = certificateValidateStart;
	}

	public List<String> getCommitLetterMaterials() {
		return this.commitLetterMaterials;
	}
	public void setCommitLetterMaterials(List<String> commitLetterMaterials) {
		this.commitLetterMaterials = commitLetterMaterials;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactEmergencyPhoneNumber() {
		return this.contactEmergencyPhoneNumber;
	}
	public void setContactEmergencyPhoneNumber(String contactEmergencyPhoneNumber) {
		this.contactEmergencyPhoneNumber = contactEmergencyPhoneNumber;
	}

	public String getContactPhoneNumber() {
		return this.contactPhoneNumber;
	}
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
