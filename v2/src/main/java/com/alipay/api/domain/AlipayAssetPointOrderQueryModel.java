package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户在调用集分宝发放接口后可以通过此接口查询发放情况
 *
 * @author auto create
 * @since 1.0, 2024-07-04 17:00:53
 */
public class AlipayAssetPointOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1867797445977736869L;

	/**
	 * isv提供的发放号订单号，由数字和字母组成，最大长度为32为，需要保证每笔发放的唯一性，集分宝系统会对该参数做唯一性控制。调用接口后集分宝系统会根据这个外部订单号查询发放的订单详情。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

}
