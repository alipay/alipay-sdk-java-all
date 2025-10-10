package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业账单动账对象
 *
 * @author auto create
 * @since 1.0, 2020-12-14 13:36:22
 */
public class ExternalSyncRequest extends AlipayObject {

	private static final long serialVersionUID = 8637493315241517832L;

	/**
	 * 支付宝账单ID
	 */
	@ApiField("alipay_bill_id")
	private String alipayBillId;

	/**
	 * 外部账单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAlipayBillId() {
		return this.alipayBillId;
	}
	public void setAlipayBillId(String alipayBillId) {
		this.alipayBillId = alipayBillId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
