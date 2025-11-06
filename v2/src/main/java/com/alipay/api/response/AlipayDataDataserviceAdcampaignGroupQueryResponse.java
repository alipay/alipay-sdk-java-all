package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenLbsEntry;
import com.alipay.api.domain.SearchWord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.group.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-14 21:02:34
 */
public class AlipayDataDataserviceAdcampaignGroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8353551497711271865L;

	/** 
	 * 年龄
	 */
	@ApiListField("age_list")
	@ApiField("string")
	private List<String> ageList;

	/** 
	 * 资产类型
	 */
	@ApiField("asset")
	private String asset;

	/** 
	 * 行为人群
	 */
	@ApiListField("behavior_list")
	@ApiField("string")
	private List<String> behaviorList;

	/** 
	 * 单元出价方式
	 */
	@ApiField("bid_type")
	private String bidType;

	/** 
	 * 起量预算。单位：元【人民币】；没有使用一键起量时，此值为空
	 */
	@ApiField("boost_budget")
	private String boostBudget;

	/** 
	 * 起量结束时间
	 */
	@ApiField("boost_end_date")
	private Date boostEndDate;

	/** 
	 * 起量id
	 */
	@ApiField("boost_id")
	private Long boostId;

	/** 
	 * 起量开始时间
	 */
	@ApiField("boost_start_date")
	private Date boostStartDate;

	/** 
	 * 地理位置-城市等级
	 */
	@ApiListField("city_level_list")
	@ApiField("string")
	private List<String> cityLevelList;

	/** 
	 * 转化ID对应事件类型
	 */
	@ApiField("converted_event")
	private String convertedEvent;

	/** 
	 * 转化事件分层
	 */
	@ApiField("converted_event_grp")
	private String convertedEventGrp;

	/** 
	 * 转化id
	 */
	@ApiField("converted_id")
	private String convertedId;

	/** 
	 * 地理位置类型
	 */
	@ApiField("district")
	private String district;

	/** 
	 * 排除人群
	 */
	@ApiListField("exclude_customized_crowd_list")
	@ApiField("string")
	private List<String> excludeCustomizedCrowdList;

	/** 
	 * 排除已转化人群-转化事件列表
	 */
	@ApiListField("filter_converted_event_list")
	@ApiField("string")
	private List<String> filterConvertedEventList;

	/** 
	 * 排除已转化人群维度
	 */
	@ApiField("filter_converted_scope")
	private String filterConvertedScope;

	/** 
	 * 排除已转化人群时间范围
	 */
	@ApiField("filter_converted_time_range")
	private String filterConvertedTimeRange;

	/** 
	 * 性别
	 */
	@ApiListField("gender_list")
	@ApiField("string")
	private List<String> genderList;

	/** 
	 * 单元修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 单元日预算。单位：元【人民币】如果是不限单元日预算，此值为空
	 */
	@ApiField("group_budget")
	private String groupBudget;

	/** 
	 * 单次出价。单位：元【人民币】。bidType= OCPX时会默认填充对应营销目标配置的最小值
	 */
	@ApiField("group_charge")
	private String groupCharge;

	/** 
	 * 单元id
	 */
	@ApiField("group_id")
	private Long groupId;

	/** 
	 * 单元继承id
	 */
	@ApiField("group_inherit")
	private Long groupInherit;

	/** 
	 * 单元名称
	 */
	@ApiField("group_name")
	private String groupName;

	/** 
	 * 单元状态
	 */
	@ApiField("group_status")
	private String groupStatus;

	/** 
	 * 自定义人群
	 */
	@ApiListField("include_customized_crowd_list")
	@ApiField("string")
	private List<String> includeCustomizedCrowdList;

	/** 
	 * 智能定向0-关闭，1-开启
	 */
	@ApiField("intelligent_target_switch")
	private Long intelligentTargetSwitch;

	/** 
	 * 兴趣人群
	 */
	@ApiListField("interest_list")
	@ApiField("string")
	private List<String> interestList;

	/** 
	 * 地理点位
	 */
	@ApiListField("lbs_list")
	@ApiField("open_lbs_entry")
	private List<OpenLbsEntry> lbsList;

	/** 
	 * 二级营销目标
	 */
	@ApiField("market_target_code")
	private String marketTargetCode;

	/** 
	 * 二级营销目标名称
	 */
	@ApiField("market_target_name")
	private String marketTargetName;

	/** 
	 * 起量状态
	 */
	@ApiField("one_boost_status")
	private String oneBoostStatus;

	/** 
	 * 操作系统
	 */
	@ApiListField("os_list")
	@ApiField("string")
	private List<String> osList;

	/** 
	 * 单元所属计划id
	 */
	@ApiField("plan_id")
	private Long planId;

	/** 
	 * 单元所属计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/** 
	 * 商家id
	 */
	@ApiField("principal_id")
	private Long principalId;

	/** 
	 * 是否开启推荐流量开关.0关闭，1开启
	 */
	@ApiField("referral_traffic_switch")
	private Long referralTrafficSwitch;

	/** 
	 * 地理位置-行政区域，行政区域编码和省市区县对应关系见<a href="https://www.mca.gov.cn/mzsj/xzqh/2022/202201xzqh.html">文档</a>
	 */
	@ApiListField("region_list")
	@ApiField("string")
	private List<String> regionList;

	/** 
	 * 地理位置-行政区域-位置类型，包括最近出现用户，正在此地的常驻用户，常驻此地用户，旅游到此地用户，当前地区全部用户
	 */
	@ApiField("region_type")
	private String regionType;

	/** 
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/** 
	 * 搜索词列表
	 */
	@ApiListField("search_word_list")
	@ApiField("search_word")
	private List<SearchWord> searchWordList;

	/** 
	 * 转化目标成本。单位：元【人民币】
	 */
	@ApiField("target_cpa")
	private String targetCpa;

	/** 
	 * 目标ROI,单位：元【人民币】
	 */
	@ApiField("target_roi")
	private String targetRoi;

	/** 
	 * 行业主题人群
	 */
	@ApiListField("theme_crowd_list")
	@ApiField("string")
	private List<String> themeCrowdList;

	public void setAgeList(List<String> ageList) {
		this.ageList = ageList;
	}
	public List<String> getAgeList( ) {
		return this.ageList;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}
	public String getAsset( ) {
		return this.asset;
	}

	public void setBehaviorList(List<String> behaviorList) {
		this.behaviorList = behaviorList;
	}
	public List<String> getBehaviorList( ) {
		return this.behaviorList;
	}

	public void setBidType(String bidType) {
		this.bidType = bidType;
	}
	public String getBidType( ) {
		return this.bidType;
	}

	public void setBoostBudget(String boostBudget) {
		this.boostBudget = boostBudget;
	}
	public String getBoostBudget( ) {
		return this.boostBudget;
	}

	public void setBoostEndDate(Date boostEndDate) {
		this.boostEndDate = boostEndDate;
	}
	public Date getBoostEndDate( ) {
		return this.boostEndDate;
	}

	public void setBoostId(Long boostId) {
		this.boostId = boostId;
	}
	public Long getBoostId( ) {
		return this.boostId;
	}

	public void setBoostStartDate(Date boostStartDate) {
		this.boostStartDate = boostStartDate;
	}
	public Date getBoostStartDate( ) {
		return this.boostStartDate;
	}

	public void setCityLevelList(List<String> cityLevelList) {
		this.cityLevelList = cityLevelList;
	}
	public List<String> getCityLevelList( ) {
		return this.cityLevelList;
	}

	public void setConvertedEvent(String convertedEvent) {
		this.convertedEvent = convertedEvent;
	}
	public String getConvertedEvent( ) {
		return this.convertedEvent;
	}

	public void setConvertedEventGrp(String convertedEventGrp) {
		this.convertedEventGrp = convertedEventGrp;
	}
	public String getConvertedEventGrp( ) {
		return this.convertedEventGrp;
	}

	public void setConvertedId(String convertedId) {
		this.convertedId = convertedId;
	}
	public String getConvertedId( ) {
		return this.convertedId;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	public String getDistrict( ) {
		return this.district;
	}

	public void setExcludeCustomizedCrowdList(List<String> excludeCustomizedCrowdList) {
		this.excludeCustomizedCrowdList = excludeCustomizedCrowdList;
	}
	public List<String> getExcludeCustomizedCrowdList( ) {
		return this.excludeCustomizedCrowdList;
	}

	public void setFilterConvertedEventList(List<String> filterConvertedEventList) {
		this.filterConvertedEventList = filterConvertedEventList;
	}
	public List<String> getFilterConvertedEventList( ) {
		return this.filterConvertedEventList;
	}

	public void setFilterConvertedScope(String filterConvertedScope) {
		this.filterConvertedScope = filterConvertedScope;
	}
	public String getFilterConvertedScope( ) {
		return this.filterConvertedScope;
	}

	public void setFilterConvertedTimeRange(String filterConvertedTimeRange) {
		this.filterConvertedTimeRange = filterConvertedTimeRange;
	}
	public String getFilterConvertedTimeRange( ) {
		return this.filterConvertedTimeRange;
	}

	public void setGenderList(List<String> genderList) {
		this.genderList = genderList;
	}
	public List<String> getGenderList( ) {
		return this.genderList;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setGroupBudget(String groupBudget) {
		this.groupBudget = groupBudget;
	}
	public String getGroupBudget( ) {
		return this.groupBudget;
	}

	public void setGroupCharge(String groupCharge) {
		this.groupCharge = groupCharge;
	}
	public String getGroupCharge( ) {
		return this.groupCharge;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Long getGroupId( ) {
		return this.groupId;
	}

	public void setGroupInherit(Long groupInherit) {
		this.groupInherit = groupInherit;
	}
	public Long getGroupInherit( ) {
		return this.groupInherit;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupName( ) {
		return this.groupName;
	}

	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}
	public String getGroupStatus( ) {
		return this.groupStatus;
	}

	public void setIncludeCustomizedCrowdList(List<String> includeCustomizedCrowdList) {
		this.includeCustomizedCrowdList = includeCustomizedCrowdList;
	}
	public List<String> getIncludeCustomizedCrowdList( ) {
		return this.includeCustomizedCrowdList;
	}

	public void setIntelligentTargetSwitch(Long intelligentTargetSwitch) {
		this.intelligentTargetSwitch = intelligentTargetSwitch;
	}
	public Long getIntelligentTargetSwitch( ) {
		return this.intelligentTargetSwitch;
	}

	public void setInterestList(List<String> interestList) {
		this.interestList = interestList;
	}
	public List<String> getInterestList( ) {
		return this.interestList;
	}

	public void setLbsList(List<OpenLbsEntry> lbsList) {
		this.lbsList = lbsList;
	}
	public List<OpenLbsEntry> getLbsList( ) {
		return this.lbsList;
	}

	public void setMarketTargetCode(String marketTargetCode) {
		this.marketTargetCode = marketTargetCode;
	}
	public String getMarketTargetCode( ) {
		return this.marketTargetCode;
	}

	public void setMarketTargetName(String marketTargetName) {
		this.marketTargetName = marketTargetName;
	}
	public String getMarketTargetName( ) {
		return this.marketTargetName;
	}

	public void setOneBoostStatus(String oneBoostStatus) {
		this.oneBoostStatus = oneBoostStatus;
	}
	public String getOneBoostStatus( ) {
		return this.oneBoostStatus;
	}

	public void setOsList(List<String> osList) {
		this.osList = osList;
	}
	public List<String> getOsList( ) {
		return this.osList;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public Long getPlanId( ) {
		return this.planId;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanName( ) {
		return this.planName;
	}

	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}
	public Long getPrincipalId( ) {
		return this.principalId;
	}

	public void setReferralTrafficSwitch(Long referralTrafficSwitch) {
		this.referralTrafficSwitch = referralTrafficSwitch;
	}
	public Long getReferralTrafficSwitch( ) {
		return this.referralTrafficSwitch;
	}

	public void setRegionList(List<String> regionList) {
		this.regionList = regionList;
	}
	public List<String> getRegionList( ) {
		return this.regionList;
	}

	public void setRegionType(String regionType) {
		this.regionType = regionType;
	}
	public String getRegionType( ) {
		return this.regionType;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode( ) {
		return this.sceneCode;
	}

	public void setSearchWordList(List<SearchWord> searchWordList) {
		this.searchWordList = searchWordList;
	}
	public List<SearchWord> getSearchWordList( ) {
		return this.searchWordList;
	}

	public void setTargetCpa(String targetCpa) {
		this.targetCpa = targetCpa;
	}
	public String getTargetCpa( ) {
		return this.targetCpa;
	}

	public void setTargetRoi(String targetRoi) {
		this.targetRoi = targetRoi;
	}
	public String getTargetRoi( ) {
		return this.targetRoi;
	}

	public void setThemeCrowdList(List<String> themeCrowdList) {
		this.themeCrowdList = themeCrowdList;
	}
	public List<String> getThemeCrowdList( ) {
		return this.themeCrowdList;
	}

}
