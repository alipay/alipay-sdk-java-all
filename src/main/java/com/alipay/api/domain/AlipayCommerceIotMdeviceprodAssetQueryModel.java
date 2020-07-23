package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询物料模板信息
 *
 * @author auto create
 * @since 1.0, 2019-09-16 16:56:52
 */
public class AlipayCommerceIotMdeviceprodAssetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2237656819215161332L;

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
