package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告投放数据查询
 *
 * @author auto create
 * @since 1.0, 2020-02-28 21:14:36
 */
public class AlipayDataDataserviceAdDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3359985542581788786L;

	/**
	 * 汇总数据广告层级类型，如PLAN-计划；GROUP-单元；CREATIVE-创意；USER-用户
	 */
	@ApiField("ad_level")
	private String adLevel;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 当ad_level='USER'，该入参必填，
计费方式：
CPC-按点击付费
CPM-按展示次数付费
CPD-按投放天数计费（包段）
CPA-按转化效果计费
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 数据查询开始时间，查询时间间隔不能大于30天，点时间格式：yyyyMMdd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 外部平台导入广告库后，广告投放层级的对应的外部资源ID、商户PID，list最大长度为1000
	 */
	@ApiListField("outer_id_list")
	@ApiField("string")
	private List<String> outerIdList;

	/**
	 * 数据查询类型，默认为ALL_SUM，如GROUP_SUM-日期范围内outer_id_list中根据id group by后进行数据求和；ALL_SUM-日期范围内outer_id_list中所有数据求和；DETAIL-数据详情
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 数据查询开始时间，查询时间间隔不能大于30天，点时间格式：yyyyMMdd
	 */
	@ApiField("start_date")
	private String startDate;

	public String getAdLevel() {
		return this.adLevel;
	}
	public void setAdLevel(String adLevel) {
		this.adLevel = adLevel;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
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
