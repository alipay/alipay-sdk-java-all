package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金管控任务取消
 *
 * @author auto create
 * @since 1.0, 2025-07-30 11:59:56
 */
public class AnttechBlockchainFinanceFsupvTaskCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8851595393377298317L;

	/**
	 * 资金管控任务产品码，可联系产品或运营同学获取
	 */
	@ApiField("fund_supv_product_code")
	private String fundSupvProductCode;

	/**
	 * 资金管控任务编号
	 */
	@ApiField("fund_supv_task_id")
	private String fundSupvTaskId;

	/**
	 * 管控方证件号码, ISV服务商接入时必传
	 */
	@ApiField("supervisor_id_number")
	private String supervisorIdNumber;

	public String getFundSupvProductCode() {
		return this.fundSupvProductCode;
	}
	public void setFundSupvProductCode(String fundSupvProductCode) {
		this.fundSupvProductCode = fundSupvProductCode;
	}

	public String getFundSupvTaskId() {
		return this.fundSupvTaskId;
	}
	public void setFundSupvTaskId(String fundSupvTaskId) {
		this.fundSupvTaskId = fundSupvTaskId;
	}

	public String getSupervisorIdNumber() {
		return this.supervisorIdNumber;
	}
	public void setSupervisorIdNumber(String supervisorIdNumber) {
		this.supervisorIdNumber = supervisorIdNumber;
	}

}
