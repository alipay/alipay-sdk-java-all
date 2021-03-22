package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 动账同步
 *
 * @author auto create
 * @since 1.0, 2021-01-26 16:21:40
 */
public class AlipayEbppMerchantExternalbillSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4697731637465659441L;

	/**
	 * yyyyMMdd+0(DB_FLAG)+0070(SYSTEM_FLAG)+018(SUB_BIZ_FLAG,新建)+0000(预留)+DB_SPLIT(BIZ_TYPE+SUB_BIZTYPE+MERCHANT_CODE, 2位)+TABLE_FLAG(MERCHANT_CODE, 2位)+8位全局唯一nextValue
	 */
	@ApiField("alipay_bill_id")
	private String alipayBillId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 动账来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * WAIT_PAY/FINISH_PAY/REFUND
	 */
	@ApiField("status")
	private String status;

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

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
