package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 点餐业务信息
 *
 * @author auto create
 * @since 1.0, 2021-04-22 00:13:25
 */
public class CateringOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 4222837477348822335L;

	/**
	 * 点餐首页
	 */
	@ApiField("merchant_home_url")
	private String merchantHomeUrl;

	/**
	 * 桌号
	 */
	@ApiField("table_num")
	private String tableNum;

	public String getMerchantHomeUrl() {
		return this.merchantHomeUrl;
	}
	public void setMerchantHomeUrl(String merchantHomeUrl) {
		this.merchantHomeUrl = merchantHomeUrl;
	}

	public String getTableNum() {
		return this.tableNum;
	}
	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}

}
