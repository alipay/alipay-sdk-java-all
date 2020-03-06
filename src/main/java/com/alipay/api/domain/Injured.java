package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 伤员信息
 *
 * @author auto create
 * @since 1.0, 2018-04-12 16:01:02
 */
public class Injured extends AlipayObject {

	private static final long serialVersionUID = 2364794294832519923L;

	/**
	 * 姓名，须与证件上名称一致
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，
枚举：
IDENTITY_CARD：身份证
备注：目前仅支持身份证类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 人伤类型，枚举如下：
SCENE_SIMPLE:现场简易处理
CLINIC:门诊
IN_HOSPITAL:住院
MAIM:伤残
DEAD:死亡
	 */
	@ApiField("damage_type")
	private String damageType;

	/**
	 * 伤者身份：
PASSENGER:乘客
DRIVER:司机
THIRD:三者
	 */
	@ApiField("injured_identity")
	private String injuredIdentity;

	/**
	 * 医疗定损员
核赔阶段必传
	 */
	@ApiField("medical_assessor")
	private Person medicalAssessor;

	/**
	 * 医疗查勘员信息
	 */
	@ApiField("medical_surveyor")
	private Person medicalSurveyor;

	/**
	 * 手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

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

	public String getDamageType() {
		return this.damageType;
	}
	public void setDamageType(String damageType) {
		this.damageType = damageType;
	}

	public String getInjuredIdentity() {
		return this.injuredIdentity;
	}
	public void setInjuredIdentity(String injuredIdentity) {
		this.injuredIdentity = injuredIdentity;
	}

	public Person getMedicalAssessor() {
		return this.medicalAssessor;
	}
	public void setMedicalAssessor(Person medicalAssessor) {
		this.medicalAssessor = medicalAssessor;
	}

	public Person getMedicalSurveyor() {
		return this.medicalSurveyor;
	}
	public void setMedicalSurveyor(Person medicalSurveyor) {
		this.medicalSurveyor = medicalSurveyor;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
