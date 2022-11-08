package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用对外提供的支付宝实名认证账户数据结构
 *
 * @author auto create
 * @since 1.0, 2014-05-19 10:04:20
 */
public class AliTrustAlipayCert extends AlipayObject {

	private static final long serialVersionUID = 4753438283667298126L;

	/**
	 * 用户出生日期
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * 点击支付宝实名认证图标之后的跳转链接
	 */
	@ApiField("forward_url")
	private String forwardUrl;

	/**
	 * 用户性别(M/F)
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 支付宝实名认证图标的链接地址
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 当账户为支付宝实名认证时,取值为"T";否则为"F".
	 */
	@ApiField("is_certified")
	private String isCertified;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	public Date getBirthday() {
		return this.birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getForwardUrl() {
		return this.forwardUrl;
	}
	public void setForwardUrl(String forwardUrl) {
		this.forwardUrl = forwardUrl;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getIsCertified() {
		return this.isCertified;
	}
	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
