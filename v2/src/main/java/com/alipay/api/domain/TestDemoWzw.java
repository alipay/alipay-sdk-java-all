package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * test
 *
 * @author auto create
 * @since 1.0, 2023-01-17 10:10:18
 */
public class TestDemoWzw extends AlipayObject {

	private static final long serialVersionUID = 8645185356931594745L;

	/**
	 * 88
	 */
	@ApiField("aaopen_id")
	private String aaopenId;

	/**
	 * 88
	 */
	@ApiField("aauids")
	private String aauids;

	/**
	 * 88
	 */
	@ApiField("id_type")
	private String idType;

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

	public String getAaopenId() {
		return this.aaopenId;
	}
	public void setAaopenId(String aaopenId) {
		this.aaopenId = aaopenId;
	}

	public String getAauids() {
		return this.aauids;
	}
	public void setAauids(String aauids) {
		this.aauids = aauids;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

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
