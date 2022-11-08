package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单详情批量查询
 *
 * @author auto create
 * @since 1.0, 2022-10-14 18:19:54
 */
public class AlipayCommerceEcConsumeDetailBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2636324556978579613L;

	/**
	 * 共同账户ID，有企业ID可不传
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号，有企业ID可不传
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 截止时间，格式：yyyy-MM-dd HH:mm:ss，起始和截止时间不能大于31天。
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 企业ID，推荐查询方式
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 页数，本参数为空或小于1默认显示第一页。
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页大小，本参数为空或小于1默认20条，超过20默认按20条查询；不足20条则按实际记录数返回。
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 起始时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_date")
	private String startDate;

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

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
