package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * test
 *
 * @author auto create
 * @since 1.0, 2023-01-11 22:19:05
 */
public class TestDemoWzw extends AlipayObject {

	private static final long serialVersionUID = 2836642351726993466L;

	/**
	 * test
	 */
	@ApiField("oid_open_id")
	private String oidOpenId;

	/**
	 * test
	 */
	@ApiField("uid")
	private String uid;

	public String getOidOpenId() {
		return this.oidOpenId;
	}
	public void setOidOpenId(String oidOpenId) {
		this.oidOpenId = oidOpenId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
