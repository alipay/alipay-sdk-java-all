package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询先享后付记账单
 *
 * @author auto create
 * @since 1.0, 2024-05-07 19:08:11
 */
public class ZhimaCreditPayafteruseCreditbizorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4475649761481845263L;

	/**
	 * 信用服务订单号，out_order_no与credit_biz_order_id至少传一个
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/**
	 * 商户外部单号，out_order_no与credit_biz_order_id至少传一个
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getCreditBizOrderId() {
		return this.creditBizOrderId;
	}
	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
