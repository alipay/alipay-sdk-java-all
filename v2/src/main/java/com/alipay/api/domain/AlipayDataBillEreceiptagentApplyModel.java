package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV代理商户申请电子回单
 *
 * @author auto create
 * @since 1.0, 2024-01-15 15:08:34
 */
public class AlipayDataBillEreceiptagentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3523145679993959645L;

	/**
	 * ISV与商户签约授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 查询时间区间的结束时间，属于闭区间。
[start_time,end_time]
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 根据不同业务类型，传入不同参数。格式如下： * FUND_DETAIL - 资金业务回单。传入资金单号(fundOrderId，可通过充值、转账、提现接口获取)
	 */
	@ApiField("key")
	private String key;

	/**
	 * 搜索范围的起始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 申请的类型（目前仅支持资金业务回单）。可传入： * FUND_DETAIL - 资金业务回单。
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

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
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
