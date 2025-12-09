package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于供应商查询福利权益的扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-04-29 19:08:08
 */
public class WelfareAuthExtReq extends AlipayObject {

	private static final long serialVersionUID = 6649663194255559542L;

	/**
	 * 该参数用来标识用户来源，是供应商不同的场景传入对应的来源，蚂蚁EAP会根据此来判断员工是否在权益范围内
	 */
	@ApiField("from_channel")
	private String fromChannel;

	public String getFromChannel() {
		return this.fromChannel;
	}
	public void setFromChannel(String fromChannel) {
		this.fromChannel = fromChannel;
	}

}
