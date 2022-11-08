package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openid内部测试接口
 *
 * @author auto create
 * @since 1.0, 2022-10-10 21:11:14
 */
public class AlipayOpenOpenbizmockOpenidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5364243841658314758L;

	/**
	 * openid复杂参数
	 */
	@ApiField("json")
	private OpenidComplex json;

	/**
	 * 1
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1
	 */
	@ApiField("uid")
	private String uid;

	public OpenidComplex getJson() {
		return this.json;
	}
	public void setJson(OpenidComplex json) {
		this.json = json;
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
