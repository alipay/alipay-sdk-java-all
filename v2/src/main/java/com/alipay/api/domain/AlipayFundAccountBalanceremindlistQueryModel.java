package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询余额提醒计划列表
 *
 * @author auto create
 * @since 1.0, 2024-09-03 15:24:51
 */
public class AlipayFundAccountBalanceremindlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5389413334989442413L;

	/**
	 * 场景码，固定传：QUERY_PLAN_LIST
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 被监控账户
	 */
	@ApiField("monitor_user_id")
	private String monitorUserId;

	/**
	 * 被监控账户
	 */
	@ApiField("monitor_user_open_id")
	private String monitorUserOpenId;

	/**
	 * 产品码，固定传：BALANCE_REMIND
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 接入方的业务场景，如示例值：ETC代扣场景
	 */
	@ApiField("third_biz_scene")
	private String thirdBizScene;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMonitorUserId() {
		return this.monitorUserId;
	}
	public void setMonitorUserId(String monitorUserId) {
		this.monitorUserId = monitorUserId;
	}

	public String getMonitorUserOpenId() {
		return this.monitorUserOpenId;
	}
	public void setMonitorUserOpenId(String monitorUserOpenId) {
		this.monitorUserOpenId = monitorUserOpenId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getThirdBizScene() {
		return this.thirdBizScene;
	}
	public void setThirdBizScene(String thirdBizScene) {
		this.thirdBizScene = thirdBizScene;
	}

}
