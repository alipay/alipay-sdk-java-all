package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 五福耗卡查询
 *
 * @author auto create
 * @since 1.0, 2024-01-03 13:38:16
 */
public class AlipayFundCouponWufuCostassetsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5162953289458471391L;

	/**
	 * 需要消耗的福卡数量
	 */
	@ApiField("cost_count")
	private Long costCount;

	/**
	 * 是否消耗商家x福卡类型
	 */
	@ApiField("cost_merchant_card")
	private String costMerchantCard;

	/**
	 * 拓展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

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

	public String getCostMerchantCard() {
		return this.costMerchantCard;
	}
	public void setCostMerchantCard(String costMerchantCard) {
		this.costMerchantCard = costMerchantCard;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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
