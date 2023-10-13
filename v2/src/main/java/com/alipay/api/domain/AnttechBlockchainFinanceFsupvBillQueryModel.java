package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对账单查询接口
 *
 * @author auto create
 * @since 1.0, 2023-06-16 10:37:31
 */
public class AnttechBlockchainFinanceFsupvBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4292653715654779268L;

	/**
	 * 资金管控产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 对账单日期
	 */
	@ApiField("query_date")
	private Date queryDate;

	/**
	 * 管控方证件号码，一般为企业统一社会信用代码
	 */
	@ApiField("supervisor_id_number")
	private String supervisorIdNumber;

	/**
	 * 资金管控任务编码
	 */
	@ApiField("task_id")
	private String taskId;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
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

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
