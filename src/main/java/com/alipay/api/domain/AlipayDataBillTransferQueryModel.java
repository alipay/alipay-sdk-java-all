package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝商家账户充值，转账，提现查询
 *
 * @author auto create
 * @since 1.0, 2019-11-25 16:10:32
 */
public class AlipayDataBillTransferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5547364387823228282L;

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
	 * 转账类型：充值-DEPOSIT，提现-WITHDRAW，转账-TRANSFER。
	 */
	@ApiField("type")
	private String type;

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
