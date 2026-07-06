package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 买卖委托订单对象
 *
 * @author auto create
 * @since 1.0, 2026-04-08 17:46:54
 */
public class LtOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 2379684259231153287L;

	/**
	 * 申买/卖量 股票:股 权证:份 债券:手
	 */
	@ApiField("volume")
	private String volume;

	public String getVolume() {
		return this.volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}

}
