package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 宠物档案匹配
 *
 * @author auto create
 * @since 1.0, 2022-06-21 20:52:52
 */
public class AlipayInsScenePetprofilePlatformprofileMatchModel extends AlipayObject {

	private static final long serialVersionUID = 7328425291747918939L;

	/**
	 * 宠物类型：狗(2000)/猫(1000)
	 */
	@ApiField("pet_type")
	private String petType;

	/**
	 * 宠物照片列表，用于匹配宠物档案，支持鼻纹和正脸多张照片搜索
	 */
	@ApiListField("photos")
	@ApiField("pet_photo")
	private List<PetPhoto> photos;

	public String getPetType() {
		return this.petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}

	public List<PetPhoto> getPhotos() {
		return this.photos;
	}
	public void setPhotos(List<PetPhoto> photos) {
		this.photos = photos;
	}

}
