package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻信用承诺消费-活动模型
 *
 * @author auto create
 * @since 1.0, 2019-04-29 19:06:14
 */
public class Activity extends AlipayObject {

	private static final long serialVersionUID = 3482894524958924361L;

	/**
	 * 活动名称，用于展示和区分活动，可重名
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动号
	 */
	@ApiField("activity_no")
	private String activityNo;

	/**
	 * 芝麻信用承诺消费活动规则详情, 商户创建的活动规则, 无需脱敏。
	 */
	@ApiField("activity_rule_detail")
	private ActivityRuleDetail activityRuleDetail;

	/**
	 * 活动门店列表信息
	 */
	@ApiListField("activity_shop_list")
	@ApiField("activity_shop")
	private List<ActivityShop> activityShopList;

	/**
	 * 活动统计信息, 查询如果打开开关就会有统计值
	 */
	@ApiField("activity_stat")
	private ActivityStat activityStat;

	/**
	 * 活动状态, 一定在下列枚举中：
NOT_STARTED - 未开始
AVAILABLE - 活动中
END - 活动结束
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/**
	 * 活动品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 活动结束时间，标准时间格式：yyyy-MM-dd HH:mm:ss.
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 消费维度，用于核销判断，必须在如下枚举中：
MERCHANT - 商户维度
SHOP - 门店维度
	 */
	@ApiField("fulfil_dimension")
	private String fulfilDimension;

	/**
	 * 开放平台接口调用者appId
	 */
	@ApiField("invoke_app_id")
	private String invokeAppId;

	/**
	 * 商户外部活动号。需确保同一个商户Id下外部活动号唯一。
	 */
	@ApiField("out_activity_no")
	private String outActivityNo;

	/**
	 * 商户Id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 活动规则类型，在如下枚内：
CONSUME_AMOUNT -- 消费金额;
CONSUME_TIMES -- 消费次数。
	 */
	@ApiField("rule_type")
	private String ruleType;

	/**
	 * 活动规则类型描述，在如下枚内：
CONSUME_AMOUNT为"消费金额";
CONSUME_TIMES为"消费次数"。
	 */
	@ApiField("rule_type_desc")
	private String ruleTypeDesc;

	/**
	 * 活动开始时间，请用标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityNo() {
		return this.activityNo;
	}
	public void setActivityNo(String activityNo) {
		this.activityNo = activityNo;
	}

	public ActivityRuleDetail getActivityRuleDetail() {
		return this.activityRuleDetail;
	}
	public void setActivityRuleDetail(ActivityRuleDetail activityRuleDetail) {
		this.activityRuleDetail = activityRuleDetail;
	}

	public List<ActivityShop> getActivityShopList() {
		return this.activityShopList;
	}
	public void setActivityShopList(List<ActivityShop> activityShopList) {
		this.activityShopList = activityShopList;
	}

	public ActivityStat getActivityStat() {
		return this.activityStat;
	}
	public void setActivityStat(ActivityStat activityStat) {
		this.activityStat = activityStat;
	}

	public String getActivityStatus() {
		return this.activityStatus;
	}
	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFulfilDimension() {
		return this.fulfilDimension;
	}
	public void setFulfilDimension(String fulfilDimension) {
		this.fulfilDimension = fulfilDimension;
	}

	public String getInvokeAppId() {
		return this.invokeAppId;
	}
	public void setInvokeAppId(String invokeAppId) {
		this.invokeAppId = invokeAppId;
	}

	public String getOutActivityNo() {
		return this.outActivityNo;
	}
	public void setOutActivityNo(String outActivityNo) {
		this.outActivityNo = outActivityNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public String getRuleTypeDesc() {
		return this.ruleTypeDesc;
	}
	public void setRuleTypeDesc(String ruleTypeDesc) {
		this.ruleTypeDesc = ruleTypeDesc;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
