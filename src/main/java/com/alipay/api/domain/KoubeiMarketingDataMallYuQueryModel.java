package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 浴兰测试api
 *
 * @author auto create
 * @since 1.0, 2017-04-07 18:13:27
 */
public class KoubeiMarketingDataMallYuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4712655449572957668L;

	/**
	 * 日期
	 */
	@ApiField("begin_date")
	private String beginDate;

	public String getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

}
