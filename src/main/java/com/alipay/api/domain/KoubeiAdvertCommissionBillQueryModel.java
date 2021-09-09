package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑客分佣账单查询接口
 *
 * @author auto create
 * @since 1.0, 2017-09-29 15:05:35
 */
public class KoubeiAdvertCommissionBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5246262931146586931L;

	/**
	 * 账期(格式为yyyyMM)
	 */
	@ApiField("date")
	private String date;

	/**
	 * 账单类型
deal-交易账单
settle-结算账单
	 */
	@ApiField("type")
	private String type;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
