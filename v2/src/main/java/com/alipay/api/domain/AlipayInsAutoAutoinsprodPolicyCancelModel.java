package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下单撤销接口
 *
 * @author auto create
 * @since 1.0, 2023-12-18 15:46:27
 */
public class AlipayInsAutoAutoinsprodPolicyCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1395733759364569487L;

	/**
	 * 车险订单号
	 */
	@ApiField("trade_biz_id")
	private String tradeBizId;

	public String getTradeBizId() {
		return this.tradeBizId;
	}
	public void setTradeBizId(String tradeBizId) {
		this.tradeBizId = tradeBizId;
	}

}
