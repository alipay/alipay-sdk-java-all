package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟形象信息
 *
 * @author auto create
 * @since 1.0, 2023-08-24 23:08:49
 */
public class AvatarVO extends AlipayObject {

	private static final long serialVersionUID = 7779626996468711187L;

	/**
	 * 虚拟形象的模型信息
	 */
	@ApiField("avatar_gltf_info")
	private String avatarGltfInfo;

	/**
	 * 标识数字形象的id
	 */
	@ApiField("avatar_id")
	private String avatarId;

	/**
	 * 当前虚拟形象的名称
	 */
	@ApiField("avatar_name")
	private String avatarName;

	/**
	 * 虚拟形象的类型信息
	 */
	@ApiField("avatar_type")
	private String avatarType;

	/**
	 * 说明形象是否为默认形象
	 */
	@ApiField("default_avatar")
	private Boolean defaultAvatar;

	/**
	 * 用户性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 是否为用户真实性别
	 */
	@ApiField("real_gender")
	private Boolean realGender;

	public String getAvatarGltfInfo() {
		return this.avatarGltfInfo;
	}
	public void setAvatarGltfInfo(String avatarGltfInfo) {
		this.avatarGltfInfo = avatarGltfInfo;
	}

	public String getAvatarId() {
		return this.avatarId;
	}
	public void setAvatarId(String avatarId) {
		this.avatarId = avatarId;
	}

	public String getAvatarName() {
		return this.avatarName;
	}
	public void setAvatarName(String avatarName) {
		this.avatarName = avatarName;
	}

	public String getAvatarType() {
		return this.avatarType;
	}
	public void setAvatarType(String avatarType) {
		this.avatarType = avatarType;
	}

	public Boolean getDefaultAvatar() {
		return this.defaultAvatar;
	}
	public void setDefaultAvatar(Boolean defaultAvatar) {
		this.defaultAvatar = defaultAvatar;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getRealGender() {
		return this.realGender;
	}
	public void setRealGender(Boolean realGender) {
		this.realGender = realGender;
	}

}
