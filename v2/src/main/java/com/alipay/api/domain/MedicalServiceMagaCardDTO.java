package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务推荐maga投放card信息
 *
 * @author auto create
 * @since 1.0, 2024-12-06 16:59:55
 */
public class MedicalServiceMagaCardDTO extends AlipayObject {

	private static final long serialVersionUID = 6547889116514656996L;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 图标Url
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 跳转链接
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 服务的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否为第三方服务
	 */
	@ApiField("third_service_flag")
	private Boolean thirdServiceFlag;

	/**
	 * 服务的标题
	 */
	@ApiField("title")
	private String title;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getThirdServiceFlag() {
		return this.thirdServiceFlag;
	}
	public void setThirdServiceFlag(Boolean thirdServiceFlag) {
		this.thirdServiceFlag = thirdServiceFlag;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
