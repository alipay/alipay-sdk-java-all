package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 促销活动对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:16
 */
public class DiscountActivityBean extends AlipayObject {

	private static final long serialVersionUID = 8137144662382633262L;

	/**
	 * 活动描述
	 */
	@ApiField("activity_desc")
	private String activityDesc;

	/**
	 * 活动详情ID
	 */
	@ApiField("activity_detail_id")
	private String activityDetailId;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 营销参数
	 */
	@ApiField("marketing_param")
	private MarketingParamBean marketingParam;

	/**
	 * 目标id
	 */
	@ApiField("participate_id")
	private String participateId;

	/**
	 * 目标类型
	 */
	@ApiField("participate_type")
	private String participateType;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 状态
    INIT((byte) 0, "初始化"),
    EFFECTIVE((byte) 1, "有效的"),
    EARLY_FINISHED((byte) 3, "被提前结束"),
	 */
	@ApiField("status")
	private Long status;

	public String getActivityDesc() {
		return this.activityDesc;
	}
	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}

	public String getActivityDetailId() {
		return this.activityDetailId;
	}
	public void setActivityDetailId(String activityDetailId) {
		this.activityDetailId = activityDetailId;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public MarketingParamBean getMarketingParam() {
		return this.marketingParam;
	}
	public void setMarketingParam(MarketingParamBean marketingParam) {
		this.marketingParam = marketingParam;
	}

	public String getParticipateId() {
		return this.participateId;
	}
	public void setParticipateId(String participateId) {
		this.participateId = participateId;
	}

	public String getParticipateType() {
		return this.participateType;
	}
	public void setParticipateType(String participateType) {
		this.participateType = participateType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
