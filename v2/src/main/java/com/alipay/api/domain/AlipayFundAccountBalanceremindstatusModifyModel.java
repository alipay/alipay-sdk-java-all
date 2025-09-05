package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改余额提醒计划状态
 *
 * @author auto create
 * @since 1.0, 2024-07-18 15:58:57
 */
public class AlipayFundAccountBalanceremindstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2517741496963866797L;

	/**
	 * 场景码，固定传：MODIFY_PLAN_STATUS
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 计划版本号
	 */
	@ApiField("plan_version")
	private String planVersion;

	/**
	 * 产品码，固定传：BALANCE_REMIND
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 计划状态
	 */
	@ApiField("status")
	private String status;

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

	public String getPlanVersion() {
		return this.planVersion;
	}
	public void setPlanVersion(String planVersion) {
		this.planVersion = planVersion;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
