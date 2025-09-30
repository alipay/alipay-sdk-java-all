package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 语音播报报表查询
 *
 * @author auto create
 * @since 1.0, 2025-08-26 15:55:12
 */
public class AlipayOfflineProviderBroadcastQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2616679399745972494L;

	/**
	 * 查询的作业截止日期，要求最近60天以内
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 间联商户id
	 */
	@ApiField("smid")
	private String smid;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
