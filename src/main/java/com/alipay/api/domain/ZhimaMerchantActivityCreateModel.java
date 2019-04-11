package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻信用承诺消费活动创建
 *
 * @author auto create
 * @since 1.0, 2018-11-22 22:02:26
 */
public class ZhimaMerchantActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3817465665562175887L;

	/**
	 * 活动名称，用于展示和区分活动，最大长度30
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 芝麻信用承诺消费活动规则详情
	 */
	@ApiField("activity_rule_detail")
	private ActivityRuleDetail activityRuleDetail;

	/**
	 * 活动门店列表信息
	 */
	@ApiListField("activity_shops")
	@ApiField("activity_shop")
	private List<ActivityShop> activityShops;

	/**
	 * 活动品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 芝麻信用授权评估所需类目, 支持如下类目：
LAUNDRY - 洗衣
PARENT_CHILD - 亲子
PHOTOGRAPHY - 摄影
MARRY - 结婚
PET - 宠物
WORK_OUT - 运动健身
BEAUTY - 美发/美容/美甲
ENTERTAINMENT - 休闲娱乐
KTV - K歌
SUPERMARKET - 超市便利店
BOOKSTORE - 书店
SKILLS_TRAINING - 技能培训
SHOPPING - 购物
CAR - 爱车
DOMESTIC_SERVICES - 生活服务
SHOPPING_MALL - 商圈综合体
MEDICAL_HEALTH - 医疗健康
TRAVEL - 航旅
SALES - 专业销售/批发
SOCIAL_ORGANIZATION - 政府/社会组织
MOVIE - 电影
FOOD - 美食
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 活动结束时间，标准时间格式：yyyy-MM-dd HH:mm:ss，活动结束时间不能早于当前时间。
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
	 * 商户外部活动号。需确保同一个商户Id下外部活动号唯一。
	 */
	@ApiField("out_activity_no")
	private String outActivityNo;

	/**
	 * 商户优惠退回账户，必须是商户的实名认证的支付宝账号，未实名认证会拦截。
	 */
	@ApiField("payback_account")
	private String paybackAccount;

	/**
	 * 活动规则类型，必须在如下枚举内："CONSUME_AMOUNT"为"消费金额";"CONSUME_TIMES"为"消费次数"。
	 */
	@ApiField("rule_type")
	private String ruleType;

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

	public ActivityRuleDetail getActivityRuleDetail() {
		return this.activityRuleDetail;
	}
	public void setActivityRuleDetail(ActivityRuleDetail activityRuleDetail) {
		this.activityRuleDetail = activityRuleDetail;
	}

	public List<ActivityShop> getActivityShops() {
		return this.activityShops;
	}
	public void setActivityShops(List<ActivityShop> activityShops) {
		this.activityShops = activityShops;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
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

	public String getOutActivityNo() {
		return this.outActivityNo;
	}
	public void setOutActivityNo(String outActivityNo) {
		this.outActivityNo = outActivityNo;
	}

	public String getPaybackAccount() {
		return this.paybackAccount;
	}
	public void setPaybackAccount(String paybackAccount) {
		this.paybackAccount = paybackAccount;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
