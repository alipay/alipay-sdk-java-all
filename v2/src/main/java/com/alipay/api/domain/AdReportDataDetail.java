package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询结果数据列表
 *
 * @author auto create
 * @since 1.0, 2025-04-09 11:30:54
 */
public class AdReportDataDetail extends AlipayObject {

	private static final long serialVersionUID = 5249498471898574277L;

	/**
	 * 代理商账号(只在代理商接口返回)
	 */
	@ApiField("agent_alipay_account")
	private String agentAlipayAccount;

	/**
	 * 代理商名称(只在代理商接口返回)
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 广告主为每个转化所付出的平均成本(单位:元)，计算方式：总消耗/转化量
	 */
	@ApiField("avg_conv_cost")
	private String avgConvCost;

	/**
	 * 当query_type为DETAIL时数据汇总时间格式yyyyMMdd；当按ALL_SUM时该出参非必填
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 点击量，当无投放未产生点击数据时，查询数据为空
	 */
	@ApiField("click")
	private Long click;

	/**
	 * 广告被点击的次数占展示次数的百分比。计算方法：点击数/展示量*100
	 */
	@ApiField("click_rate")
	private String clickRate;

	/**
	 * 按转化事件发生时间统计的转化数
	 */
	@ApiField("conv_result")
	private String convResult;

	/**
	 * 投放转化数据，当无投放未产生转化数据或未绑定转化事件时，查询数据为空
	 */
	@ApiListField("conversion_data_list")
	@ApiField("ad_report_conversion_data_detail")
	private List<AdReportConversionDataDetail> conversionDataList;

	/**
	 * 消费金额，单位:分。当无投放未产生消费数据时，查询数据为空
	 */
	@ApiField("cost")
	private Long cost;

	/**
	 * 消费金额(单位:元)
	 */
	@ApiField("cost_format")
	private String costFormat;

	/**
	 * 广告主为每次点击付出的费用成本(单位:元)，计算公式是：总消耗/点击量
	 */
	@ApiField("cpc")
	private String cpc;

	/**
	 * 广告平均每一千次展现所付出的费用(单位:元)，计算公式是：总消耗/展示量*1000
	 */
	@ApiField("cpm")
	private String cpm;

	/**
	 * 创意名称
	 */
	@ApiField("creative_name")
	private String creativeName;

	/**
	 * 广告被用户转化的次数占点击次数的百分比。计算方式：转化量/点击量*100
	 */
	@ApiField("cvr")
	private String cvr;

	/**
	 * 根据ad_level不同会透出汇总数据的plan_id/group_id/creative_id/order_id
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 单元ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 单元名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 展现量，当无投放未产生展现数据时，查询数据为空
	 */
	@ApiField("impression")
	private Long impression;

	/**
	 * 营销目标名称
	 */
	@ApiField("market_target_name")
	private String marketTargetName;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单名称
	 */
	@ApiField("order_name")
	private String orderName;

	/**
	 * 计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 商家账户
	 */
	@ApiField("principal_alipay_account")
	private String principalAlipayAccount;

	/**
	 * 商家名称
	 */
	@ApiField("principal_name")
	private String principalName;

	/**
	 * 商家PID
	 */
	@ApiField("principal_pid")
	private String principalPid;

	/**
	 * 投放产品名称
	 */
	@ApiField("scene_name")
	private String sceneName;

	public String getAgentAlipayAccount() {
		return this.agentAlipayAccount;
	}
	public void setAgentAlipayAccount(String agentAlipayAccount) {
		this.agentAlipayAccount = agentAlipayAccount;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAvgConvCost() {
		return this.avgConvCost;
	}
	public void setAvgConvCost(String avgConvCost) {
		this.avgConvCost = avgConvCost;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public Long getClick() {
		return this.click;
	}
	public void setClick(Long click) {
		this.click = click;
	}

	public String getClickRate() {
		return this.clickRate;
	}
	public void setClickRate(String clickRate) {
		this.clickRate = clickRate;
	}

	public String getConvResult() {
		return this.convResult;
	}
	public void setConvResult(String convResult) {
		this.convResult = convResult;
	}

	public List<AdReportConversionDataDetail> getConversionDataList() {
		return this.conversionDataList;
	}
	public void setConversionDataList(List<AdReportConversionDataDetail> conversionDataList) {
		this.conversionDataList = conversionDataList;
	}

	public Long getCost() {
		return this.cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}

	public String getCostFormat() {
		return this.costFormat;
	}
	public void setCostFormat(String costFormat) {
		this.costFormat = costFormat;
	}

	public String getCpc() {
		return this.cpc;
	}
	public void setCpc(String cpc) {
		this.cpc = cpc;
	}

	public String getCpm() {
		return this.cpm;
	}
	public void setCpm(String cpm) {
		this.cpm = cpm;
	}

	public String getCreativeName() {
		return this.creativeName;
	}
	public void setCreativeName(String creativeName) {
		this.creativeName = creativeName;
	}

	public String getCvr() {
		return this.cvr;
	}
	public void setCvr(String cvr) {
		this.cvr = cvr;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Long getImpression() {
		return this.impression;
	}
	public void setImpression(Long impression) {
		this.impression = impression;
	}

	public String getMarketTargetName() {
		return this.marketTargetName;
	}
	public void setMarketTargetName(String marketTargetName) {
		this.marketTargetName = marketTargetName;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return this.orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPrincipalAlipayAccount() {
		return this.principalAlipayAccount;
	}
	public void setPrincipalAlipayAccount(String principalAlipayAccount) {
		this.principalAlipayAccount = principalAlipayAccount;
	}

	public String getPrincipalName() {
		return this.principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getPrincipalPid() {
		return this.principalPid;
	}
	public void setPrincipalPid(String principalPid) {
		this.principalPid = principalPid;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

}
