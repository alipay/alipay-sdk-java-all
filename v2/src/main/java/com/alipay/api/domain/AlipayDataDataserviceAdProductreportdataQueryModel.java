package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品分析数据查询
 *
 * @author auto create
 * @since 1.0, 2026-10-23 09:53:00
 */
public class AlipayDataDataserviceAdProductreportdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6534542154915264857L;

	/**
	 * 数据维度x商品，为空时接口返回单商品维度数据。
	 */
	@ApiField("ad_level")
	private String adLevel;

	/**
	 * null
	 */
	@ApiListField("conv_code_list")
	@ApiField("string")
	private List<String> convCodeList;

	/**
	 * 转化时间归因：将广告带来的转化数据统计到广告转化发生（或广告转化回传）时间； 计费时间归因：将广告带来的转化数据统计到广告计费对应的事件（点击或曝光）发生时间; 【默认转化时间归因】
	 */
	@ApiField("conv_time_join_rule")
	private String convTimeJoinRule;

	/**
	 * null
	 */
	@ApiListField("creative_id_list")
	@ApiField("string")
	private List<String> creativeIdList;

	/**
	 * 分页查询的页码从1开始。
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 数据查询结束时间；汇总和分天查询时间范围不能大于7天，分时查询为1天；时间格式：yyyyMMdd【最大时间-最小时间<=7时间左闭右闭】
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 商品分析报表类型
	 */
	@ApiField("entity_data_type")
	private String entityDataType;

	/**
	 * null
	 */
	@ApiListField("entity_library_id_list")
	@ApiField("string")
	private List<String> entityLibraryIdList;

	/**
	 * null
	 */
	@ApiListField("entity_no_list")
	@ApiField("string")
	private List<String> entityNoList;

	/**
	 * null
	 */
	@ApiListField("group_id_list")
	@ApiField("string")
	private List<String> groupIdList;

	/**
	 * 分页查询时每页返回数据条数，按明细汇总时按时间倒序。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * null
	 */
	@ApiListField("plan_id_list")
	@ApiField("string")
	private List<String> planIdList;

	/**
	 * 商家标识,在广告投放平台获取。
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 数据汇总方式：汇总/明细分天/明细分小时。
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 接口出参是否透出转化指标数据，默认true。
	 */
	@ApiField("show_conv_data")
	private Boolean showConvData;

	/**
	 * 数据查询开始时间；汇总和分天查询时间范围不能大于7天,分时为1天；时间格式：yyyyMMdd
	 */
	@ApiField("start_date")
	private String startDate;

	public String getAdLevel() {
		return this.adLevel;
	}
	public void setAdLevel(String adLevel) {
		this.adLevel = adLevel;
	}

	public List<String> getConvCodeList() {
		return this.convCodeList;
	}
	public void setConvCodeList(List<String> convCodeList) {
		this.convCodeList = convCodeList;
	}

	public String getConvTimeJoinRule() {
		return this.convTimeJoinRule;
	}
	public void setConvTimeJoinRule(String convTimeJoinRule) {
		this.convTimeJoinRule = convTimeJoinRule;
	}

	public List<String> getCreativeIdList() {
		return this.creativeIdList;
	}
	public void setCreativeIdList(List<String> creativeIdList) {
		this.creativeIdList = creativeIdList;
	}

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEntityDataType() {
		return this.entityDataType;
	}
	public void setEntityDataType(String entityDataType) {
		this.entityDataType = entityDataType;
	}

	public List<String> getEntityLibraryIdList() {
		return this.entityLibraryIdList;
	}
	public void setEntityLibraryIdList(List<String> entityLibraryIdList) {
		this.entityLibraryIdList = entityLibraryIdList;
	}

	public List<String> getEntityNoList() {
		return this.entityNoList;
	}
	public void setEntityNoList(List<String> entityNoList) {
		this.entityNoList = entityNoList;
	}

	public List<String> getGroupIdList() {
		return this.groupIdList;
	}
	public void setGroupIdList(List<String> groupIdList) {
		this.groupIdList = groupIdList;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getPlanIdList() {
		return this.planIdList;
	}
	public void setPlanIdList(List<String> planIdList) {
		this.planIdList = planIdList;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public Boolean getShowConvData() {
		return this.showConvData;
	}
	public void setShowConvData(Boolean showConvData) {
		this.showConvData = showConvData;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
