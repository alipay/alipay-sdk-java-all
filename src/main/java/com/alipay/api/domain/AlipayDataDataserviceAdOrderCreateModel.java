package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告订单创建
 *
 * @author auto create
 * @since 1.0, 2022-01-10 20:25:04
 */
public class AlipayDataDataserviceAdOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8269958857449738196L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 计费方式：
CPM-按展示次数收费
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 订单结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 订单名称
	 */
	@ApiField("order_name")
	private String orderName;

	/**
	 * 外部平台导入广告库后，广告投放订单对应的外部资源ID
	 */
	@ApiField("order_outer_id")
	private String orderOuterId;

	/**
	 * 广告投放平台生成委托人ID
	 */
	@ApiField("principal_id")
	private Long principalId;

	/**
	 * 套餐ID
	 */
	@ApiField("profile_id")
	private Long profileId;

	/**
	 * 售卖方式：
GD-合约交易
	 */
	@ApiField("sell_mode")
	private String sellMode;

	/**
	 * 选点策略
	 */
	@ApiField("site_strategy")
	private SiteStrategy siteStrategy;

	/**
	 * 订单开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 外部平台门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 定向列表
	 */
	@ApiListField("targeting_list")
	@ApiField("outer_targeting_item")
	private List<OuterTargetingItem> targetingList;

	/**
	 * 广告投放平台生成广告主/代理商ID
	 */
	@ApiField("user_id")
	private Long userId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOrderName() {
		return this.orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderOuterId() {
		return this.orderOuterId;
	}
	public void setOrderOuterId(String orderOuterId) {
		this.orderOuterId = orderOuterId;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

	public Long getProfileId() {
		return this.profileId;
	}
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	public String getSellMode() {
		return this.sellMode;
	}
	public void setSellMode(String sellMode) {
		this.sellMode = sellMode;
	}

	public SiteStrategy getSiteStrategy() {
		return this.siteStrategy;
	}
	public void setSiteStrategy(SiteStrategy siteStrategy) {
		this.siteStrategy = siteStrategy;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public List<OuterTargetingItem> getTargetingList() {
		return this.targetingList;
	}
	public void setTargetingList(List<OuterTargetingItem> targetingList) {
		this.targetingList = targetingList;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
