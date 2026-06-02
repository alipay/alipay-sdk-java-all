package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:27:46
 */
public class KLineListDTO extends AlipayObject {

	private static final long serialVersionUID = 4178694384833452636L;

	/**
	 * 数据项，类型为KLineDTO
	 */
	@ApiField("items")
	private KLineDTO items;

	public KLineDTO getItems() {
		return this.items;
	}
	public void setItems(KLineDTO items) {
		this.items = items;
	}

}
