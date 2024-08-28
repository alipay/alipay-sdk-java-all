package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物图片校验
 *
 * @author auto create
 * @since 1.0, 2024-08-01 16:34:22
 */
public class AlipayCommercePetPictureCheckavailableModel extends AlipayObject {

	private static final long serialVersionUID = 7626436534176523443L;

	/**
	 * 文件Id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 照片类型
	 */
	@ApiField("image_type")
	private String imageType;

	/**
	 * 宠物类型
	 */
	@ApiField("pet_type")
	private String petType;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getImageType() {
		return this.imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getPetType() {
		return this.petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}

}
