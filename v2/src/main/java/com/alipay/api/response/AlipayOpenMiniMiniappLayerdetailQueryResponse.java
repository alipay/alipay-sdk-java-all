package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BenefitActivity;
import com.alipay.api.domain.ChannelCodeInfo;
import com.alipay.api.domain.DisplaySetting;
import com.alipay.api.domain.PromoActActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.layerdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:57:17
 */
public class AlipayOpenMiniMiniappLayerdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8736599154647936869L;

	/** 
	 * 表示活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/** 
	 * 除券以外的权益集合
	 */
	@ApiListField("benefit_activity_list")
	@ApiField("benefit_activity")
	private List<BenefitActivity> benefitActivityList;

	/** 
	 * 返回创建时传入的渠道的code以及code对应的name
	 */
	@ApiListField("channel_code_list")
	@ApiField("channel_code_info")
	private List<ChannelCodeInfo> channelCodeList;

	/** 
	 * 城市code集合
	 */
	@ApiListField("city_code_list")
	@ApiField("string")
	private List<String> cityCodeList;

	/** 
	 * 展示活动标题，标题区主色，活动规则
	 */
	@ApiField("display_setting")
	private DisplaySetting displaySetting;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 弹层疲劳度限制次数，出现x次后此弹层不会再出现
	 */
	@ApiField("fatigue_count")
	private Long fatigueCount;

	/** 
	 * 每日投放活动的开始时间
	 */
	@ApiField("layer_show_time_begin")
	private String layerShowTimeBegin;

	/** 
	 * 每日投放结束时间，每日投放结束时间必须晚于每日投放开始时间
	 */
	@ApiField("layer_show_time_end")
	private String layerShowTimeEnd;

	/** 
	 * 人群code的集合
	 */
	@ApiListField("mrch_crowd_list")
	@ApiField("string")
	private List<String> mrchCrowdList;

	/** 
	 * 券权益集合
	 */
	@ApiListField("promo_activity_list")
	@ApiField("promo_act_activity")
	private List<PromoActActivity> promoActivityList;

	/** 
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/** 
	 * 活动状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 承接方式
	 */
	@ApiField("target")
	private String target;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityName( ) {
		return this.activityName;
	}

	public void setBenefitActivityList(List<BenefitActivity> benefitActivityList) {
		this.benefitActivityList = benefitActivityList;
	}
	public List<BenefitActivity> getBenefitActivityList( ) {
		return this.benefitActivityList;
	}

	public void setChannelCodeList(List<ChannelCodeInfo> channelCodeList) {
		this.channelCodeList = channelCodeList;
	}
	public List<ChannelCodeInfo> getChannelCodeList( ) {
		return this.channelCodeList;
	}

	public void setCityCodeList(List<String> cityCodeList) {
		this.cityCodeList = cityCodeList;
	}
	public List<String> getCityCodeList( ) {
		return this.cityCodeList;
	}

	public void setDisplaySetting(DisplaySetting displaySetting) {
		this.displaySetting = displaySetting;
	}
	public DisplaySetting getDisplaySetting( ) {
		return this.displaySetting;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setFatigueCount(Long fatigueCount) {
		this.fatigueCount = fatigueCount;
	}
	public Long getFatigueCount( ) {
		return this.fatigueCount;
	}

	public void setLayerShowTimeBegin(String layerShowTimeBegin) {
		this.layerShowTimeBegin = layerShowTimeBegin;
	}
	public String getLayerShowTimeBegin( ) {
		return this.layerShowTimeBegin;
	}

	public void setLayerShowTimeEnd(String layerShowTimeEnd) {
		this.layerShowTimeEnd = layerShowTimeEnd;
	}
	public String getLayerShowTimeEnd( ) {
		return this.layerShowTimeEnd;
	}

	public void setMrchCrowdList(List<String> mrchCrowdList) {
		this.mrchCrowdList = mrchCrowdList;
	}
	public List<String> getMrchCrowdList( ) {
		return this.mrchCrowdList;
	}

	public void setPromoActivityList(List<PromoActActivity> promoActivityList) {
		this.promoActivityList = promoActivityList;
	}
	public List<PromoActActivity> getPromoActivityList( ) {
		return this.promoActivityList;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime( ) {
		return this.startTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTarget(String target) {
		this.target = target;
	}
	public String getTarget( ) {
		return this.target;
	}

}
