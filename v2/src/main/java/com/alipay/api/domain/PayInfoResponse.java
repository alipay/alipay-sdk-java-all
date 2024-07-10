package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收单创单相关参数
 *
 * @author auto create
 * @since 1.0, 2024-05-30 16:06:18
 */
public class PayInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 7337513475449351153L;

	/**
	 * 收单超时关单时间，单位：s
	 */
	@ApiField("no_pay_close_time")
	private String noPayCloseTime;

	public String getNoPayCloseTime() {
		return this.noPayCloseTime;
	}
	public void setNoPayCloseTime(String noPayCloseTime) {
		this.noPayCloseTime = noPayCloseTime;
	}

}
