package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告投放实时汇总数据
 *
 * @author auto create
 * @since 1.0, 2020-02-28 21:14:36
 */
public class DataDetail extends AlipayObject {

	private static final long serialVersionUID = 2582146816411496418L;

	/**
	 * 数据汇总时间，格式：yyyyMMdd
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 点击量
	 */
	@ApiField("click")
	private Long click;

	/**
	 * 投放转化数据
	 */
	@ApiListField("conversion_data_list")
	@ApiField("conversion_data_detail")
	private List<ConversionDataDetail> conversionDataList;

	/**
	 * 消费，单元：分
	 */
	@ApiField("cost")
	private Long cost;

	/**
	 * 展现量
	 */
	@ApiField("impression")
	private Long impression;

	/**
	 * 外部平台导入广告库后，广告投放对应的外部资源ID
	 */
	@ApiField("outer_id")
	private String outerId;

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

	public List<ConversionDataDetail> getConversionDataList() {
		return this.conversionDataList;
	}
	public void setConversionDataList(List<ConversionDataDetail> conversionDataList) {
		this.conversionDataList = conversionDataList;
	}

	public Long getCost() {
		return this.cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}

	public Long getImpression() {
		return this.impression;
	}
	public void setImpression(Long impression) {
		this.impression = impression;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

}
