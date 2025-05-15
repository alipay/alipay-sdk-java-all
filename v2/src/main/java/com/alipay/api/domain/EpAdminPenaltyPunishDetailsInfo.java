package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业行政处罚当事人处罚详情明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:16:44
 */
public class EpAdminPenaltyPunishDetailsInfo extends AlipayObject {

	private static final long serialVersionUID = 1379744395373357969L;

	/**
	 * 类别
	 */
	@ApiField("category")
	private String category;

	/**
	 * 处罚时间
	 */
	@ApiField("date")
	private String date;

	/**
	 * 金额，单位元
	 */
	@ApiField("money")
	private String money;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getMoney() {
		return this.money;
	}
	public void setMoney(String money) {
		this.money = money;
	}

}
