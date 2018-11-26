package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序创建接口
 *
 * @author auto create
 * @since 1.0, 2018-11-01 17:43:43
 */
public class AlipayOpenMiniInnerbaseinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3736842821389419918L;

	/**
	 * 小程序应用名称
	 */
	@ApiField("app_alias_name")
	private String appAliasName;

	/**
	 * 小程序应用描述，20-200个字
	 */
	@ApiField("app_desc")
	private String appDesc;

	/**
	 * 小程序logo图标，建议上传像素为180*180
	 */
	@ApiField("app_logo")
	private String appLogo;

	/**
	 * 小程序应用简介，一句话描述小程序功能
	 */
	@ApiField("app_slogan")
	private String appSlogan;

	/**
	 * 多端类型
	 */
	@ApiField("client_type")
	private String clientType;

	/**
	 * 小程序管理员虚拟 ID
	 */
	@ApiField("pid")
	private String pid;

	public String getAppAliasName() {
		return this.appAliasName;
	}
	public void setAppAliasName(String appAliasName) {
		this.appAliasName = appAliasName;
	}

	public String getAppDesc() {
		return this.appDesc;
	}
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

	public String getAppLogo() {
		return this.appLogo;
	}
	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}

	public String getAppSlogan() {
		return this.appSlogan;
	}
	public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}

	public String getClientType() {
		return this.clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
