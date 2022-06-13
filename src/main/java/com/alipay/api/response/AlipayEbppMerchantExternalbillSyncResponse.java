package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.merchant.externalbill.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-09 14:29:20
 */
public class AlipayEbppMerchantExternalbillSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7237422678211477522L;

	/** 
	 * yyyyMMdd+0(DB_FLAG)+0070(SYSTEM_FLAG)+018(SUB_BIZ_FLAG,新建)+0000(预留)+DB_SPLIT(BIZ_TYPE+SUB_BIZTYPE+MERCHANT_CODE, 2位)+TABLE_FLAG(OBJECT_ID, 2位)+8位全局唯一nextValue
	 */
	@ApiField("alipay_bill_id")
	private String alipayBillId;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * WAIT_PAY/FINISH_PAY/REFUND
	 */
	@ApiField("status")
	private String status;

	public void setAlipayBillId(String alipayBillId) {
		this.alipayBillId = alipayBillId;
	}
	public String getAlipayBillId( ) {
		return this.alipayBillId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
