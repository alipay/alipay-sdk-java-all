package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * “蚁盾”风险评分定向接口服务
 *
 * @author auto create
 * @since 1.0, 2019-07-29 16:07:17
 */
public class AlipaySecurityRiskDirectionalRainscoreQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7451444732842976178L;

	/**
	 * 帐号内容，目前为中国大陆手机号（11位阿拉伯数字，不包含特殊符号或空格）
	 */
	@ApiField("account")
	private String account;

	/**
	 * 账号类型，目前仅支持手机号（MOBILE_NO）
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * “蚁盾”风险评分服务版本号，当前版本为2.0
	 */
	@ApiField("version")
	private String version;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
