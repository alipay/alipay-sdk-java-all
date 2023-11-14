package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过ftoken查询云端比对结果请求
 *
 * @author auto create
 * @since 1.0, 2022-12-28 14:51:30
 */
public class FtokenInfoQuery extends AlipayObject {

	private static final long serialVersionUID = 8325361271919883888L;

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
	 * 支付宝账户openId
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
