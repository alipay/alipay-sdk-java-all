package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * kms烘焙营销数据接口
 *
 * @author auto create
 * @since 1.0, 2020-09-14 15:48:38
 */
public class KmsBakingPromotionDTO extends AlipayObject {

	private static final long serialVersionUID = 5366865934239457184L;

	/**
	 * 活动限制
	 */
	@ApiField("activity_limitation")
	private ActivityLimitationDTO activityLimitation;

	/**
	 * 可用日志，周一、周二、周三、周四、周五、周六、周日。
枚举值: Monday、Tuesday、Wednesday、Thursday、Friday、Saturday、Sunday
如果有多个，用英文逗号连接。
	 */
	@ApiField("available_date")
	private String availableDate;

	/**
	 * 可用时段结束时间，格式HH:mm:ss
	 */
	@ApiField("available_end_time")
	private String availableEndTime;

	/**
	 * 可用时段开始时间，格式HH:mm:ss
	 */
	@ApiField("available_start_time")
	private String availableStartTime;

	/**
	 * 表示这条数据的唯一id，主要用于后续同步了重复数据以后去重，或者用于修复之前同步的问题数据。
建议生成规则：根据shop_id+promotion_id+operate_name+operate_time生成hash值
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 营销说明
	 */
	@ApiField("description")
	private String description;

	/**
	 * 营销结束时间；格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 营销互斥，取值范围为Y/N
	 */
	@ApiField("exclusive")
	private String exclusive;

	/**
	 * 满折营销
	 */
	@ApiField("full_discount")
	private FullDiscountDTO fullDiscount;

	/**
	 * 满赠营销
	 */
	@ApiField("full_gift")
	private FullGiftDTO fullGift;

	/**
	 * 满减营销
	 */
	@ApiField("full_reduction")
	private FullReductionDTO fullReduction;

	/**
	 * 会员营销，枚举值：Y/N
	 */
	@ApiField("member_promotion")
	private String memberPromotion;

	/**
	 * 操作；上架或下架
上架:upshelf；下架:offshelf
	 */
	@ApiField("operation_name")
	private String operationName;

	/**
	 * 操作时间，格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("operation_time")
	private String operationTime;

	/**
	 * 营销渠道，取值范围为线上/线下/全渠道
线上:online；线下:offline；全渠道:allchannel;
	 */
	@ApiField("promotion_channel")
	private String promotionChannel;

	/**
	 * 营销id
	 */
	@ApiField("promotion_id")
	private String promotionId;

	/**
	 * 营销名称
	 */
	@ApiField("promotion_name")
	private String promotionName;

	/**
	 * 营销范围，取值范围为单品/全场
单品:single;全场:fullcourt;
	 */
	@ApiField("promotion_scope")
	private String promotionScope;

	/**
	 * 营销类型，取值范围为满减/满折/特价/满赠/充值，
满减:fullreduction；满折:fulldiscount；特价:specialprice；满赠:fullgift；充值: recharge
	 */
	@ApiField("promotion_type")
	private String promotionType;

	/**
	 * 充值营销
	 */
	@ApiField("recharge")
	private RechargeDTO recharge;

	/**
	 * 特价营销
	 */
	@ApiField("special_price")
	private SpecialPriceDTO specialPrice;

	/**
	 * 营销开始时间；格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private String startTime;

	public ActivityLimitationDTO getActivityLimitation() {
		return this.activityLimitation;
	}
	public void setActivityLimitation(ActivityLimitationDTO activityLimitation) {
		this.activityLimitation = activityLimitation;
	}

	public String getAvailableDate() {
		return this.availableDate;
	}
	public void setAvailableDate(String availableDate) {
		this.availableDate = availableDate;
	}

	public String getAvailableEndTime() {
		return this.availableEndTime;
	}
	public void setAvailableEndTime(String availableEndTime) {
		this.availableEndTime = availableEndTime;
	}

	public String getAvailableStartTime() {
		return this.availableStartTime;
	}
	public void setAvailableStartTime(String availableStartTime) {
		this.availableStartTime = availableStartTime;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExclusive() {
		return this.exclusive;
	}
	public void setExclusive(String exclusive) {
		this.exclusive = exclusive;
	}

	public FullDiscountDTO getFullDiscount() {
		return this.fullDiscount;
	}
	public void setFullDiscount(FullDiscountDTO fullDiscount) {
		this.fullDiscount = fullDiscount;
	}

	public FullGiftDTO getFullGift() {
		return this.fullGift;
	}
	public void setFullGift(FullGiftDTO fullGift) {
		this.fullGift = fullGift;
	}

	public FullReductionDTO getFullReduction() {
		return this.fullReduction;
	}
	public void setFullReduction(FullReductionDTO fullReduction) {
		this.fullReduction = fullReduction;
	}

	public String getMemberPromotion() {
		return this.memberPromotion;
	}
	public void setMemberPromotion(String memberPromotion) {
		this.memberPromotion = memberPromotion;
	}

	public String getOperationName() {
		return this.operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getOperationTime() {
		return this.operationTime;
	}
	public void setOperationTime(String operationTime) {
		this.operationTime = operationTime;
	}

	public String getPromotionChannel() {
		return this.promotionChannel;
	}
	public void setPromotionChannel(String promotionChannel) {
		this.promotionChannel = promotionChannel;
	}

	public String getPromotionId() {
		return this.promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	public String getPromotionName() {
		return this.promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public String getPromotionScope() {
		return this.promotionScope;
	}
	public void setPromotionScope(String promotionScope) {
		this.promotionScope = promotionScope;
	}

	public String getPromotionType() {
		return this.promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public RechargeDTO getRecharge() {
		return this.recharge;
	}
	public void setRecharge(RechargeDTO recharge) {
		this.recharge = recharge;
	}

	public SpecialPriceDTO getSpecialPrice() {
		return this.specialPrice;
	}
	public void setSpecialPrice(SpecialPriceDTO specialPrice) {
		this.specialPrice = specialPrice;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
