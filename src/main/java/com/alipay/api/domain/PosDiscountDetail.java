package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos优惠明细信息
 *
 * @author auto create
 * @since 1.0, 2019-01-03 22:26:59
 */
public class PosDiscountDetail extends AlipayObject {

	private static final long serialVersionUID = 5895969322562799546L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动类型，可枚举的类型
(1)itemDiscount 商品级优惠
(2) buyItem 购买商品
(3) fullDiscountCamp 全场折活动
(4) fullCutCamp 全场满减活动
(5) fullCutVoucher 全场满减券
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 优惠名称
	 */
	@ApiField("discount_name")
	private String discountName;

	/**
	 * 优惠类型
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 扩展信息，存储优惠的详细模型。json对象格式，key和value都为字符串，其中DISH_ID为菜品id，USER_ITEM_ID为被核销商品id
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商家出资优惠金额，以元为单位，精确到分
	 */
	@ApiField("mrt_discount")
	private String mrtDiscount;

	/**
	 * 平台出资优惠金额，以元为单位，精确到分
	 */
	@ApiField("rt_discount")
	private String rtDiscount;

	/**
	 * 人群要求(会员)，可枚举的类型(1)member 会员(2) normal 普通
	 */
	@ApiField("target_user_type")
	private String targetUserType;

	/**
	 * 被核销的商品id
	 */
	@ApiField("used_item_id")
	private String usedItemId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getDiscountName() {
		return this.discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMrtDiscount() {
		return this.mrtDiscount;
	}
	public void setMrtDiscount(String mrtDiscount) {
		this.mrtDiscount = mrtDiscount;
	}

	public String getRtDiscount() {
		return this.rtDiscount;
	}
	public void setRtDiscount(String rtDiscount) {
		this.rtDiscount = rtDiscount;
	}

	public String getTargetUserType() {
		return this.targetUserType;
	}
	public void setTargetUserType(String targetUserType) {
		this.targetUserType = targetUserType;
	}

	public String getUsedItemId() {
		return this.usedItemId;
	}
	public void setUsedItemId(String usedItemId) {
		this.usedItemId = usedItemId;
	}

}
