package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户下单前活动查询接口
 *
 * @author auto create
 * @since 1.0, 2026-10-09 17:06:12
 */
public class AlipayPcreditHuabeiPcreditbenefitHuabeijinPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 3438493238896867387L;

	/**
	 * 花呗商户活动
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 123为1.23元，单位为分
	 */
	@ApiField("actual_amount")
	private Long actualAmount;

	/**
	 * 判读用户是否可以参加这个活动需要关注这个开关，true=校验查海豚限次+活动是否进行，false/不传=校验活动是否进行，如果只是想打个广告的话建议false，如果真的想校验建议true打开这个开关
	 */
	@ApiField("camp_consult")
	private Boolean campConsult;

	/**
	 * 行业场景标识,依赖双方约定
	 */
	@ApiField("industry_value")
	private String industryValue;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商品或订单场景描述，仅用于排查与展示，不参与核心计算
	 */
	@ApiField("order_desc")
	private String orderDesc;

	/**
	 * 如果只想拿到可以返回的花呗金范围写false，想精确知道某用户本次可以反多少花呗金选true，注意如果设置所有亲密度等级用户反同样比例的的花呗金，返回的上下限是一样的
	 */
	@ApiField("precise_by_level")
	private Boolean preciseByLevel;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Long getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(Long actualAmount) {
		this.actualAmount = actualAmount;
	}

	public Boolean getCampConsult() {
		return this.campConsult;
	}
	public void setCampConsult(Boolean campConsult) {
		this.campConsult = campConsult;
	}

	public String getIndustryValue() {
		return this.industryValue;
	}
	public void setIndustryValue(String industryValue) {
		this.industryValue = industryValue;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderDesc() {
		return this.orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public Boolean getPreciseByLevel() {
		return this.preciseByLevel;
	}
	public void setPreciseByLevel(Boolean preciseByLevel) {
		this.preciseByLevel = preciseByLevel;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
