package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户意愿确认申请单撤销
 *
 * @author auto create
 * @since 1.0, 2025-01-02 14:58:21
 */
public class AlipayMerchantIndirectAuthorderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 8216521541819125299L;

	/**
	 * 意愿申请单号，参数二选一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部业务号，参数二选一，业务自定义，保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
