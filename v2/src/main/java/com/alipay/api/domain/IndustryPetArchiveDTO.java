package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业宠物档案信息
 *
 * @author auto create
 * @since 1.0, 2024-08-01 16:34:28
 */
public class IndustryPetArchiveDTO extends AlipayObject {

	private static final long serialVersionUID = 7896251617224582782L;

	/**
	 * 支付宝宠物档案Id
	 */
	@ApiField("archive_id")
	private String archiveId;

	/**
	 * 宠物生日
	 */
	@ApiField("pet_birthday")
	private Date petBirthday;

	/**
	 * 宠物性别
	 */
	@ApiField("pet_gender")
	private String petGender;

	/**
	 * 宠物昵称
	 */
	@ApiField("pet_nick")
	private String petNick;

	/**
	 * 绝育情况
	 */
	@ApiField("pet_no_baby")
	private String petNoBaby;

	/**
	 * 宠物图片
	 */
	@ApiListField("pet_pic_list")
	@ApiField("industry_pet_picture_d_t_o")
	private List<IndustryPetPictureDTO> petPicList;

	/**
	 * 宠物品种名称
	 */
	@ApiField("pet_species")
	private String petSpecies;

	/**
	 * 宠物品种编码
	 */
	@ApiField("pet_species_code")
	private String petSpeciesCode;

	/**
	 * 宠物类型
	 */
	@ApiField("pet_type")
	private String petType;

	public String getArchiveId() {
		return this.archiveId;
	}
	public void setArchiveId(String archiveId) {
		this.archiveId = archiveId;
	}

	public Date getPetBirthday() {
		return this.petBirthday;
	}
	public void setPetBirthday(Date petBirthday) {
		this.petBirthday = petBirthday;
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

	public List<IndustryPetPictureDTO> getPetPicList() {
		return this.petPicList;
	}
	public void setPetPicList(List<IndustryPetPictureDTO> petPicList) {
		this.petPicList = petPicList;
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

}
