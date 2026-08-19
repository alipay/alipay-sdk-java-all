package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物保险外部机构档案匹配已有宠物
 *
 * @author auto create
 * @since 1.0, 2026-07-31 15:12:54
 */
public class AlipayInsPetOrgprofileverifyMatchModel extends AlipayObject {

	private static final long serialVersionUID = 4235194688441646471L;

	/**
	 * 商户的唯一编码，和建档接口传参保持一致
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 宠物正脸照链接
	 */
	@ApiField("pet_face_url")
	private String petFaceUrl;

	/**
	 * 宠物猫狗大类
	 */
	@ApiField("pet_type")
	private String petType;

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getPetFaceUrl() {
		return this.petFaceUrl;
	}
	public void setPetFaceUrl(String petFaceUrl) {
		this.petFaceUrl = petFaceUrl;
	}

	public String getPetType() {
		return this.petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}

}
