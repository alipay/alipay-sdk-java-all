package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试协议升级
 *
 * @author auto create
 * @since 1.0, 2022-07-20 14:15:59
 */
public class HuanxuUserHhhhhDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6291449263275135859L;

	/**
	 * fsdfsdfsd
	 */
	@ApiField("aa")
	private String aa;

	/**
	 * 1
	 */
	@ApiField("add")
	private String add;

	/**
	 * 应用名
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * asf
	 */
	@ApiField("dd")
	private String dd;

	/**
	 * 小程序应用ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getAa() {
		return this.aa;
	}
	public void setAa(String aa) {
		this.aa = aa;
	}

	public String getAdd() {
		return this.add;
	}
	public void setAdd(String add) {
		this.add = add;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDd() {
		return this.dd;
	}
	public void setDd(String dd) {
		this.dd = dd;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
