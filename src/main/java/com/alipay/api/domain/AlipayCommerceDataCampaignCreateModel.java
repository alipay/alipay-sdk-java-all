package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集点活动配置接口
 *
 * @author auto create
 * @since 1.0, 2021-01-07 16:33:57
 */
public class AlipayCommerceDataCampaignCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6852993455432626635L;

	/**
	 * 集点活动任务完成时用户得到的集点奖品名称，用于在服务提醒消息中进行展示
	 */
	@ApiField("award_name")
	private String awardName;

	/**
	 * 集点活动结束时间。取值精确至秒，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 集点活动配置业务扩展字段，json格式。具体值需要和支付宝约定，请查看集点营销集成文档中说明。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 集点活动限制菜品名称，针对部分集点活动与具体菜品有关，用于在服务提醒中进行展示
	 */
	@ApiField("limit_product")
	private String limitProduct;

	/**
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 合作者身份ID（PID）是商户与支付宝签约后，商户获得的支付宝商户唯一识别码。当商户把支付宝功能接入商户网站时会用到PID，以便让支付宝认证商户
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 集点活动中里程碑信息，json数组格式，其中：milestone_total_num:小里程碑目标次数，milestone_award:小里程碑奖品名称。小里程碑目标次数需要小于集点任务目标次数； 如果传入小里程碑奖品名称时，小里程碑目标次数必传。
	 */
	@ApiField("milestone_list")
	private String milestoneList;

	/**
	 * 集点任务目标次数，即当前商户集点活动的任务目标次数
	 */
	@ApiField("periodic_total_num")
	private String periodicTotalNum;

	/**
	 * 商家集点活动的集点单位，长度固定1
	 */
	@ApiField("push_unit")
	private String pushUnit;

	/**
	 * 集点活动展示变量，即被push_unit量词修饰的实体，用于在集点通知服务提醒中进行展示。
	 */
	@ApiField("push_unit_name")
	private String pushUnitName;

	/**
	 * 集点召回通知规则
	 */
	@ApiField("recall_rule")
	private CampaignExtInfo recallRule;

	/**
	 * 集点活动开始时间。取值精确至秒，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("start_time")
	private String startTime;

	public String getAwardName() {
		return this.awardName;
	}
	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getLimitProduct() {
		return this.limitProduct;
	}
	public void setLimitProduct(String limitProduct) {
		this.limitProduct = limitProduct;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getMilestoneList() {
		return this.milestoneList;
	}
	public void setMilestoneList(String milestoneList) {
		this.milestoneList = milestoneList;
	}

	public String getPeriodicTotalNum() {
		return this.periodicTotalNum;
	}
	public void setPeriodicTotalNum(String periodicTotalNum) {
		this.periodicTotalNum = periodicTotalNum;
	}

	public String getPushUnit() {
		return this.pushUnit;
	}
	public void setPushUnit(String pushUnit) {
		this.pushUnit = pushUnit;
	}

	public String getPushUnitName() {
		return this.pushUnitName;
	}
	public void setPushUnitName(String pushUnitName) {
		this.pushUnitName = pushUnitName;
	}

	public CampaignExtInfo getRecallRule() {
		return this.recallRule;
	}
	public void setRecallRule(CampaignExtInfo recallRule) {
		this.recallRule = recallRule;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
