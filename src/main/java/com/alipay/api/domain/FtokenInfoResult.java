package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ftoken查询结果
 *
 * @author auto create
 * @since 1.0, 2021-11-12 09:23:58
 */
public class FtokenInfoResult extends AlipayObject {

	private static final long serialVersionUID = 1682683179356338754L;

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
