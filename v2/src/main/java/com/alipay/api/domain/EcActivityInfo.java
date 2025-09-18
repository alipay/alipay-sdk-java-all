package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码活动信息
 *
 * @author auto create
 * @since 1.0, 2024-07-11 10:34:29
 */
public class EcActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 4274818845454878672L;

	/**
	 * 活动唯一id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 营销活动的开始时间，时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 营销活动的描述
	 */
	@ApiField("promotion_describe")
	private String promotionDescribe;

	/**
	 * 营销活动的具体折扣力度。
单位：折
如：8.8折
	 */
	@ApiField("promotion_discount")
	private String promotionDiscount;

	/**
	 * 折扣时间为json格式的字符串，获取字符串之后，解析成json，key的含义为星期几，value的含义为具体的时间段
	 */
	@ApiField("promotion_duration")
	private String promotionDuration;

	/**
	 * 活动营销类型
	 */
	@ApiField("promotion_type")
	private String promotionType;

	/**
	 * 营销活动的开始时间；时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_date")
	private Date startDate;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPromotionDescribe() {
		return this.promotionDescribe;
	}
	public void setPromotionDescribe(String promotionDescribe) {
		this.promotionDescribe = promotionDescribe;
	}

	public String getPromotionDiscount() {
		return this.promotionDiscount;
	}
	public void setPromotionDiscount(String promotionDiscount) {
		this.promotionDiscount = promotionDiscount;
	}

	public String getPromotionDuration() {
		return this.promotionDuration;
	}
	public void setPromotionDuration(String promotionDuration) {
		this.promotionDuration = promotionDuration;
	}

	public String getPromotionType() {
		return this.promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
