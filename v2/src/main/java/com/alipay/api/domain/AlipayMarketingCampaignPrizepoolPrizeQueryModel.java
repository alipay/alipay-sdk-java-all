package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询奖品池内的奖品配置
 *
 * @author auto create
 * @since 1.0, 2020-05-09 19:52:48
 */
public class AlipayMarketingCampaignPrizepoolPrizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7796356576568611294L;

	/**
	 * 活动id,由蚂蚁营销产品统一分配
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 奖品池id,由蚂蚁营销产品统一分配
	 */
	@ApiField("pool_id")
	private String poolId;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getPoolId() {
		return this.poolId;
	}
	public void setPoolId(String poolId) {
		this.poolId = poolId;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

}
