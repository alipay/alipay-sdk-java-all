package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链商品信息同步
 *
 * @author auto create
 * @since 1.0, 2023-11-22 14:01:31
 */
public class AntProdpaasProductSkuListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5679889565876578345L;

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
