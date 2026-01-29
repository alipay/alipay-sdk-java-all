package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV代理商户资金业务账单查询
 *
 * @author auto create
 * @since 1.0, 2025-11-21 15:00:46
 */
public class AlipayDataBillBizfundagentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8229361877287654385L;

	/**
	 * 记账本id，服务商在帮助商户开通时候获取的唯一身份号
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * ISV与商户授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 根据不同业务协议类型，传入不同参数。传入协议产品码（personal_product_code，通过协议查询接口、协议签约通知响应参数获取），不填的话默认按照示例值传入。 安全发协议：FUND_SAFT_SIGN_WITHHOLDING_P 专用金协议：FLEXIBLE_EMPLOYMENT_SERVICE_P
	 */
	@ApiField("agreement_type")
	private String agreementType;

	/**
	 * 账单查询时间范围 -- 结束范围。时间范围最大不超过31天。
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 页码，从1开始
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 分页大小1000-2000，默认2000
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 账单查询时间范围 -- 起始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAgreementType() {
		return this.agreementType;
	}
	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
