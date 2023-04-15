package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 宠物档案对象，包括基本信息
 *
 * @author auto create
 * @since 1.0, 2020-12-28 15:20:31
 */
public class PetProfile extends AlipayObject {

	private static final long serialVersionUID = 3555991376481999257L;

	/**
	 * 算法识别的宠物种类code编码
	 */
	@ApiField("algorithm_pet_species_code")
	private String algorithmPetSpeciesCode;

	/**
	 * 宠物毛色
	 */
	@ApiField("coat_color")
	private String coatColor;

	/**
	 * 宠物资料是否齐全 0 不齐全 1 齐全
	 */
	@ApiField("doc_complete")
	private Long docComplete;

	/**
	 * 档案状态，0 档案创建 1 档案暂存
	 */
	@ApiField("doc_status")
	private Long docStatus;

	/**
	 * 身份证号码,全局唯一
	 */
	@ApiField("identify_id")
	private String identifyId;

	/**
	 * 鼻纹ID
	 */
	@ApiField("nose_print_id")
	private String nosePrintId;

	/**
	 * 鼻纹最后上传时间
	 */
	@ApiField("nose_print_last_upload_time")
	private Date nosePrintLastUploadTime;

	/**
	 * 宠物生日
	 */
	@ApiField("pet_birthday")
	private Date petBirthday;

	/**
	 * 宠物是否可编辑
	 */
	@ApiField("pet_edit")
	private Boolean petEdit;

	/**
	 * 宠物性别
	 */
	@ApiField("pet_gender")
	private String petGender;

	/**
	 * 宠物ID
	 */
	@ApiField("pet_id")
	private String petId;

	/**
	 * 宠物昵称
	 */
	@ApiField("pet_nick")
	private String petNick;

	/**
	 * 是否绝育，0否，1是
	 */
	@ApiField("pet_no_baby")
	private String petNoBaby;

	/**
	 * 宠物照片列表
	 */
	@ApiListField("pet_pic_param_list")
	@ApiField("pet_pic_data")
	private List<PetPicData> petPicParamList;

	/**
	 * 宠物种类
	 */
	@ApiField("pet_species")
	private String petSpecies;

	/**
	 * 宠物种类编码
	 */
	@ApiField("pet_species_code")
	private String petSpeciesCode;

	/**
	 * '宠物类别:code编码, 猫、狗等'
	 */
	@ApiField("pet_type")
	private String petType;

	/**
	 * 宠物投保的保单状态
	 */
	@ApiField("policy_status")
	private Long policyStatus;

	public String getAlgorithmPetSpeciesCode() {
		return this.algorithmPetSpeciesCode;
	}
	public void setAlgorithmPetSpeciesCode(String algorithmPetSpeciesCode) {
		this.algorithmPetSpeciesCode = algorithmPetSpeciesCode;
	}

	public String getCoatColor() {
		return this.coatColor;
	}
	public void setCoatColor(String coatColor) {
		this.coatColor = coatColor;
	}

	public Long getDocComplete() {
		return this.docComplete;
	}
	public void setDocComplete(Long docComplete) {
		this.docComplete = docComplete;
	}

	public Long getDocStatus() {
		return this.docStatus;
	}
	public void setDocStatus(Long docStatus) {
		this.docStatus = docStatus;
	}

	public String getIdentifyId() {
		return this.identifyId;
	}
	public void setIdentifyId(String identifyId) {
		this.identifyId = identifyId;
	}

	public String getNosePrintId() {
		return this.nosePrintId;
	}
	public void setNosePrintId(String nosePrintId) {
		this.nosePrintId = nosePrintId;
	}

	public Date getNosePrintLastUploadTime() {
		return this.nosePrintLastUploadTime;
	}
	public void setNosePrintLastUploadTime(Date nosePrintLastUploadTime) {
		this.nosePrintLastUploadTime = nosePrintLastUploadTime;
	}

	public Date getPetBirthday() {
		return this.petBirthday;
	}
	public void setPetBirthday(Date petBirthday) {
		this.petBirthday = petBirthday;
	}

	public Boolean getPetEdit() {
		return this.petEdit;
	}
	public void setPetEdit(Boolean petEdit) {
		this.petEdit = petEdit;
	}

	public String getPetGender() {
		return this.petGender;
	}
	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}

	public String getPetId() {
		return this.petId;
	}
	public void setPetId(String petId) {
		this.petId = petId;
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

	public List<PetPicData> getPetPicParamList() {
		return this.petPicParamList;
	}
	public void setPetPicParamList(List<PetPicData> petPicParamList) {
		this.petPicParamList = petPicParamList;
	}

	public String getPetSpecies() {
		return this.petSpecies;
	}
	public void setPetSpecies(String petSpecies) {
		this.petSpecies = petSpecies;
	}

	public String getPetSpeciesCode() {
		return this.petSpeciesCode;
	}
	public void setPetSpeciesCode(String petSpeciesCode) {
		this.petSpeciesCode = petSpeciesCode;
	}

	public String getPetType() {
		return this.petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}

	public Long getPolicyStatus() {
		return this.policyStatus;
	}
	public void setPolicyStatus(Long policyStatus) {
		this.policyStatus = policyStatus;
	}

}
