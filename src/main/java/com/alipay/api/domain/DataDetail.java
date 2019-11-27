package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告投放小时/天维度汇总数据
 *
 * @author auto create
 * @since 1.0, 2019-08-12 19:24:20
 */
public class DataDetail extends AlipayObject {

	private static final long serialVersionUID = 8545176768858124769L;

	/**
	 * 数据汇总时间，当入参query_type="SUM"时，该属性为空值，小时时间格式：yyyyMMddHH； 天时间格式：yyyyMMdd
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 点击量
	 */
	@ApiField("click")
	private Long click;

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
