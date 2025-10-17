package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 购卡须知信息
 *
 * @author auto create
 * @since 1.0, 2025-10-17 17:27:47
 */
public class CardPurchaseNotice extends AlipayObject {

	private static final long serialVersionUID = 1618968877651975172L;

	/**
	 * 卡详情进行展示，可以设置适用人数。
	 */
	@ApiField("max_users_options")
	private String maxUsersOptions;

	/**
	 * 卡详情进行展示，可以设置适用人数。
	 */
	@ApiField("max_users_value")
	private Long maxUsersValue;

	/**
	 * 卡详情进行展示，可以设置免预约或提前X个小时预约。
	 */
	@ApiField("reserve_rules_options")
	private String reserveRulesOptions;

	/**
	 * 卡详情进行展示，可以设置提前X个小时预约，支持传入0.5的整数倍。
	 */
	@ApiField("reserve_rules_value")
	private String reserveRulesValue;

	/**
	 * 卡详情进行展示，可以设置适用人群。
	 */
	@ApiField("target_users_options")
	private String targetUsersOptions;

	public String getMaxUsersOptions() {
		return this.maxUsersOptions;
	}
	public void setMaxUsersOptions(String maxUsersOptions) {
		this.maxUsersOptions = maxUsersOptions;
	}

	public Long getMaxUsersValue() {
		return this.maxUsersValue;
	}
	public void setMaxUsersValue(Long maxUsersValue) {
		this.maxUsersValue = maxUsersValue;
	}

	public String getReserveRulesOptions() {
		return this.reserveRulesOptions;
	}
	public void setReserveRulesOptions(String reserveRulesOptions) {
		this.reserveRulesOptions = reserveRulesOptions;
	}

	public String getReserveRulesValue() {
		return this.reserveRulesValue;
	}
	public void setReserveRulesValue(String reserveRulesValue) {
		this.reserveRulesValue = reserveRulesValue;
	}

	public String getTargetUsersOptions() {
		return this.targetUsersOptions;
	}
	public void setTargetUsersOptions(String targetUsersOptions) {
		this.targetUsersOptions = targetUsersOptions;
	}

}
