package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * aacProspectFlashSale的返回结果对象
 *
 * @author auto create
 * @since 1.0, 2025-09-15 14:42:18
 */
public class AACProspectFlashSaleResult extends AlipayObject {

	private static final long serialVersionUID = 5713385632891384552L;

	/**
	 * 发奖金额，单位：分
	 */
	@ApiField("price")
	private Long price;

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

}
