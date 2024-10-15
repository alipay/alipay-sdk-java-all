package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询天明细账单出帐状态
 *
 * @author auto create
 * @since 1.0, 2024-06-27 17:49:36
 */
public class AlipayCloudCloudbaseWalletBillstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1248777492713546364L;

	/**
	 * 出账日期
	 */
	@ApiField("date")
	private String date;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
