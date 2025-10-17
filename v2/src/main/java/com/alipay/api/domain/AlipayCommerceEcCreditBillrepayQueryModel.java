package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业授信账单已还款查询
 *
 * @author auto create
 * @since 1.0, 2024-08-14 10:31:17
 */
public class AlipayCommerceEcCreditBillrepayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1827912525174242589L;

	/**
	 * 时间范围查询的结束时间，格式 yyyy-MM-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 企业Id，企业入驻企业码时自动分配的用于唯一标识的编号
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 没有还款查询时间范围限定时，借款申请的商户单号必传
	 */
	@ApiField("loan_out_biz_no")
	private String loanOutBizNo;

	/**
	 * 时间范围查询的开始时间，格式 yyyy-MM-dd
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getLoanOutBizNo() {
		return this.loanOutBizNo;
	}
	public void setLoanOutBizNo(String loanOutBizNo) {
		this.loanOutBizNo = loanOutBizNo;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
