package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取本地商品类目接口
 *
 * @author auto create
 * @since 1.0, 2024-05-08 11:42:28
 */
public class AlipayOpenAppLocalitemAllcategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5649489923442696168L;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}
