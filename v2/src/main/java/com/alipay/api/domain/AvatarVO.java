package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟形象信息
 *
 * @author auto create
 * @since 1.0, 2023-05-09 16:40:47
 */
public class AvatarVO extends AlipayObject {

	private static final long serialVersionUID = 3859164558445541721L;

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
