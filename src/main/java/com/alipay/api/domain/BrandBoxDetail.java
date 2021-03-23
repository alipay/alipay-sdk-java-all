package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌box提报数据详情
 *
 * @author auto create
 * @since 1.0, 2020-12-15 19:21:53
 */
public class BrandBoxDetail extends AlipayObject {

	private static final long serialVersionUID = 8261777595953549334L;

	/**
	 * 品牌box提报信息
	 */
	@ApiField("detail")
	private BoxDetail detail;

	/**
	 * 品牌box提报key
	 */
	@ApiField("key")
	private String key;

	public BoxDetail getDetail() {
		return this.detail;
	}
	public void setDetail(BoxDetail detail) {
		this.detail = detail;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
