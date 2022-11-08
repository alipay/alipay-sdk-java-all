package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序收藏tips引导投放查询汇总数据
 *
 * @author auto create
 * @since 1.0, 2022-07-13 19:53:13
 */
public class AlipayOpenMiniTipsStatisticQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7248346961479159583L;

	/**
	 * 收藏引导投放活动ID，供查询收藏引导活动配置接口调用
，当以小程序维度查询数据（query_type为app）时delivery_id为空
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 查询截止日期，精度为天
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 查询类型，表示以当前维度进行数据聚合。
app：小程序维度；activity：活动维度；
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 查询开始日期，精度为天
	 */
	@ApiField("start_date")
	private String startDate;

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
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
