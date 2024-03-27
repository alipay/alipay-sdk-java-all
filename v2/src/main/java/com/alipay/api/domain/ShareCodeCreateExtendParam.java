package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 吱口令生成接口的扩展参数定义
 *
 * @author auto create
 * @since 1.0, 2023-12-29 16:17:12
 */
public class ShareCodeCreateExtendParam extends AlipayObject {

	private static final long serialVersionUID = 1884313136636735969L;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
