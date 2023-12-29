package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * H5合并支付接口2.0
 *
 * @author auto create
 * @since 1.0, 2023-12-21 15:23:45
 */
public class AlipayTradeWapMergePayModel extends AlipayObject {

	private static final long serialVersionUID = 2155881111653448884L;

	/**
	 * 预下单号。通过 alipay.trade.merge.precreate(统一收单合并支付预创建接口)返回。
	 */
	@ApiField("pre_order_no")
	private String preOrderNo;

	public String getPreOrderNo() {
		return this.preOrderNo;
	}
	public void setPreOrderNo(String preOrderNo) {
		this.preOrderNo = preOrderNo;
	}

}
