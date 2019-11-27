package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个商品查询接口
 *
 * @author auto create
 * @since 1.0, 2017-08-30 10:55:38
 */
public class KoubeiItemExtitemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5143323212157325677L;

	/**
	 * 商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

}
