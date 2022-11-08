package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 录入机构用户信息请求对象
 *
 * @author auto create
 * @since 1.0, 2022-04-11 14:10:35
 */
public class IotVspOrgUserAddUserInfoRequest extends AlipayObject {

	private static final long serialVersionUID = 5675263385148193841L;

	/**
	 * 姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，枚举支持：IDENTITY_CARD身份证，PASS_PORT护照，STU_NUM学生学号，COMPANY_NUM工号，TAIWAN_CARD台胞证，HK_MC_CARD港澳证件
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 扩展信息，ISV自定义，如无可为空
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 手机号码
	 */
	@ApiField("phone")
	private String phone;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
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

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
