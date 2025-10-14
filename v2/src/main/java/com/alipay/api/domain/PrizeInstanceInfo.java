package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品实例信息
 *
 * @author auto create
 * @since 1.0, 2025-05-12 13:39:32
 */
public class PrizeInstanceInfo extends AlipayObject {

	private static final long serialVersionUID = 4159122387955441247L;

	/**
	 * 奖品的优惠面额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 奖品的优惠面额单位
	 */
	@ApiField("discount_amount_unit")
	private String discountAmountUnit;

	/**
	 * 奖品的使用过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 奖品的使用门槛金额，默认单位：元
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 奖品的唯一标识
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品的类型
	 */
	@ApiField("prize_type")
	private String prizeType;

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountAmountUnit() {
		return this.discountAmountUnit;
	}
	public void setDiscountAmountUnit(String discountAmountUnit) {
		this.discountAmountUnit = discountAmountUnit;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

}
