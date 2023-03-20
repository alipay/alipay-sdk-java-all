package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物照片校验
 *
 * @author auto create
 * @since 1.0, 2021-12-01 16:46:41
 */
public class AlipayInsScenePetprofilePlatformprofileCheckModel extends AlipayObject {

	private static final long serialVersionUID = 8239598734118444477L;

	/**
	 * 文件上传后获取的ID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 宠物照片类型 
NOSE("nose", "鼻纹照"),FACE("face", "正脸照");
	 */
	@ApiField("pet_photo_type")
	private String petPhotoType;

	/**
	 * 宠物类型，狗(2000)/猫(1000)
	 */
	@ApiField("pet_type")
	private String petType;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getPetPhotoType() {
		return this.petPhotoType;
	}
	public void setPetPhotoType(String petPhotoType) {
		this.petPhotoType = petPhotoType;
	}

	public String getPetType() {
		return this.petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}

}
