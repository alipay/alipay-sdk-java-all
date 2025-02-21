package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌box提报数据详情
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:34
 */
public class BrandBoxDetail extends AlipayObject {

	private static final long serialVersionUID = 3635672928118176228L;

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
