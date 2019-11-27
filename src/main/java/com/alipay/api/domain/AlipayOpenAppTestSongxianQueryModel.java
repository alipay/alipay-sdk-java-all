package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 松贤测试
 *
 * @author auto create
 * @since 1.0, 2018-01-02 14:58:27
 */
public class AlipayOpenAppTestSongxianQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4376621635531997481L;

	/**
	 * 商品信息
	 */
	@ApiField("item_ex")
	private String itemEx;

	/**
	 * 1111
	 */
	@ApiField("order")
	private String order;

	public String getItemEx() {
		return this.itemEx;
	}
	public void setItemEx(String itemEx) {
		this.itemEx = itemEx;
	}

	public String getOrder() {
		return this.order;
	}
	public void setOrder(String order) {
		this.order = order;
	}

}
