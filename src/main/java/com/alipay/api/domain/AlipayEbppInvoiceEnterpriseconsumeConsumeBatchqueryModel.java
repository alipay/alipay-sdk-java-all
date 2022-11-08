package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业因公账单查询
 *
 * @author auto create
 * @since 1.0, 2022-02-21 14:02:10
 */
public class AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7769998399354982791L;

	/**
	 * 企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 交易结束时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("consumption_end")
	private Date consumptionEnd;

	/**
	 * 交易开始时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("consumption_start")
	private Date consumptionStart;

	/**
	 * 员工支付宝UID列表，单次传入最大员工数量为10
	 */
	@ApiListField("employee_list")
	@ApiField("string")
	private List<String> employeeList;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public Date getConsumptionEnd() {
		return this.consumptionEnd;
	}
	public void setConsumptionEnd(Date consumptionEnd) {
		this.consumptionEnd = consumptionEnd;
	}

	public Date getConsumptionStart() {
		return this.consumptionStart;
	}
	public void setConsumptionStart(Date consumptionStart) {
		this.consumptionStart = consumptionStart;
	}

	public List<String> getEmployeeList() {
		return this.employeeList;
	}
	public void setEmployeeList(List<String> employeeList) {
		this.employeeList = employeeList;
	}

}
