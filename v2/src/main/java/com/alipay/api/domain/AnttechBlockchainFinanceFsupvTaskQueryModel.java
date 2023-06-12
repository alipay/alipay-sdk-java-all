package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金管控任务查询接口
 *
 * @author auto create
 * @since 1.0, 2023-05-29 11:39:35
 */
public class AnttechBlockchainFinanceFsupvTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5579689534482825742L;

	/**
	 * 资金管控任务产品码，可联系产品或运营同学获取
	 */
	@ApiField("fund_supv_product_code")
	private String fundSupvProductCode;

	/**
	 * 被管控方证件号码，按实际场景获取
	 */
	@ApiField("supervised_id_number")
	private String supervisedIdNumber;

	/**
	 * 管控方证件号码
	 */
	@ApiField("supervisor_id_number")
	private String supervisorIdNumber;

	public String getFundSupvProductCode() {
		return this.fundSupvProductCode;
	}
	public void setFundSupvProductCode(String fundSupvProductCode) {
		this.fundSupvProductCode = fundSupvProductCode;
	}

	public String getSupervisedIdNumber() {
		return this.supervisedIdNumber;
	}
	public void setSupervisedIdNumber(String supervisedIdNumber) {
		this.supervisedIdNumber = supervisedIdNumber;
	}

	public String getSupervisorIdNumber() {
		return this.supervisorIdNumber;
	}
	public void setSupervisorIdNumber(String supervisorIdNumber) {
		this.supervisorIdNumber = supervisorIdNumber;
	}

}
