package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目风控配置
 *
 * @author auto create
 * @since 1.0, 2024-03-11 15:17:01
 */
public class CategoryRiskInfoApiConfig extends AlipayObject {

	private static final long serialVersionUID = 2493547416598457635L;

	/**
	 * 风控类目code，为必传字段
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 风控类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 消费笔数上线。代表一个顾客在所有与芝麻信用合作的商户中，可同时享受该产品类信用服务的订单数量，推荐值为2，最多不超过5。
	 */
	@ApiField("global_orders_limit_number")
	private Long globalOrdersLimitNumber;

	/**
	 * 全局限额开关，可取值true和false。关闭后，当顾客在所有与芝麻信用合作的商户中，未结束的订单减免金额总额即便达到拦截阈值时，也可继续享受信用服务。
	 */
	@ApiField("global_quota_switch")
	private Boolean globalQuotaSwitch;

	/**
	 * 额度部分免开关，可取值true和false。 关闭后，当顾客的可免额度小于所需费用时，顾客不可使用可免额度，需全部用资金支付。
	 */
	@ApiField("part_deposit_switch")
	private Boolean partDepositSwitch;

	/**
	 * 综合风险评估，可取值：A1(高准入，满足芝麻分的情况下，通过率在90%以上)；A2(中准入，满足芝麻分情况下，通过率在80%以上)；A3(低准入，满足芝麻分情况下，通过率在60%以上)。
	 */
	@ApiField("risk_policy")
	private String riskPolicy;

	/**
	 * 芝麻分准入门槛。低于服务使用门槛的消费者将不能使用该品类的服务，推荐填写550分，建议填写范围550~850。
	 */
	@ApiField("score")
	private Long score;

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Long getGlobalOrdersLimitNumber() {
		return this.globalOrdersLimitNumber;
	}
	public void setGlobalOrdersLimitNumber(Long globalOrdersLimitNumber) {
		this.globalOrdersLimitNumber = globalOrdersLimitNumber;
	}

	public Boolean getGlobalQuotaSwitch() {
		return this.globalQuotaSwitch;
	}
	public void setGlobalQuotaSwitch(Boolean globalQuotaSwitch) {
		this.globalQuotaSwitch = globalQuotaSwitch;
	}

	public Boolean getPartDepositSwitch() {
		return this.partDepositSwitch;
	}
	public void setPartDepositSwitch(Boolean partDepositSwitch) {
		this.partDepositSwitch = partDepositSwitch;
	}

	public String getRiskPolicy() {
		return this.riskPolicy;
	}
	public void setRiskPolicy(String riskPolicy) {
		this.riskPolicy = riskPolicy;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

}
