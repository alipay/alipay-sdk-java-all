package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系人信息
 *
 * @author auto create
 * @since 1.0, 2023-10-25 17:53:44
 */
public class ContactUserInfo extends AlipayObject {

	private static final long serialVersionUID = 4346756551878753877L;

	/**
	 * 授权函存储标识
	 */
	@ApiField("auth_file")
	private String authFile;

	/**
	 * 证件正面图片存储标识
	 */
	@ApiField("cert_image")
	private String certImage;

	/**
	 * 证件背面图片存储标识
	 */
	@ApiField("cert_image_back")
	private String certImageBack;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 营业执照: 201
事业单位法人证书: 218
民办非企业登记证书: 204
社会团体法人登记证书: 206
党政机关批准设立文件/行政执法主体资格证: 219
个人身份证: 100
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系人手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getAuthFile() {
		return this.authFile;
	}
	public void setAuthFile(String authFile) {
		this.authFile = authFile;
	}

	public String getCertImage() {
		return this.certImage;
	}
	public void setCertImage(String certImage) {
		this.certImage = certImage;
	}

	public String getCertImageBack() {
		return this.certImageBack;
	}
	public void setCertImageBack(String certImageBack) {
		this.certImageBack = certImageBack;
	}

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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
