package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * K12一脸通行通过集采照片开通申请
 *
 * @author auto create
 * @since 1.0, 2022-11-30 10:48:16
 */
public class AlipayCommerceEducateScenePhotoremoteApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8718241216848445614L;

	/**
	 * 证件编号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型。{1:居民身份证；A:护照；X:学工号}
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 学生上半身照片的Base64编码。（注：1.图片的格式必须是jpg的；2.图片大小不超过125KB；3.非Data URI格式，请直接返回原文件的base64编码）
	 */
	@ApiField("image_content")
	private String imageContent;

	/**
	 * 外部照片Id。（注：用于关联当前提交的学生信息。如果同一个学生尝试重新提交，请务必生成新的id）
	 */
	@ApiField("out_photo_id")
	private String outPhotoId;

	/**
	 * 用户外部ID。（服务商内部唯一ID，唯一关联一位学生/教职工)
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 学生家长支付宝账号绑定的手机号。
	 */
	@ApiField("parent_phone_number")
	private String parentPhoneNumber;

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

	public String getImageContent() {
		return this.imageContent;
	}
	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

	public String getOutPhotoId() {
		return this.outPhotoId;
	}
	public void setOutPhotoId(String outPhotoId) {
		this.outPhotoId = outPhotoId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getParentPhoneNumber() {
		return this.parentPhoneNumber;
	}
	public void setParentPhoneNumber(String parentPhoneNumber) {
		this.parentPhoneNumber = parentPhoneNumber;
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

}
