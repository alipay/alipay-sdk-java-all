package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序备案主体信息
 *
 * @author auto create
 * @since 1.0, 2024-01-05 18:18:51
 */
public class IcpSubjectInfo extends AlipayObject {

	private static final long serialVersionUID = 4556533434379764218L;

	/**
	 * 主体详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 主体单位主体附件材料凭证media_id（参考：备案文件材料上传接口）
	 */
	@ApiListField("attachement_materials")
	@ApiField("string")
	private List<String> attachementMaterials;

	/**
	 * 主体负责人法人授权书材料凭证media_id（参考：备案文件材料上传接口）
	 */
	@ApiField("authorization_material")
	private String authorizationMaterial;

	/**
	 * 主体证件注册地
	 */
	@ApiField("certificate_address")
	private String certificateAddress;

	/**
	 * 主体证件号码
	 */
	@ApiField("certificate_number")
	private String certificateNumber;

	/**
	 * 主体证件材料凭证media_id（参考：备案文件材料上传接口）
	 */
	@ApiField("certificate_photo")
	private String certificatePhoto;

	/**
	 * 主体证件类型，示例值：2(参考：获取证件类型接口)
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 小程序主账号人脸核验凭证certify_id（参考：发起小程序备案人脸核验接口）
	 */
	@ApiField("certify_id")
	private String certifyId;

	/**
	 * 备案城市，使用城市代码（参考：获取区域信息的接口）
	 */
	@ApiField("city")
	private String city;

	/**
	 * 主体备注信息
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 主体联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 主体联系人应急手机号
	 */
	@ApiField("contact_emergency_phone_number")
	private String contactEmergencyPhoneNumber;

	/**
	 * 主体联系人手机号
	 */
	@ApiField("contact_phone_number")
	private String contactPhoneNumber;

	/**
	 * 主体负责人证件号码
	 */
	@ApiField("directer_certificate_number")
	private String directerCertificateNumber;

	/**
	 * 主体负责人证件反面材料凭证media_id（参考：备案文件材料上传接口）
	 */
	@ApiField("directer_certificate_photo_back")
	private String directerCertificatePhotoBack;

	/**
	 * 主体负责人证件正面材料凭证media_id（参考：备案文件材料上传接口）
	 */
	@ApiField("directer_certificate_photo_front")
	private String directerCertificatePhotoFront;

	/**
	 * 主体负责人证件类型(参考：获取证件类型接口)
	 */
	@ApiField("directer_certificate_type")
	private String directerCertificateType;

	/**
	 * 主体负责人证件有效期结束日期
	 */
	@ApiField("directer_certificate_validate_end")
	private String directerCertificateValidateEnd;

	/**
	 * 主体负责人证件有效期起始日期，格式为 yyyy-MM-dd
	 */
	@ApiField("directer_certificate_validate_start")
	private String directerCertificateValidateStart;

	/**
	 * 主体负责人姓名
	 */
	@ApiField("directer_name")
	private String directerName;

	/**
	 * 备案县区，使用县区代码（参考：获取区域信息的接口）
	 */
	@ApiField("district")
	private String district;

	/**
	 * 主体单位名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 备案省份，使用省份代码(参考：获取区域信息的接口)
	 */
	@ApiField("province")
	private String province;

	/**
	 * 主体单位性质(参考：获取单位性质的接口)
	 */
	@ApiField("type")
	private String type;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getAttachementMaterials() {
		return this.attachementMaterials;
	}
	public void setAttachementMaterials(List<String> attachementMaterials) {
		this.attachementMaterials = attachementMaterials;
	}

	public String getAuthorizationMaterial() {
		return this.authorizationMaterial;
	}
	public void setAuthorizationMaterial(String authorizationMaterial) {
		this.authorizationMaterial = authorizationMaterial;
	}

	public String getCertificateAddress() {
		return this.certificateAddress;
	}
	public void setCertificateAddress(String certificateAddress) {
		this.certificateAddress = certificateAddress;
	}

	public String getCertificateNumber() {
		return this.certificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getCertificatePhoto() {
		return this.certificatePhoto;
	}
	public void setCertificatePhoto(String certificatePhoto) {
		this.certificatePhoto = certificatePhoto;
	}

	public String getCertificateType() {
		return this.certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertifyId() {
		return this.certifyId;
	}
	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
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

	public String getDirecterCertificateNumber() {
		return this.directerCertificateNumber;
	}
	public void setDirecterCertificateNumber(String directerCertificateNumber) {
		this.directerCertificateNumber = directerCertificateNumber;
	}

	public String getDirecterCertificatePhotoBack() {
		return this.directerCertificatePhotoBack;
	}
	public void setDirecterCertificatePhotoBack(String directerCertificatePhotoBack) {
		this.directerCertificatePhotoBack = directerCertificatePhotoBack;
	}

	public String getDirecterCertificatePhotoFront() {
		return this.directerCertificatePhotoFront;
	}
	public void setDirecterCertificatePhotoFront(String directerCertificatePhotoFront) {
		this.directerCertificatePhotoFront = directerCertificatePhotoFront;
	}

	public String getDirecterCertificateType() {
		return this.directerCertificateType;
	}
	public void setDirecterCertificateType(String directerCertificateType) {
		this.directerCertificateType = directerCertificateType;
	}

	public String getDirecterCertificateValidateEnd() {
		return this.directerCertificateValidateEnd;
	}
	public void setDirecterCertificateValidateEnd(String directerCertificateValidateEnd) {
		this.directerCertificateValidateEnd = directerCertificateValidateEnd;
	}

	public String getDirecterCertificateValidateStart() {
		return this.directerCertificateValidateStart;
	}
	public void setDirecterCertificateValidateStart(String directerCertificateValidateStart) {
		this.directerCertificateValidateStart = directerCertificateValidateStart;
	}

	public String getDirecterName() {
		return this.directerName;
	}
	public void setDirecterName(String directerName) {
		this.directerName = directerName;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
