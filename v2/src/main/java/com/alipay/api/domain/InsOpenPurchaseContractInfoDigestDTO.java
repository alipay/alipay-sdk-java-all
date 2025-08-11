package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险订购合约摘要信息
 *
 * @author auto create
 * @since 1.0, 2025-03-04 14:14:28
 */
public class InsOpenPurchaseContractInfoDigestDTO extends AlipayObject {

	private static final long serialVersionUID = 2786826654429383144L;

	/**
	 * 合约ID
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 签约时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	/**
	 * 合约状态
	 */
	@ApiField("status")
	private String status;

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
