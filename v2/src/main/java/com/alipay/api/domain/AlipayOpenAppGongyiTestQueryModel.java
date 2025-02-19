package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 功能测试
 *
 * @author auto create
 * @since 1.0, 2020-06-10 10:14:01
 */
public class AlipayOpenAppGongyiTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1575858477747719781L;

	/**
	 * sadfsdaf
	 */
	@ApiField("asdf")
	private AdvertItem asdf;

	/**
	 * count 不是唯一 取值范围（1-10）
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 价格
	 */
	@ApiField("price")
	private String price;

	public AdvertItem getAsdf() {
		return this.asdf;
	}
	public void setAsdf(AdvertItem asdf) {
		this.asdf = asdf;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
