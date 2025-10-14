package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Lavida小键盘账单交易汇总查询
 *
 * @author auto create
 * @since 1.0, 2022-10-17 11:11:54
 */
public class AlipayOpenIotbpaasLavidabillsumQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3156325524394476243L;

	/**
	 * 查询日期
	 */
	@ApiField("query_date")
	private String queryDate;

	public String getQueryDate() {
		return this.queryDate;
	}
	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}

}
