package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作员关联主账号查询
 *
 * @author auto create
 * @since 1.0, 2021-08-30 20:00:44
 */
public class AlipayFundTransOperatorBindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2696261376227721973L;

	/**
	 * 业务场景码，默认DEFAULT
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 企业支付宝主账号
	 */
	@ApiField("master_user_id")
	private String masterUserId;

	/**
	 * 操作员支付宝账号
	 */
	@ApiField("operator_user_id")
	private String operatorUserId;

	/**
	 * 业务产品码，枚举：
salary_platform_daily_salary
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMasterUserId() {
		return this.masterUserId;
	}
	public void setMasterUserId(String masterUserId) {
		this.masterUserId = masterUserId;
	}

	public String getOperatorUserId() {
		return this.operatorUserId;
	}
	public void setOperatorUserId(String operatorUserId) {
		this.operatorUserId = operatorUserId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
