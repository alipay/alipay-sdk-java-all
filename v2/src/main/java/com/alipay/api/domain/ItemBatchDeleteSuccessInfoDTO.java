package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除商品成功信息结构
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:42:12
 */
public class ItemBatchDeleteSuccessInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5383373648695617619L;

	/**
	 * OMS厂商商品编码, 厂商自行维护
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
