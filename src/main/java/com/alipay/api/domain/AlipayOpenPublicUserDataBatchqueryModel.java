package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户分析数据查询接口
 *
 * @author auto create
 * @since 1.0, 2017-12-06 11:29:09
 */
public class AlipayOpenPublicUserDataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1889217569918538442L;

	/**
	 * 开始日期
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 结束日期，开始日期/结束日期时间跨度最大30天
	 */
	@ApiField("end_date")
	private String endDate;

	public String getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
