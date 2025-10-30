package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单元新增或修改
 *
 * @author auto create
 * @since 1.0, 2025-07-15 19:27:42
 */
public class AlipayDataDataserviceAdcampaignGroupCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 2787882583279481477L;

	/**
	 * 年龄定向
	 */
	@ApiListField("age_list")
	@ApiField("string")
	private List<String> ageList;

	/**
	 * 资产类型（前置转化资产openAPI接口获取）转化类型获取接口：alipay.data.dataservice.adconversion.conversiontype.query
字段名asset
	 */
	@ApiField("asset")
	private String asset;

	/**
	 * 行为人群包,根据行为人群定向API接口返回值填写
alipay.data.dataservice.adcrowd.behaviorcategory.batchquery
	 */
	@ApiListField("behavior_list")
	@ApiField("string")
	private List<String> behaviorList;

	/**
	 * 0:DEFAULT
1:OCPX
2:NO_BID
  仅支持 智投场景
3:ROI（仅支持应用推广-小游戏推广、商品推广-保险商品全域推广，小程序商品推广
转化目标类型为小程序支付ROI
）
	 */
	@ApiField("bid_type")
	private String bidType;

	/**
	 * 起量预算（元）【人民币】
若oneBoostStatus为开启，必填
起量预算最低100元
起量预算不可超过计划日预算100元
	 */
	@ApiField("boost_budget")
	private String boostBudget;

	/**
	 * 城市等级（行政区域与城市等级互斥）
	 */
	@ApiListField("city_level_list")
	@ApiField("string")
	private List<String> cityLevelList;

	/**
	 * 转化事件类型，（前置转化资产openAPI接口获取）转化类型获取接口：alipay.data.dataservice.adconversion.conversiontype.query
字段名converted_event
	 */
	@ApiField("converted_event")
	private String convertedEvent;

	/**
	 * 转化分层非必填（前置转化资产openAPI接口获取）转化类型获取接口：alipay.data.dataservice.adconversion.conversiontype.query
字段名converted_event_grp
	 */
	@ApiField("converted_event_grp")
	private String convertedEventGrp;

	/**
	 * 转化事件Id（前置转化事件查询接口openAPI接口获取）接口：alipay.data.dataservice.adconversion.conversionid.query
字段名converted_id
	 */
	@ApiField("converted_id")
	private String convertedId;

	/**
	 * 定向选择的地理位置类型
	 */
	@ApiField("district")
	private String district;

	/**
	 * 排除人群，自定义人群查询API
alipay.data.dataservice.adcrowd.dmpcrowd.batchquery
	 */
	@ApiListField("exclude_customized_crowd_list")
	@ApiField("string")
	private List<String> excludeCustomizedCrowdList;

	/**
	 * 排除转化事件列表，根据灯火广告定向已转化事件查询API返回的转化事件列表填写
alipay.data.dataservice.adtarget.convertedevent.batchquery
	 */
	@ApiListField("filter_converted_event_list")
	@ApiField("string")
	private List<String> filterConvertedEventList;

	/**
	 * 排除已转化人群维度
CUSTOMER同pid
	 */
	@ApiField("filter_converted_scope")
	private String filterConvertedScope;

	/**
	 * 排除已转化人群时间范围
近1天. one_day
近7天. seven_day
近1月. one_month
近3月 .threemonth
近6月. six_month
同单元和同计划只允许6个月
	 */
	@ApiField("filter_converted_time_range")
	private String filterConvertedTimeRange;

	/**
	 * 性别,允许值： GENDER_FEMALE、 GENDER_MALE
	 */
	@ApiListField("gender_list")
	@ApiField("string")
	private List<String> genderList;

	/**
	 * 单元日预算（元）【人民币】
若为不限预算时，此项为空
当bidType=NO_BID时，单元日预算必填
	 */
	@ApiField("group_budget")
	private String groupBudget;

	/**
	 * 单元出价(元)：当bidType= DEFAULT时，必填
	 */
	@ApiField("group_charge")
	private String groupCharge;

	/**
	 * 单元id,修改单元时必传,新增单元时不传
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 同营销目标和同主体下的单元ID
	 */
	@ApiField("group_inherit")
	private Long groupInherit;

	/**
	 * 单元名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 自定义人群包，自定义人群查询API alipay.data.dataservice.adcrowd.dmpcrowd.batchquery
	 */
	@ApiListField("include_customized_crowd_list")
	@ApiField("string")
	private List<String> includeCustomizedCrowdList;

	/**
	 * 兴趣人群包，根据兴趣人群定向API接口返回值填写
alipay.data.dataservice.adcrowd.interestcategory.batchquery
	 */
	@ApiListField("interest_list")
	@ApiField("string")
	private List<String> interestList;

	/**
	 * 地理点位设置
	 */
	@ApiListField("lbs_list")
	@ApiField("open_lbs_entry")
	private List<OpenLbsEntry> lbsList;

	/**
	 * 仅出价方式bidType=OCPX时才可开启一键起量
ENABLE: 开启
MANUAL_DISABLE：手动关闭
	 */
	@ApiField("one_boost_status")
	private String oneBoostStatus;

	/**
	 * 手机操作系统
	 */
	@ApiListField("os_list")
	@ApiField("string")
	private List<String> osList;

	/**
	 * 计划id
	 */
	@ApiField("plan_id")
	private Long planId;

	/**
	 * 委托人标识
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 是否开启推荐流量开关.1打开，0关闭
	 */
	@ApiField("referral_traffic_switch")
	private Long referralTrafficSwitch;

	/**
	 * 允许值是行政区域码，仅支持大陆和港澳地区省、市、区县级别，条件必填，行政区域码请参考 <a href="https://www.mca.gov.cn/mzsj/xzqh/2022/202201xzqh.html">文档</a>，请完整填写6位数，目前仅支持到区县粒度
	 */
	@ApiListField("region_list")
	@ApiField("string")
	private List<String> regionList;

	/**
	 * 地理位置类型
CURRENT正在该地区的用户，
RESIDENCE常驻在该地区的用户，
TRAVEL到该地区旅行的用户，
ALL该地区内的所有用户，
RECENT最近出现的用户
条件必填 当region_list有值和district=REGION时必填
	 */
	@ApiField("region_type")
	private String regionType;

	/**
	 * 搜索词列表
	 */
	@ApiListField("search_word_list")
	@ApiField("search_word")
	private List<SearchWord> searchWordList;

	/**
	 * 目标转化成本：当bidType= OCPX时，必填
单位为元【人民币】
	 */
	@ApiField("target_cpa")
	private String targetCpa;

	/**
	 * 目标ROI，单位【元】，人民币。
bidType= ROI时候必填
	 */
	@ApiField("target_roi")
	private String targetRoi;

	/**
	 * 行业主题人群包，根据行业主题人群查询定向API接口返回值填写
alipay.data.dataservice.adcrowd.themecrowd.batchquery
	 */
	@ApiListField("theme_crowd_list")
	@ApiField("string")
	private List<String> themeCrowdList;

	public List<String> getAgeList() {
		return this.ageList;
	}
	public void setAgeList(List<String> ageList) {
		this.ageList = ageList;
	}

	public String getAsset() {
		return this.asset;
	}
	public void setAsset(String asset) {
		this.asset = asset;
	}

	public List<String> getBehaviorList() {
		return this.behaviorList;
	}
	public void setBehaviorList(List<String> behaviorList) {
		this.behaviorList = behaviorList;
	}

	public String getBidType() {
		return this.bidType;
	}
	public void setBidType(String bidType) {
		this.bidType = bidType;
	}

	public String getBoostBudget() {
		return this.boostBudget;
	}
	public void setBoostBudget(String boostBudget) {
		this.boostBudget = boostBudget;
	}

	public List<String> getCityLevelList() {
		return this.cityLevelList;
	}
	public void setCityLevelList(List<String> cityLevelList) {
		this.cityLevelList = cityLevelList;
	}

	public String getConvertedEvent() {
		return this.convertedEvent;
	}
	public void setConvertedEvent(String convertedEvent) {
		this.convertedEvent = convertedEvent;
	}

	public String getConvertedEventGrp() {
		return this.convertedEventGrp;
	}
	public void setConvertedEventGrp(String convertedEventGrp) {
		this.convertedEventGrp = convertedEventGrp;
	}

	public String getConvertedId() {
		return this.convertedId;
	}
	public void setConvertedId(String convertedId) {
		this.convertedId = convertedId;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public List<String> getExcludeCustomizedCrowdList() {
		return this.excludeCustomizedCrowdList;
	}
	public void setExcludeCustomizedCrowdList(List<String> excludeCustomizedCrowdList) {
		this.excludeCustomizedCrowdList = excludeCustomizedCrowdList;
	}

	public List<String> getFilterConvertedEventList() {
		return this.filterConvertedEventList;
	}
	public void setFilterConvertedEventList(List<String> filterConvertedEventList) {
		this.filterConvertedEventList = filterConvertedEventList;
	}

	public String getFilterConvertedScope() {
		return this.filterConvertedScope;
	}
	public void setFilterConvertedScope(String filterConvertedScope) {
		this.filterConvertedScope = filterConvertedScope;
	}

	public String getFilterConvertedTimeRange() {
		return this.filterConvertedTimeRange;
	}
	public void setFilterConvertedTimeRange(String filterConvertedTimeRange) {
		this.filterConvertedTimeRange = filterConvertedTimeRange;
	}

	public List<String> getGenderList() {
		return this.genderList;
	}
	public void setGenderList(List<String> genderList) {
		this.genderList = genderList;
	}

	public String getGroupBudget() {
		return this.groupBudget;
	}
	public void setGroupBudget(String groupBudget) {
		this.groupBudget = groupBudget;
	}

	public String getGroupCharge() {
		return this.groupCharge;
	}
	public void setGroupCharge(String groupCharge) {
		this.groupCharge = groupCharge;
	}

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getGroupInherit() {
		return this.groupInherit;
	}
	public void setGroupInherit(Long groupInherit) {
		this.groupInherit = groupInherit;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<String> getIncludeCustomizedCrowdList() {
		return this.includeCustomizedCrowdList;
	}
	public void setIncludeCustomizedCrowdList(List<String> includeCustomizedCrowdList) {
		this.includeCustomizedCrowdList = includeCustomizedCrowdList;
	}

	public List<String> getInterestList() {
		return this.interestList;
	}
	public void setInterestList(List<String> interestList) {
		this.interestList = interestList;
	}

	public List<OpenLbsEntry> getLbsList() {
		return this.lbsList;
	}
	public void setLbsList(List<OpenLbsEntry> lbsList) {
		this.lbsList = lbsList;
	}

	public String getOneBoostStatus() {
		return this.oneBoostStatus;
	}
	public void setOneBoostStatus(String oneBoostStatus) {
		this.oneBoostStatus = oneBoostStatus;
	}

	public List<String> getOsList() {
		return this.osList;
	}
	public void setOsList(List<String> osList) {
		this.osList = osList;
	}

	public Long getPlanId() {
		return this.planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public Long getReferralTrafficSwitch() {
		return this.referralTrafficSwitch;
	}
	public void setReferralTrafficSwitch(Long referralTrafficSwitch) {
		this.referralTrafficSwitch = referralTrafficSwitch;
	}

	public List<String> getRegionList() {
		return this.regionList;
	}
	public void setRegionList(List<String> regionList) {
		this.regionList = regionList;
	}

	public String getRegionType() {
		return this.regionType;
	}
	public void setRegionType(String regionType) {
		this.regionType = regionType;
	}

	public List<SearchWord> getSearchWordList() {
		return this.searchWordList;
	}
	public void setSearchWordList(List<SearchWord> searchWordList) {
		this.searchWordList = searchWordList;
	}

	public String getTargetCpa() {
		return this.targetCpa;
	}
	public void setTargetCpa(String targetCpa) {
		this.targetCpa = targetCpa;
	}

	public String getTargetRoi() {
		return this.targetRoi;
	}
	public void setTargetRoi(String targetRoi) {
		this.targetRoi = targetRoi;
	}

	public List<String> getThemeCrowdList() {
		return this.themeCrowdList;
	}
	public void setThemeCrowdList(List<String> themeCrowdList) {
		this.themeCrowdList = themeCrowdList;
	}

}
