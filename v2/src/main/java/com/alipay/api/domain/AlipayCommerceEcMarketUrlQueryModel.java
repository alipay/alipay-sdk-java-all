package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询展区行动点跳链
 *
 * @author auto create
 * @since 1.0, 2025-11-06 17:02:40
 */
public class AlipayCommerceEcMarketUrlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6233471892634678559L;

	/**
	 * 行动ID
	 */
	@ApiField("action_id")
	private String actionId;

	/**
	 * 员工ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 展品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 展区id
	 */
	@ApiField("region_id")
	private String regionId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionId() {
		return this.actionId;
	}
	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRegionId() {
		return this.regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
