package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销权益信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class InsMktCouponDTO extends AlipayObject {

	private static final long serialVersionUID = 7873811541643157433L;

	/**
	 * 权益资产Id，如券Id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 权益Id
	 */
	@ApiField("coupon_id")
	private String couponId;

	/**
	 * 权益类型
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 500元单品券
	 */
	@ApiField("coupon_value")
	private String couponValue;

	/**
	 * 是否推荐使用该优惠
	 */
	@ApiField("recommend")
	private Boolean recommend;

	/**
	 * 核销结束时间
	 */
	@ApiField("use_end_time")
	private Date useEndTime;

	/**
	 * 核销规则
	 */
	@ApiField("use_rule")
	private String useRule;

	/**
	 * 核销开始时间
	 */
	@ApiField("use_start_time")
	private Date useStartTime;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getCouponId() {
		return this.couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getCouponType() {
		return this.couponType;
	}
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public String getCouponValue() {
		return this.couponValue;
	}
	public void setCouponValue(String couponValue) {
		this.couponValue = couponValue;
	}

	public Boolean getRecommend() {
		return this.recommend;
	}
	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}

	public Date getUseEndTime() {
		return this.useEndTime;
	}
	public void setUseEndTime(Date useEndTime) {
		this.useEndTime = useEndTime;
	}

	public String getUseRule() {
		return this.useRule;
	}
	public void setUseRule(String useRule) {
		this.useRule = useRule;
	}

	public Date getUseStartTime() {
		return this.useStartTime;
	}
	public void setUseStartTime(Date useStartTime) {
		this.useStartTime = useStartTime;
	}

}
