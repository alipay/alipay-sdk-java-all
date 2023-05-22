package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取本地商品类目接口
 *
 * @author auto create
 * @since 1.0, 2023-05-19 13:34:45
 */
public class AlipayOpenAppLocalitemAllcategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8888748931377342588L;

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
