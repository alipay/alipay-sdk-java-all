package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商户关注关系
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:56:13
 */
public class AlipayOpenAppSearchFollowcountModel extends AlipayObject {

	private static final long serialVersionUID = 3125448117622996436L;

	/**
	 * 请求
	 */
	@ApiField("requet")
	private String requet;

	public String getRequet() {
		return this.requet;
	}
	public void setRequet(String requet) {
		this.requet = requet;
	}

}
