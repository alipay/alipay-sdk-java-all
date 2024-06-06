package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.pet.file.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:27
 */
public class AlipayCommercePetFileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5576417874623673542L;

	/** 
	 * 宠物生日
	 */
	@ApiField("birth_date")
	private String birthDate;

	/** 
	 * 宠物品种
	 */
	@ApiField("breed")
	private String breed;

	/** 
	 * 宠物品类(CAT/DOG/OTHER)
	 */
	@ApiField("category")
	private String category;

	/** 
	 * 是否驱虫（YES/NO）
	 */
	@ApiField("expelled_flag")
	private String expelledFlag;

	/** 
	 * 宠物档案id
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 宠物名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 宠物证
	 */
	@ApiField("pet_certify")
	private String petCertify;

	/** 
	 * 宠物照片，List<String>
	 */
	@ApiListField("photo")
	@ApiField("string")
	private List<String> photo;

	/** 
	 * 宠物性别（MALE/FEMALE）
	 */
	@ApiField("sex")
	private String sex;

	/** 
	 * 是否绝育（YES/NO）
	 */
	@ApiField("sterilization_flag")
	private String sterilizationFlag;

	/** 
	 * 是否接种疫苗（YES/NO）
	 */
	@ApiField("vaccines_flag")
	private String vaccinesFlag;

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getBirthDate( ) {
		return this.birthDate;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getBreed( ) {
		return this.breed;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory( ) {
		return this.category;
	}

	public void setExpelledFlag(String expelledFlag) {
		this.expelledFlag = expelledFlag;
	}
	public String getExpelledFlag( ) {
		return this.expelledFlag;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPetCertify(String petCertify) {
		this.petCertify = petCertify;
	}
	public String getPetCertify( ) {
		return this.petCertify;
	}

	public void setPhoto(List<String> photo) {
		this.photo = photo;
	}
	public List<String> getPhoto( ) {
		return this.photo;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex( ) {
		return this.sex;
	}

	public void setSterilizationFlag(String sterilizationFlag) {
		this.sterilizationFlag = sterilizationFlag;
	}
	public String getSterilizationFlag( ) {
		return this.sterilizationFlag;
	}

	public void setVaccinesFlag(String vaccinesFlag) {
		this.vaccinesFlag = vaccinesFlag;
	}
	public String getVaccinesFlag( ) {
		return this.vaccinesFlag;
	}

}
