package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车险订单交易信息
 *
 * @author auto create
 * @since 1.0, 2017-10-24 17:03:12
 */
public class InsTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 6291441928816673837L;

	/**
	 * 产品编码
交强险-01010000002000000251, 
商业险-01010000002000000250
	 */
	@ApiField("product_no")
	private String productNo;

	/**
	 * 车险内部订单号
	 */
	@ApiField("trade_biz_id")
	private String tradeBizId;

	public String getProductNo() {
		return this.productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getTradeBizId() {
		return this.tradeBizId;
	}
	public void setTradeBizId(String tradeBizId) {
		this.tradeBizId = tradeBizId;
	}

}
