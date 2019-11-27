package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DataDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 15:52:39
 */
public class AlipayDataDataserviceAdDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4199618581527294571L;

	/** 
	 * 汇总数据广告层级类型，如PLAN-计划；GROUP-单元；CREATIVE-创意
	 */
	@ApiField("ad_level")
	private String adLevel;

	/** 
	 * 数据聚合类型，默认按天聚合汇总，HOUR-小时；DAY-天
	 */
	@ApiField("aggregation_type")
	private String aggregationType;

	/** 
	 * 汇总结果数据列表
	 */
	@ApiListField("data_list")
	@ApiField("data_detail")
	private List<DataDetail> dataList;

	/** 
	 * 数据查询结束时间，默认为当前系统时间，时间格式：yyyyMMddHH
	 */
	@ApiField("end_date")
	private String endDate;

	/** 
	 * 数据查询类型，默认为SUM，如SUM-按条件汇总；DETAIL-天/小时数据详情
	 */
	@ApiField("query_type")
	private String queryType;

	/** 
	 * 数据查询开始时间，默认为当天00点，点时间格式：yyyyMMddHH
	 */
	@ApiField("start_date")
	private String startDate;

	public void setAdLevel(String adLevel) {
		this.adLevel = adLevel;
	}
	public String getAdLevel( ) {
		return this.adLevel;
	}

	public void setAggregationType(String aggregationType) {
		this.aggregationType = aggregationType;
	}
	public String getAggregationType( ) {
		return this.aggregationType;
	}

	public void setDataList(List<DataDetail> dataList) {
		this.dataList = dataList;
	}
	public List<DataDetail> getDataList( ) {
		return this.dataList;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate( ) {
		return this.endDate;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}
	public String getQueryType( ) {
		return this.queryType;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate( ) {
		return this.startDate;
	}

}
