package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金管控任务列表查询
 *
 * @author auto create
 * @since 1.0, 2024-02-01 16:43:43
 */
public class AnttechBlockchainFinanceFsupvTaskBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8568147834856727159L;

	/**
	 * 产品码
	 */
	@ApiField("fund_supv_product_code")
	private String fundSupvProductCode;

	/**
	 * 任务开始日期
	 */
	@ApiField("query_date")
	private Date queryDate;

	/**
	 * 管控方证件号，一般为企业社会信用编码
	 */
	@ApiField("supervisor_id_number")
	private String supervisorIdNumber;

	public String getFundSupvProductCode() {
		return this.fundSupvProductCode;
	}
	public void setFundSupvProductCode(String fundSupvProductCode) {
		this.fundSupvProductCode = fundSupvProductCode;
	}

	public Date getQueryDate() {
		return this.queryDate;
	}
	public void setQueryDate(Date queryDate) {
		this.queryDate = queryDate;
	}

	public String getSupervisorIdNumber() {
		return this.supervisorIdNumber;
	}
	public void setSupervisorIdNumber(String supervisorIdNumber) {
		this.supervisorIdNumber = supervisorIdNumber;
	}

}
