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
 * @since 1.0, 2018-10-25 15:24:13
 */
public class ZhimaMerchantActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5678233384147854225L;

	/**
	 * 活动名称，用于展示和区分活动
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
	 * 活动结束时间，标准时间格式：yyyy-MM-dd HH:mm:ss，活动结束时间不能早于当前时间。
	 */
	@ApiField("end_time")
	private Date endTime;

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

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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
