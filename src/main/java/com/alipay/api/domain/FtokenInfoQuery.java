package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过ftoken查询云端比对结果请求
 *
 * @author auto create
 * @since 1.0, 2021-11-12 09:23:48
 */
public class FtokenInfoQuery extends AlipayObject {

	private static final long serialVersionUID = 1874522129479412243L;

	/**
	 * 金额
	 */
	@ApiField("account")
	private String account;

	/**
	 * 业务唯一标识id
	 */
	@ApiField("bizid")
	private String bizid;

	/**
	 * 离线ftoken
	 */
	@ApiField("ftoken")
	private String ftoken;

	/**
	 * 支付宝账户uid
	 */
	@ApiField("uid")
	private String uid;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getBizid() {
		return this.bizid;
	}
	public void setBizid(String bizid) {
		this.bizid = bizid;
	}

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
