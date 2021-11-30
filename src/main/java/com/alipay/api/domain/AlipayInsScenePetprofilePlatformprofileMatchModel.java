package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 宠物档案匹配
 *
 * @author auto create
 * @since 1.0, 2021-11-30 15:38:26
 */
public class AlipayInsScenePetprofilePlatformprofileMatchModel extends AlipayObject {

	private static final long serialVersionUID = 4557936772952766772L;

	/**
	 * 宠物照片列表，用于匹配宠物档案，支持鼻纹和正脸多张照片搜索
	 */
	@ApiListField("photos")
	@ApiField("pet_photo")
	private List<PetPhoto> photos;

	public List<PetPhoto> getPhotos() {
		return this.photos;
	}
	public void setPhotos(List<PetPhoto> photos) {
		this.photos = photos;
	}

}
