package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业业务受理平台订单退款查询接口
 *
 * @author auto create
 * @since 1.0, 2024-12-25 14:01:58
 */
public class AlipayEbppIndustryPerformRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8587172585239762721L;

	/**
	 * 业务受理平台业务28位订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 业务受理平台退款请求号
	 */
	@ApiField("request_id")
	private String requestId;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
