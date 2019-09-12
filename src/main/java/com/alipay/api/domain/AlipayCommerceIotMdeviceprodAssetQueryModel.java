package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询物料模板信息
 *
 * @author auto create
 * @since 1.0, 2018-09-14 15:55:00
 */
public class AlipayCommerceIotMdeviceprodAssetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3525964951482375442L;

	/**
	 * 模板ID（物料系统的item_id）
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
