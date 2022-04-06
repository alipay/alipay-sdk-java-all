package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除商品接口
 *
 * @author auto create
 * @since 1.0, 2021-01-15 11:28:55
 */
public class AntMerchantExpandItemOpenDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5275537935587447669L;

	/**
	 * 商品ID，通过创建商品接口 https://opendocs.alipay.com/apis/api_4/ant.merchant.expand.item.open.create 获取。
	 */
	@ApiField("item_id")
	private String itemId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
