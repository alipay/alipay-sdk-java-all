package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询结果数据列表
 *
 * @author auto create
 * @since 1.0, 2023-10-26 10:07:52
 */
public class AdReportDataDetail extends AlipayObject {

	private static final long serialVersionUID = 6865378979138997772L;

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
	 * 根据ad_level不同会透出汇总数据的plan_id/group_id/creative_id/order_id
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 展现量，当无投放未产生展现数据时，查询数据为空
	 */
	@ApiField("impression")
	private Long impression;

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

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public Long getImpression() {
		return this.impression;
	}
	public void setImpression(Long impression) {
		this.impression = impression;
	}

}
