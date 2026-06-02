package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量退款查询接口
 *
 * @author auto create
 * @since 1.0, 2026-05-27 12:12:50
 */
public class AlipayTradeCommercialBatchrefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7377318344449673727L;

	/**
	 * 批量退款请求单号
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
