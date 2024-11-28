package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账主体信息
 *
 * @author auto create
 * @since 1.0, 2024-11-22 11:12:38
 */
public class RoyaltyEntity extends AlipayObject {

	private static final long serialVersionUID = 7434666165321526674L;

	/**
	 * 分账接收方账号。 当分账方类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字； 当分账方类型是loginName时，本参数为用户的支付宝登录号；当分账方类型是openId时，本参数传递支付宝openId信息。
	 */
	@ApiField("account")
	private String account;

	/**
	 * 分账接收方openId，本参数为分账接收方在该应用（AppId）下的唯一用户标识，仅用于分账关系查询接口出参。
	 */
	@ApiField("account_open_id")
	private String accountOpenId;

	/**
	 * 作为查询返回结果：分账收款方绑定时的支付宝登录号。分账关系绑定（alipay.trade.royalty.relation.bind）时，通过type为loginName绑定传入的支付宝登录号，若使用userId绑定则不返回。
	 */
	@ApiField("bind_login_name")
	private String bindLoginName;

	/**
	 * 作为查询返回结果：当前userId对应的支付宝登录号。当login_name与bind_login_name不相等时，表明该支付宝账户发生了登录号变更。
	 */
	@ApiField("login_name")
	private String loginName;

	/**
	 * 分账关系描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 分账接收方真实姓名。
绑定分账关系时：
当分账方类型是userId时，本参数可以不传，若上传则进行校验不上传不会校验。
当分账方类型是loginName时，本参数必传。
解绑分账关系时：作为请求参数可不填，分账关系查询时不作为返回结果返回
	 */
	@ApiField("name")
	private String name;

	/**
	 * 分账接收方类型。
	 */
	@ApiField("type")
	private String type;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountOpenId() {
		return this.accountOpenId;
	}
	public void setAccountOpenId(String accountOpenId) {
		this.accountOpenId = accountOpenId;
	}

	public String getBindLoginName() {
		return this.bindLoginName;
	}
	public void setBindLoginName(String bindLoginName) {
		this.bindLoginName = bindLoginName;
	}

	public String getLoginName() {
		return this.loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
