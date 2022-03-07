package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康服务标的下架接口
 *
 * @author auto create
 * @since 1.0, 2022-01-04 22:45:13
 */
public class AlipayInsSceneInshealthserviceprodItemOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 7154237277795112928L;

	/**
	 * 商品ID
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
