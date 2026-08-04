package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据批次单ID查询批次信息和订单信息
 *
 * @author auto create
 * @since 1.0, 2026-07-29 09:51:12
 */
public class AlipayCommerceEcRecyclinginvoiceBatchdepositQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8472837879965611735L;

	/**
	 * 批次请款单ID
	 */
	@ApiField("batch_deposit_id")
	private String batchDepositId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getBatchDepositId() {
		return this.batchDepositId;
	}
	public void setBatchDepositId(String batchDepositId) {
		this.batchDepositId = batchDepositId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
