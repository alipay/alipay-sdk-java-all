package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ftoken查询结果
 *
 * @author auto create
 * @since 1.0, 2022-12-28 14:51:12
 */
public class FtokenInfoResult extends AlipayObject {

	private static final long serialVersionUID = 2531249271428186292L;

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
