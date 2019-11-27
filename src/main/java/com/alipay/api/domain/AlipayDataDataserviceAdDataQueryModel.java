package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告投放数据查询
 *
 * @author auto create
 * @since 1.0, 2019-08-12 13:56:20
 */
public class AlipayDataDataserviceAdDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5374257317816972927L;

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
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 数据查询结束时间，默认为当前系统时间，查询时间间隔不能大于30天，时间格式：yyyyMMddHH
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 外部平台导入广告库后，广告投放层级的对应的外部资源ID列表
	 */
	@ApiListField("outer_id_list")
	@ApiField("string")
	private List<String> outerIdList;

	/**
	 * 数据查询类型，默认为SUM，如SUM-按条件汇总；DETAIL-天/小时数据详情
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 数据查询开始时间，默认为当天00点，查询时间间隔不能大于30天，点时间格式：yyyyMMddHH
	 */
	@ApiField("start_date")
	private String startDate;

	public String getAdLevel() {
		return this.adLevel;
	}
	public void setAdLevel(String adLevel) {
		this.adLevel = adLevel;
	}

	public String getAggregationType() {
		return this.aggregationType;
	}
	public void setAggregationType(String aggregationType) {
		this.aggregationType = aggregationType;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<String> getOuterIdList() {
		return this.outerIdList;
	}
	public void setOuterIdList(List<String> outerIdList) {
		this.outerIdList = outerIdList;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
