package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询接口默认入参
 *
 * @author auto create
 * @since 1.0, 2025-06-26 11:25:53
 */
public class AlipayOpenApidefaultparamQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6336239977234799743L;

	/**
	 * 接口名称
	 */
	@ApiField("interface_name")
	private String interfaceName;

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

	public String getInterfaceName() {
		return this.interfaceName;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
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
