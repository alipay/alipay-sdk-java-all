package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询结果数据列表
 *
 * @author auto create
 * @since 1.0, 2024-04-15 15:30:16
 */
public class AdReportDataDetail extends AlipayObject {

	private static final long serialVersionUID = 2538367445998464371L;

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
	 * 创意名称
	 */
	@ApiField("creative_name")
	private String creativeName;

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
	 * 投放产品名称
	 */
	@ApiField("scene_name")
	private String sceneName;

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

	public String getCreativeName() {
		return this.creativeName;
	}
	public void setCreativeName(String creativeName) {
		this.creativeName = creativeName;
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

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

}
