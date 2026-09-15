package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-20 00:05:39
 */
public class KLineListDTO extends AlipayObject {

	private static final long serialVersionUID = 1232127645529948523L;

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
