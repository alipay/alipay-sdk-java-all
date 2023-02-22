package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 五福耗卡查询
 *
 * @author auto create
 * @since 1.0, 2022-12-07 18:01:05
 */
public class AlipayFundCouponWufuCostassetsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3734939918724336278L;

	/**
	 * 需要消耗的福卡数量
	 */
	@ApiField("cost_count")
	private Long costCount;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * SHOP：服气店；
GAME：游戏；
SQUARE：福气乐园
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getCostCount() {
		return this.costCount;
	}
	public void setCostCount(Long costCount) {
		this.costCount = costCount;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
