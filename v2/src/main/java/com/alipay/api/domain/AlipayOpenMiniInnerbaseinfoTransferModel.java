package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部小程序-小程序迁移
 *
 * @author auto create
 * @since 1.0, 2019-04-24 16:30:59
 */
public class AlipayOpenMiniInnerbaseinfoTransferModel extends AlipayObject {

	private static final long serialVersionUID = 8674946881828794826L;

	/**
	 * 应用来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 支付宝登陆账号
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 需要迁移的小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 应用主体
	 */
	@ApiField("owner_entity")
	private String ownerEntity;

	/**
	 * 应用来源
MAYI：蚂蚁域内应用
ALIBABA：阿里域内应用
	 */
	@ApiField("partner_domain")
	private String partnerDomain;

	/**
	 * 用户id
	 */
	@ApiField("pid")
	private String pid;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOwnerEntity() {
		return this.ownerEntity;
	}
	public void setOwnerEntity(String ownerEntity) {
		this.ownerEntity = ownerEntity;
	}

	public String getPartnerDomain() {
		return this.partnerDomain;
	}
	public void setPartnerDomain(String partnerDomain) {
		this.partnerDomain = partnerDomain;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
