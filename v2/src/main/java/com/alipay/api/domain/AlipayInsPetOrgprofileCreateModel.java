package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物保险机构建档接口
 *
 * @author auto create
 * @since 1.0, 2026-07-03 16:57:56
 */
public class AlipayInsPetOrgprofileCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3834452661441355337L;

	/**
	 * 商户的唯一编码，可以取平台自己的商家唯一标识
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 创建档案的外部业务单号，用于接口幂等。可以使用平台自己的宠物档案id
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 宠物生日
	 */
	@ApiField("pet_birthday")
	private String petBirthday;

	/**
	 * 宠物品种编码，需要使用与蚂蚁宠物确认好的品种库
	 */
	@ApiField("pet_breed_code")
	private String petBreedCode;

	/**
	 * 宠物品种名称
	 */
	@ApiField("pet_breed_name")
	private String petBreedName;

	/**
	 * 宠物正脸照链接
	 */
	@ApiField("pet_face_url")
	private String petFaceUrl;

	/**
	 * 宠物性别
	 */
	@ApiField("pet_gender")
	private String petGender;

	/**
	 * 宠物的昵称
	 */
	@ApiField("pet_nick")
	private String petNick;

	/**
	 * 宠物绝育状态
	 */
	@ApiField("pet_no_baby")
	private String petNoBaby;

	/**
	 * 宠物的猫狗大类
	 */
	@ApiField("pet_type")
	private String petType;

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPetBirthday() {
		return this.petBirthday;
	}
	public void setPetBirthday(String petBirthday) {
		this.petBirthday = petBirthday;
	}

	public String getPetBreedCode() {
		return this.petBreedCode;
	}
	public void setPetBreedCode(String petBreedCode) {
		this.petBreedCode = petBreedCode;
	}

	public String getPetBreedName() {
		return this.petBreedName;
	}
	public void setPetBreedName(String petBreedName) {
		this.petBreedName = petBreedName;
	}

	public String getPetFaceUrl() {
		return this.petFaceUrl;
	}
	public void setPetFaceUrl(String petFaceUrl) {
		this.petFaceUrl = petFaceUrl;
	}

	public String getPetGender() {
		return this.petGender;
	}
	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}

	public String getPetNick() {
		return this.petNick;
	}
	public void setPetNick(String petNick) {
		this.petNick = petNick;
	}

	public String getPetNoBaby() {
		return this.petNoBaby;
	}
	public void setPetNoBaby(String petNoBaby) {
		this.petNoBaby = petNoBaby;
	}

	public String getPetType() {
		return this.petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}

}
