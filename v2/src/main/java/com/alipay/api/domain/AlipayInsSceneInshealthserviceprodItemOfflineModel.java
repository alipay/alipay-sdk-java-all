package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康服务标的下架接口
 *
 * @author auto create
 * @since 1.0, 2022-03-15 15:15:31
 */
public class AlipayInsSceneInshealthserviceprodItemOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 5843885161455765834L;

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
