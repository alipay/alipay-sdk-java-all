package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短剧演员信息。
 *
 * @author auto create
 * @since 1.0, 2026-09-04 10:58:40
 */
public class ShortPlayActor extends AlipayObject {

	private static final long serialVersionUID = 4638997917263875538L;

	/**
	 * 演员名，最长 30 个字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 演员照片临时 material_id。
	 */
	@ApiField("photo_material_id")
	private String photoMaterialId;

	/**
	 * 演员简介，最长 100 个字
	 */
	@ApiField("profile")
	private String profile;

	/**
	 * 饰演角色名，最长 30 个字
	 */
	@ApiField("role")
	private String role;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhotoMaterialId() {
		return this.photoMaterialId;
	}
	public void setPhotoMaterialId(String photoMaterialId) {
		this.photoMaterialId = photoMaterialId;
	}

	public String getProfile() {
		return this.profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
