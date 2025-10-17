package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 虚拟形象动画信息
 *
 * @author auto create
 * @since 1.0, 2023-08-24 23:09:38
 */
public class AvatarAnimationVO extends AlipayObject {

	private static final long serialVersionUID = 5698837591511278172L;

	/**
	 * 对于动画的具体描述
	 */
	@ApiField("animation_desc")
	private String animationDesc;

	/**
	 * 动画的gltf模型url
	 */
	@ApiField("animation_gltf_url")
	private String animationGltfUrl;

	/**
	 * 动画的形容名称
	 */
	@ApiField("animation_name")
	private String animationName;

	/**
	 * 动画类型
	 */
	@ApiField("animation_type")
	private String animationType;

	/**
	 * 动画适用的虚拟化身组
	 */
	@ApiListField("avatar_types")
	@ApiField("string")
	private List<String> avatarTypes;

	/**
	 * 动画的预览图
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 动画对应的标识id
	 */
	@ApiField("id")
	private String id;

	public String getAnimationDesc() {
		return this.animationDesc;
	}
	public void setAnimationDesc(String animationDesc) {
		this.animationDesc = animationDesc;
	}

	public String getAnimationGltfUrl() {
		return this.animationGltfUrl;
	}
	public void setAnimationGltfUrl(String animationGltfUrl) {
		this.animationGltfUrl = animationGltfUrl;
	}

	public String getAnimationName() {
		return this.animationName;
	}
	public void setAnimationName(String animationName) {
		this.animationName = animationName;
	}

	public String getAnimationType() {
		return this.animationType;
	}
	public void setAnimationType(String animationType) {
		this.animationType = animationType;
	}

	public List<String> getAvatarTypes() {
		return this.avatarTypes;
	}
	public void setAvatarTypes(List<String> avatarTypes) {
		this.avatarTypes = avatarTypes;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
