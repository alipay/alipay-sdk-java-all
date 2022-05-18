package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户端信息
 *
 * @author auto create
 * @since 1.0, 2018-11-29 20:18:37
 */
public class ClientInfo extends AlipayObject {

	private static final long serialVersionUID = 3686889339216747625L;

	/**
	 * 目前支持4个值
en：英文
zh-Hans：简体中文
zh-Hant：繁体台湾
zh-HK：繁体香港
默认值是zh-Hans
	 */
	@ApiField("language")
	private String language;

	/**
	 * 操作系统
目前支持
ios
android
	 */
	@ApiField("os")
	private String os;

	/**
	 * 客户端类型,目前支持alipay,uc
	 */
	@ApiField("type")
	private String type;

	/**
	 * 客户端的版本号
	 */
	@ApiField("version_no")
	private String versionNo;

	public String getLanguage() {
		return this.language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOs() {
		return this.os;
	}
	public void setOs(String os) {
		this.os = os;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

}
