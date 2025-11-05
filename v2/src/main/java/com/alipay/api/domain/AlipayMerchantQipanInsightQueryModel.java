package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 棋盘开放-人群洞察分析
 *
 * @author auto create
 * @since 1.0, 2023-05-16 13:56:45
 */
public class AlipayMerchantQipanInsightQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8727144332895376941L;

	/**
	 * 人群id，按人群分析时必传
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/**
	 * 商家按需选择传入的洞察维度，但该接口不包含常住省市的数据。如需查询常住省市，使用alipay.merchant.qipan.insightcity.query接口
	 */
	@ApiListField("portr_type_list")
	@ApiField("string")
	private List<String> portrTypeList;

	/**
	 * 用户关系类型，不传人群id时必传。如果人群id不为空，优先查询人群id对应的画像。
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * 数据日期，格式为yyyyMMdd
	 */
	@ApiField("report_date")
	private String reportDate;

	public String getCrowdId() {
		return this.crowdId;
	}
	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

	public List<String> getPortrTypeList() {
		return this.portrTypeList;
	}
	public void setPortrTypeList(List<String> portrTypeList) {
		this.portrTypeList = portrTypeList;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
