package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV代理商户资金业务账单查询
 *
 * @author auto create
 * @since 1.0, 2021-08-13 16:37:43
 */
public class AlipayDataBillBizfundagentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4282888293863914752L;

	/**
	 * ISV与商户授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

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

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
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
