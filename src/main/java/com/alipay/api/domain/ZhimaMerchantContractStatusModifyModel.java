package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用承诺消费合约状态变更
 *
 * @author auto create
 * @since 1.0, 2019-03-21 20:23:55
 */
public class ZhimaMerchantContractStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2399918244665289285L;

	/**
	 * 合约状态变更操作发生的时间
	 */
	@ApiField("action_time")
	private Date actionTime;

	/**
	 * 合约状态操作类型必须为以下列表的一种
ACTIVE表示激活合约，前置合约状态INIT
INVALID表示作废合约，前置合约状态为INIT
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 承诺消费合约号，唯一定位用户的一笔合约
	 */
	@ApiField("contract_no")
	private String contractNo;

	public Date getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

}
