package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户分析数据查询接口
 *
 * @author auto create
 * @since 1.0, 2019-12-27 18:58:57
 */
public class AlipayOpenPublicUserDataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8321853616414946492L;

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
