package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * openid复杂参数
 *
 * @author auto create
 * @since 1.0, 2022-09-23 21:18:39
 */
public class OpenidComplex extends AlipayObject {

	private static final long serialVersionUID = 1334966156842468445L;

	/**
	 * 11
	 */
	@ApiField("json_string")
	private String jsonString;

	/**
	 * 1
	 */
	@ApiListField("open_id_list")
	@ApiField("string")
	private List<String> openIdList;

	/**
	 * 11
	 */
	@ApiField("openid")
	private String openid;

	/**
	 * 11
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 1
	 */
	@ApiListField("uid_list")
	@ApiField("string")
	private List<String> uidList;

	public String getJsonString() {
		return this.jsonString;
	}
	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}

	public List<String> getOpenIdList() {
		return this.openIdList;
	}
	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
	}

	public String getOpenid() {
		return this.openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public List<String> getUidList() {
		return this.uidList;
	}
	public void setUidList(List<String> uidList) {
		this.uidList = uidList;
	}

}
