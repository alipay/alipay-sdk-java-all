package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝商家账户历史余额查询
 *
 * @author auto create
 * @since 1.0, 2023-02-21 16:18:15
 */
public class AlipayDataBillBalancehisQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1214871748728823679L;

	/**
	 * 查询指定自然日的起初余额和期末余额，biz_date与biz_month传入参数互斥
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 查询指定自然月的起初余额和期末余额，biz_date与biz_month传入参数互斥
	 */
	@ApiField("biz_month")
	private String bizMonth;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizMonth() {
		return this.bizMonth;
	}
	public void setBizMonth(String bizMonth) {
		this.bizMonth = bizMonth;
	}

}
