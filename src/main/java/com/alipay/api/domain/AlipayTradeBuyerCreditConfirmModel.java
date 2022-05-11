package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易买家授信确认
 *
 * @author auto create
 * @since 1.0, 2020-07-10 19:39:50
 */
public class AlipayTradeBuyerCreditConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2586849663952685442L;

	/**
	 * 卖家授信拆分给买家的额度

单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("grant_credit_quota")
	private String grantCreditQuota;

	/**
	 * 本次授信拆分的操作明细单号，每一次授信申请或者关闭会生成唯一个单号
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
