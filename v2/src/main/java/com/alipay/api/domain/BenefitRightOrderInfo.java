package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益单信息
 *
 * @author auto create
 * @since 1.0, 2025-11-28 09:38:13
 */
public class BenefitRightOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 7522239357859472619L;

	/**
	 * 外部奖品编号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 奖品配置
	 */
	@ApiField("reward_config")
	private BenefitRewardConfig rewardConfig;

	/**
	 * 权益单业务状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券不可使用状态
	 */
	@ApiField("unavailable_status")
	private String unavailableStatus;

	/**
	 * 权益使用状态
	 */
	@ApiField("use_status")
	private String useStatus;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public BenefitRewardConfig getRewardConfig() {
		return this.rewardConfig;
	}
	public void setRewardConfig(BenefitRewardConfig rewardConfig) {
		this.rewardConfig = rewardConfig;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUnavailableStatus() {
		return this.unavailableStatus;
	}
	public void setUnavailableStatus(String unavailableStatus) {
		this.unavailableStatus = unavailableStatus;
	}

	public String getUseStatus() {
		return this.useStatus;
	}
	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}

}
