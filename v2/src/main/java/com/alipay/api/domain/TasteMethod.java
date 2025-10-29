package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口味做法
 *
 * @author auto create
 * @since 1.0, 2025-08-01 09:52:03
 */
public class TasteMethod extends AlipayObject {

	private static final long serialVersionUID = 6493962772462445971L;

	/**
	 * 1
	 */
	@ApiField("taste_id")
	private String tasteId;

	/**
	 * 名称
	 */
	@ApiField("taste_name")
	private String tasteName;

	public String getTasteId() {
		return this.tasteId;
	}
	public void setTasteId(String tasteId) {
		this.tasteId = tasteId;
	}

	public String getTasteName() {
		return this.tasteName;
	}
	public void setTasteName(String tasteName) {
		this.tasteName = tasteName;
	}

}
