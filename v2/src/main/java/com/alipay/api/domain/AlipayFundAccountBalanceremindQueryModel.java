package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单个余额提醒计划
 *
 * @author auto create
 * @since 1.0, 2024-07-18 15:59:07
 */
public class AlipayFundAccountBalanceremindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6434454853659894941L;

	/**
	 * 场景码，固定传：QUERY_PLAN
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 产品码，固定传：BALANCE_REMIND
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
