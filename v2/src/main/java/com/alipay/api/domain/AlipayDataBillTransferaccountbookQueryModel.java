package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子账本充提转账单查询
 *
 * @author auto create
 * @since 1.0, 2020-06-10 10:43:54
 */
public class AlipayDataBillTransferaccountbookQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7531935587137156316L;

	/**
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 充值、转账、提现流水业务时间的结束范围。与起始时间间隔不超过31天。查询结果为起始时间至结束时间的左闭右开区间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 分页号，从1开始
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 分页大小1000-2000，默认2000
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 充值、转账、提现流水业务时间的起始范围
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 子账本号，或者子账本名称。模糊查询
	 */
	@ApiField("store_no")
	private String storeNo;

	/**
	 * 转账类型：充值-DEPOSIT，提现-WITHDRAW，转账-TRANSFER。
	 */
	@ApiField("type")
	private String type;

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

	public String getStoreNo() {
		return this.storeNo;
	}
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
