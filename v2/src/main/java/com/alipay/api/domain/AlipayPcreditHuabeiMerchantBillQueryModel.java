package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗分期商户贴息优惠账单查询
 *
 * @author auto create
 * @since 1.0, 2024-08-01 22:52:28
 */
public class AlipayPcreditHuabeiMerchantBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4674325576135454128L;

	/**
	 * 商户模版ID
	 */
	@ApiField("aggr_id")
	private String aggrId;

	/**
	 * 账单结束时间，与开始时间不能超过30天
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 账单开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getAggrId() {
		return this.aggrId;
	}
	public void setAggrId(String aggrId) {
		this.aggrId = aggrId;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
