package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建抽佣规则
 *
 * @author auto create
 * @since 1.0, 2025-12-01 20:32:41
 */
public class AlipayCommerceCommissionRuleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1584839544114453935L;

	/**
	 * 蚂蚁门店id，用于水平权限鉴权。可通过ant.merchant.expand.shop.create创建蚂蚁门店获取
	 */
	@ApiField("ant_shop_id")
	private String antShopId;

	/**
	 * 被抽佣支付宝的登录号，用于出资的账号。用户录入。
	 */
	@ApiField("charged_account_login_id")
	private String chargedAccountLoginId;

	/**
	 * 被抽佣支付宝账号名称。
	 */
	@ApiField("charged_account_name")
	private String chargedAccountName;

	/**
	 * 抽佣比例，格式为小数如0.1
	 */
	@ApiField("commission_ratio")
	private String commissionRatio;

	/**
	 * 抽佣结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 抽佣开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	public String getAntShopId() {
		return this.antShopId;
	}
	public void setAntShopId(String antShopId) {
		this.antShopId = antShopId;
	}

	public String getChargedAccountLoginId() {
		return this.chargedAccountLoginId;
	}
	public void setChargedAccountLoginId(String chargedAccountLoginId) {
		this.chargedAccountLoginId = chargedAccountLoginId;
	}

	public String getChargedAccountName() {
		return this.chargedAccountName;
	}
	public void setChargedAccountName(String chargedAccountName) {
		this.chargedAccountName = chargedAccountName;
	}

	public String getCommissionRatio() {
		return this.commissionRatio;
	}
	public void setCommissionRatio(String commissionRatio) {
		this.commissionRatio = commissionRatio;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
