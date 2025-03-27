package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 快窗有礼投放创建
 *
 * @author auto create
 * @since 1.0, 2024-11-04 10:28:03
 */
public class AlipayOpenMiniMiniappLayerCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1812622658714334741L;

	/**
	 * 快窗有礼活动名称，仅用于商家识别，不对用户可见
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 不传表示无入群权益；
	 */
	@ApiListField("benefit_activity_list")
	@ApiField("benefit_activity")
	private List<BenefitActivity> benefitActivityList;

	/**
	 * 该参数为快窗在C端有哪些渠道能出的配置参数
	 */
	@ApiListField("channel_code_list")
	@ApiField("string")
	private List<String> channelCodeList;

	/**
	 * 默认不填写表示不对城市进行限制；填写了只有对应地区才能弹出此有礼活动；若填写不符合规范的城市编码、B站详情页展示不会显示该不符合规范的城市编码
	 */
	@ApiListField("city_code_list")
	@ApiField("string")
	private List<String> cityCodeList;

	/**
	 * 展示设置相关参数
	 */
	@ApiField("display_setting")
	private DisplaySetting displaySetting;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用户每日进入小程序，快窗展示3次后不再展示；若不传该值表示无疲劳度限制
	 */
	@ApiField("fatigue_count")
	private Long fatigueCount;

	/**
	 * 每日投放的开始时间
	 */
	@ApiField("layer_show_time_begin")
	private String layerShowTimeBegin;

	/**
	 * 每日投放结束时间
	 */
	@ApiField("layer_show_time_end")
	private String layerShowTimeEnd;

	/**
	 * 默认不填表示此活动不限制人群；填写了表示只针对人群包中的人群生效
	 */
	@ApiListField("mrch_crowd_list")
	@ApiField("string")
	private List<String> mrchCrowdList;

	/**
	 * 不传表示无券权益；券权益最多支持10个
	 */
	@ApiListField("promo_activity_list")
	@ApiField("promo_act_activity")
	private List<PromoActActivity> promoActivityList;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 三个枚举中选一个传入
	 */
	@ApiField("target")
	private String target;

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public List<BenefitActivity> getBenefitActivityList() {
		return this.benefitActivityList;
	}
	public void setBenefitActivityList(List<BenefitActivity> benefitActivityList) {
		this.benefitActivityList = benefitActivityList;
	}

	public List<String> getChannelCodeList() {
		return this.channelCodeList;
	}
	public void setChannelCodeList(List<String> channelCodeList) {
		this.channelCodeList = channelCodeList;
	}

	public List<String> getCityCodeList() {
		return this.cityCodeList;
	}
	public void setCityCodeList(List<String> cityCodeList) {
		this.cityCodeList = cityCodeList;
	}

	public DisplaySetting getDisplaySetting() {
		return this.displaySetting;
	}
	public void setDisplaySetting(DisplaySetting displaySetting) {
		this.displaySetting = displaySetting;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getFatigueCount() {
		return this.fatigueCount;
	}
	public void setFatigueCount(Long fatigueCount) {
		this.fatigueCount = fatigueCount;
	}

	public String getLayerShowTimeBegin() {
		return this.layerShowTimeBegin;
	}
	public void setLayerShowTimeBegin(String layerShowTimeBegin) {
		this.layerShowTimeBegin = layerShowTimeBegin;
	}

	public String getLayerShowTimeEnd() {
		return this.layerShowTimeEnd;
	}
	public void setLayerShowTimeEnd(String layerShowTimeEnd) {
		this.layerShowTimeEnd = layerShowTimeEnd;
	}

	public List<String> getMrchCrowdList() {
		return this.mrchCrowdList;
	}
	public void setMrchCrowdList(List<String> mrchCrowdList) {
		this.mrchCrowdList = mrchCrowdList;
	}

	public List<PromoActActivity> getPromoActivityList() {
		return this.promoActivityList;
	}
	public void setPromoActivityList(List<PromoActActivity> promoActivityList) {
		this.promoActivityList = promoActivityList;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTarget() {
		return this.target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

}
