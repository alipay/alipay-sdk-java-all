package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PetPicData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insassetprod.petprofile.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:32:01
 */
public class AlipayInsSceneInsassetprodPetprofileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6897783874254159822L;

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
	 * 鼻纹更新时间
	 */
	@ApiField("nose_print_last_upload_time")
	private Date nosePrintLastUploadTime;

	/** 
	 * 宠物生日，年-月-日
	 */
	@ApiField("pet_birthday")
	private Date petBirthday;

	/** 
	 * 宠物是否可编辑
	 */
	@ApiField("pet_edit")
	private Boolean petEdit;

	/** 
	 * 宠物性别：1公 2 母
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
	 * 是否绝育
	 */
	@ApiField("pet_no_baby")
	private String petNoBaby;

	/** 
	 * 宠物图片列表
	 */
	@ApiListField("pet_pic_param_list")
	@ApiField("pet_pic_data")
	private List<PetPicData> petPicParamList;

	/** 
	 * 宠物种类:code编码，阿拉斯加犬等
	 */
	@ApiField("pet_species")
	private String petSpecies;

	/** 
	 * 宠物种类:code编码，阿拉斯加犬等
	 */
	@ApiField("pet_species_code")
	private String petSpeciesCode;

	/** 
	 * 宠物类别:code编码, 1000/2000等
	 */
	@ApiField("pet_type")
	private String petType;

	/** 
	 * 保单类型
	 */
	@ApiField("policy_status")
	private Long policyStatus;

	public void setAlgorithmPetSpeciesCode(String algorithmPetSpeciesCode) {
		this.algorithmPetSpeciesCode = algorithmPetSpeciesCode;
	}
	public String getAlgorithmPetSpeciesCode( ) {
		return this.algorithmPetSpeciesCode;
	}

	public void setCoatColor(String coatColor) {
		this.coatColor = coatColor;
	}
	public String getCoatColor( ) {
		return this.coatColor;
	}

	public void setDocComplete(Long docComplete) {
		this.docComplete = docComplete;
	}
	public Long getDocComplete( ) {
		return this.docComplete;
	}

	public void setDocStatus(Long docStatus) {
		this.docStatus = docStatus;
	}
	public Long getDocStatus( ) {
		return this.docStatus;
	}

	public void setIdentifyId(String identifyId) {
		this.identifyId = identifyId;
	}
	public String getIdentifyId( ) {
		return this.identifyId;
	}

	public void setNosePrintId(String nosePrintId) {
		this.nosePrintId = nosePrintId;
	}
	public String getNosePrintId( ) {
		return this.nosePrintId;
	}

	public void setNosePrintLastUploadTime(Date nosePrintLastUploadTime) {
		this.nosePrintLastUploadTime = nosePrintLastUploadTime;
	}
	public Date getNosePrintLastUploadTime( ) {
		return this.nosePrintLastUploadTime;
	}

	public void setPetBirthday(Date petBirthday) {
		this.petBirthday = petBirthday;
	}
	public Date getPetBirthday( ) {
		return this.petBirthday;
	}

	public void setPetEdit(Boolean petEdit) {
		this.petEdit = petEdit;
	}
	public Boolean getPetEdit( ) {
		return this.petEdit;
	}

	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}
	public String getPetGender( ) {
		return this.petGender;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}
	public String getPetId( ) {
		return this.petId;
	}

	public void setPetNick(String petNick) {
		this.petNick = petNick;
	}
	public String getPetNick( ) {
		return this.petNick;
	}

	public void setPetNoBaby(String petNoBaby) {
		this.petNoBaby = petNoBaby;
	}
	public String getPetNoBaby( ) {
		return this.petNoBaby;
	}

	public void setPetPicParamList(List<PetPicData> petPicParamList) {
		this.petPicParamList = petPicParamList;
	}
	public List<PetPicData> getPetPicParamList( ) {
		return this.petPicParamList;
	}

	public void setPetSpecies(String petSpecies) {
		this.petSpecies = petSpecies;
	}
	public String getPetSpecies( ) {
		return this.petSpecies;
	}

	public void setPetSpeciesCode(String petSpeciesCode) {
		this.petSpeciesCode = petSpeciesCode;
	}
	public String getPetSpeciesCode( ) {
		return this.petSpeciesCode;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getPetType( ) {
		return this.petType;
	}

	public void setPolicyStatus(Long policyStatus) {
		this.policyStatus = policyStatus;
	}
	public Long getPolicyStatus( ) {
		return this.policyStatus;
	}

}
