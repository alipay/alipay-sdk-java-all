package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图文分析-按文章查询数据接口
 *
 * @author auto create
 * @since 1.0, 2024-02-26 17:28:40
 */
public class AlipayOpenPublicSinglearticleDataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1584822727671958773L;

	/**
	 * 数据开始日期，时间格式为 "yyyyMMdd" 。
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 数据结束日期，时间格式为"yyyyMMdd"。查询数据开始日期/结束日期时间跨度最大30天。
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
