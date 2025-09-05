package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 管控账户余额查询
 *
 * @author auto create
 * @since 1.0, 2025-07-30 12:00:56
 */
public class AnttechBlockchainFinanceFsupvBalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2418221124387835927L;

	/**
	 * 资金管控任务编号
	 */
	@ApiField("fund_supv_task_id")
	private String fundSupvTaskId;

	public String getFundSupvTaskId() {
		return this.fundSupvTaskId;
	}
	public void setFundSupvTaskId(String fundSupvTaskId) {
		this.fundSupvTaskId = fundSupvTaskId;
	}

}
