package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-23 09:53:00
 */
public class AdReportProductDataDetail extends AlipayObject {

	private static final long serialVersionUID = 3665499199878159864L;

	/**
	 * 消耗/转化量(单位:元)
	 */
	@ApiField("avg_conv_cost")
	private String avgConvCost;

	/**
	 * 当query_type=DETAIL时数据汇总时间格式yyyyMMdd；query_type=HOUR时数据汇总时间格式yyyy-MM-dd HH:mm:ss；当按ALL_SUM时该出参非必填
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 广告被点击的总次数
	 */
	@ApiField("click")
	private Long click;

	/**
	 * 点击量/展示量(单位:百分比)
	 */
	@ApiField("click_rate")
	private String clickRate;

	/**
	 * 单元配置的主转化汇总
	 */
	@ApiField("conv_result")
	private String convResult;

	/**
	 * null
	 */
	@ApiListField("conversion_data_list")
	@ApiField("ad_report_conversion_data_detail")
	private List<AdReportConversionDataDetail> conversionDataList;

	/**
	 * 消耗金额(单位:分)
	 */
	@ApiField("cost")
	private Long cost;

	/**
	 * 消耗金额(单位:元), 当无投放未产生消费数据时，查询数据为空。
	 */
	@ApiField("cost_format")
	private String costFormat;

	/**
	 * 每次点击的平均价格(单位:元)
	 */
	@ApiField("cpc")
	private String cpc;

	/**
	 * 千次展示的平均价格(单位:元)。
	 */
	@ApiField("cpm")
	private String cpm;

	/**
	 * 创意ID
	 */
	@ApiField("creative_id")
	private String creativeId;

	/**
	 * 创意名称
	 */
	@ApiField("creative_name")
	private String creativeName;

	/**
	 * 转化量/点击量(单位:百分比)
	 */
	@ApiField("cvr")
	private String cvr;

	/**
	 * 商品库ID
	 */
	@ApiField("entity_library_id")
	private String entityLibraryId;

	/**
	 * 商品名称
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 广告投放平台生成的商品ID
	 */
	@ApiField("entity_no")
	private String entityNo;

	/**
	 * 商品外部ID
	 */
	@ApiField("entity_out_id")
	private String entityOutId;

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
	 * 广告被展现的总次数
	 */
	@ApiField("impression")
	private Long impression;

	/**
	 * 营销目标名称
	 */
	@ApiField("market_target_name")
	private String marketTargetName;

	/**
	 * 计划ID
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
	 * 商家ID
	 */
	@ApiField("principal_id")
	private String principalId;

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

	public String getCreativeId() {
		return this.creativeId;
	}
	public void setCreativeId(String creativeId) {
		this.creativeId = creativeId;
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

	public String getEntityLibraryId() {
		return this.entityLibraryId;
	}
	public void setEntityLibraryId(String entityLibraryId) {
		this.entityLibraryId = entityLibraryId;
	}

	public String getEntityName() {
		return this.entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getEntityNo() {
		return this.entityNo;
	}
	public void setEntityNo(String entityNo) {
		this.entityNo = entityNo;
	}

	public String getEntityOutId() {
		return this.entityOutId;
	}
	public void setEntityOutId(String entityOutId) {
		this.entityOutId = entityOutId;
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

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
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

}
