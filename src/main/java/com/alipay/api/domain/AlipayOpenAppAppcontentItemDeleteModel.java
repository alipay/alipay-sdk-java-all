package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用内容商品删除
 *
 * @author auto create
 * @since 1.0, 2021-01-15 11:40:03
 */
public class AlipayOpenAppAppcontentItemDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5351852146857615315L;

	/**
	 * 业务唯一ID；和商品ID任一必填一个
	 */
	@ApiField("biz_unique_id")
	private String bizUniqueId;

	/**
	 * 商品ID；和业务唯一ID任一必填一个
	 */
	@ApiField("item_id")
	private String itemId;

	public String getBizUniqueId() {
		return this.bizUniqueId;
	}
	public void setBizUniqueId(String bizUniqueId) {
		this.bizUniqueId = bizUniqueId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
