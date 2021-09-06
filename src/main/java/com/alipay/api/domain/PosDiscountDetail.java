package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos优惠明细信息
 *
 * @author auto create
 * @since 1.0, 2021-01-19 14:21:23
 */
public class PosDiscountDetail extends AlipayObject {

	private static final long serialVersionUID = 4722348682356975349L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动类型，可枚举的类型
(1)itemDiscount: 商品级优惠
(2) buyItem：购买商品
(3) fullDiscountCamp：全场折活动
(4) fullCutCamp：全场满减活动
(5) fullCutVoucher 全场满减券
(6) itemReductionVoucher：单品立减券
(7) itemDiscountVoucher：单品折扣券
(8) itemSpecifiedVoucher：单品减至券
(9) userPoint : 积分抵扣
(10) comboDiscount  :商品组合折扣
(11) comboSpecified : 商品组合一口价
(12) alipayBSiteVoucher:支付宝B站劵
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
	 * 关联的主菜在这笔推单里的菜品流水id
	 */
	@ApiField("dish_main_out_detail_no")
	private String dishMainOutDetailNo;

	/**
	 * 菜品的在这笔推单里的流水明细id
	 */
	@ApiField("dish_out_detail_no")
	private String dishOutDetailNo;

	/**
	 * 菜品skuId
	 */
	@ApiField("dish_sku_id")
	private String dishSkuId;

	/**
	 * 此字段废弃，请使用ext_info_str。（扩展信息，存储优惠的详细模型。json对象格式，key和value都为字符串，其中DISH_ID为菜品id，USER_ITEM_ID为被核销商品id）
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 扩展信息，存储优惠的详细模型。json对象格式，key和value都为字符串，其中DISH_ID为菜品id，USER_ITEM_ID为被核销商品id，TEMPLATE_ID为券模版id，VOUCHER_ID为券实例id,POS_KEY为星巴克的poskey, DEDUCT_POINT为星巴克星星数.IS_CHANGE为星巴克是否置换标 ,"deductDetails":"[{\"consumeUnitPoint\":9,\"preferentialNum\":2,\"unitPrice\":"25.00"},{\"consumeUnitPoint\":1,\"preferentialNum\":1,\"unitPrice\":"3.00"}]"
	 */
	@ApiField("ext_info_str")
	private String extInfoStr;

	/**
	 * 商家出资优惠金额，以元为单位，精确到分; 如果是星巴克的星星，这里表示星星抵扣金额
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

	public String getDishMainOutDetailNo() {
		return this.dishMainOutDetailNo;
	}
	public void setDishMainOutDetailNo(String dishMainOutDetailNo) {
		this.dishMainOutDetailNo = dishMainOutDetailNo;
	}

	public String getDishOutDetailNo() {
		return this.dishOutDetailNo;
	}
	public void setDishOutDetailNo(String dishOutDetailNo) {
		this.dishOutDetailNo = dishOutDetailNo;
	}

	public String getDishSkuId() {
		return this.dishSkuId;
	}
	public void setDishSkuId(String dishSkuId) {
		this.dishSkuId = dishSkuId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getExtInfoStr() {
		return this.extInfoStr;
	}
	public void setExtInfoStr(String extInfoStr) {
		this.extInfoStr = extInfoStr;
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
