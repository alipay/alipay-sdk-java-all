package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易买家授信撤销
 *
 * @author auto create
 * @since 1.0, 2024-01-29 11:12:34
 */
public class AlipayTradeBuyerCreditCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6892574434795392187L;

	/**
	 * 卖家授信拆分给买家的额度

单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("grant_credit_quota")
	private String grantCreditQuota;

	/**
	 * 本次授信拆分的操作单号
	 */
	@ApiField("grant_operation_no")
	private String grantOperationNo;

	public String getGrantCreditQuota() {
		return this.grantCreditQuota;
	}
	public void setGrantCreditQuota(String grantCreditQuota) {
		this.grantCreditQuota = grantCreditQuota;
	}

	public String getGrantOperationNo() {
		return this.grantOperationNo;
	}
	public void setGrantOperationNo(String grantOperationNo) {
		this.grantOperationNo = grantOperationNo;
	}

}
