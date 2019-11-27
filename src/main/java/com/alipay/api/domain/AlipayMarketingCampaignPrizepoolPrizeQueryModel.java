package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询奖品池内的奖品配置
 *
 * @author auto create
 * @since 1.0, 2019-07-22 20:03:02
 */
public class AlipayMarketingCampaignPrizepoolPrizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6561444997921832368L;

	/**
	 * 奖品owner，创建奖品时设置的支付宝uid
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 奖品池id, 查询奖品的范围
	 */
	@ApiField("pool_id")
	private String poolId;

	/**
	 * PRIZE_CREATED("PRIZE_CREATED", "已创建状态")
PRIZE_OPENED("PRIZE_OPENED", "开启状态")
PRIZE_PAUSED("PRIZE_PAUSED", "暂停状态")
PRIZE_CLOSED("PRIZE_CLOSED", "关闭状态")
	 */
	@ApiField("status")
	private String status;

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPoolId() {
		return this.poolId;
	}
	public void setPoolId(String poolId) {
		this.poolId = poolId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
