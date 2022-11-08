package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.tips.statistic.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-14 16:36:47
 */
public class AlipayOpenMiniTipsStatisticQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1473887562311811577L;

	/** 
	 * 昨日（接口调用当日的前一天）小程序收藏人数，时间内未创建投放活动，则响应时不传出参数。
	 */
	@ApiField("app_collect_cnt")
	private Long appCollectCnt;

	/** 
	 * 昨日（接口调用当日的前一天）小程序访问人数。当小程序日访问量为0，或以活动维度查询，或时间内未创建投放活动，则响应时不传出参数。
	 */
	@ApiField("app_uv")
	private Long appUv;

	/** 
	 * 收藏文案内容（仅以app维度查询时为空）,仅活动维度查询成功时返回。
	 */
	@ApiField("delivery_content")
	private String deliveryContent;

	/** 
	 * 收藏引导投放活动ID（仅以app维度查询时为空）,仅活动维度查询成功时返回。
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/** 
	 * 昨日（接口调用当日的前一天）收藏引导文案收藏转化率，数据为小数字符串类型，取小数点后两位，单位为百分比。小程序曝光数为0，或时间内未创建投放活动，则响应时不传出参数。
	 */
	@ApiField("tips_collect_rate")
	private String tipsCollectRate;

	/** 
	 * 昨日（接口调用当日的前一天）收藏引导文案收藏用户数，时间内未创建投放活动，则响应时不传出参数。
	 */
	@ApiField("tips_collect_uv")
	private Long tipsCollectUv;

	/** 
	 * 昨日（接口调用当日的前一天）收藏引导文案曝光用户数，时间内未创建投放活动，则响应时不传出参数。
	 */
	@ApiField("tips_expo_uv")
	private Long tipsExpoUv;

	/** 
	 * 时间段内累计小程序收藏人数，时间内未创建投放活动，则响应时不传出参数。
	 */
	@ApiField("total_app_collect_cnt")
	private Long totalAppCollectCnt;

	/** 
	 * 时间段内累计小程序访问人数。当小程序日访问量为0，或以活动维度查询，或时间内未创建投放活动，则响应时不传出参数。
	 */
	@ApiField("total_app_uv")
	private Long totalAppUv;

	/** 
	 * 时间段内收藏引导文案收藏转化率，数据为小数字符串类型，取小数点后两位，单位为百分比。小程序曝光数为0，或时间内未创建投放活动，则响应时不传出参数。
	 */
	@ApiField("total_tips_collect_rate")
	private String totalTipsCollectRate;

	/** 
	 * 时间段内累计收藏引导文案收藏用户数，时间内未创建投放活动，则响应时不传出参数。
	 */
	@ApiField("total_tips_collect_uv")
	private Long totalTipsCollectUv;

	/** 
	 * 时间段内累计收藏引导文案曝光用户数，仅当小程序/活动投放活动时返回。时间内未创建投放活动，则响应时不传出参数。
	 */
	@ApiField("total_tips_expo_uv")
	private Long totalTipsExpoUv;

	public void setAppCollectCnt(Long appCollectCnt) {
		this.appCollectCnt = appCollectCnt;
	}
	public Long getAppCollectCnt( ) {
		return this.appCollectCnt;
	}

	public void setAppUv(Long appUv) {
		this.appUv = appUv;
	}
	public Long getAppUv( ) {
		return this.appUv;
	}

	public void setDeliveryContent(String deliveryContent) {
		this.deliveryContent = deliveryContent;
	}
	public String getDeliveryContent( ) {
		return this.deliveryContent;
	}

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryId( ) {
		return this.deliveryId;
	}

	public void setTipsCollectRate(String tipsCollectRate) {
		this.tipsCollectRate = tipsCollectRate;
	}
	public String getTipsCollectRate( ) {
		return this.tipsCollectRate;
	}

	public void setTipsCollectUv(Long tipsCollectUv) {
		this.tipsCollectUv = tipsCollectUv;
	}
	public Long getTipsCollectUv( ) {
		return this.tipsCollectUv;
	}

	public void setTipsExpoUv(Long tipsExpoUv) {
		this.tipsExpoUv = tipsExpoUv;
	}
	public Long getTipsExpoUv( ) {
		return this.tipsExpoUv;
	}

	public void setTotalAppCollectCnt(Long totalAppCollectCnt) {
		this.totalAppCollectCnt = totalAppCollectCnt;
	}
	public Long getTotalAppCollectCnt( ) {
		return this.totalAppCollectCnt;
	}

	public void setTotalAppUv(Long totalAppUv) {
		this.totalAppUv = totalAppUv;
	}
	public Long getTotalAppUv( ) {
		return this.totalAppUv;
	}

	public void setTotalTipsCollectRate(String totalTipsCollectRate) {
		this.totalTipsCollectRate = totalTipsCollectRate;
	}
	public String getTotalTipsCollectRate( ) {
		return this.totalTipsCollectRate;
	}

	public void setTotalTipsCollectUv(Long totalTipsCollectUv) {
		this.totalTipsCollectUv = totalTipsCollectUv;
	}
	public Long getTotalTipsCollectUv( ) {
		return this.totalTipsCollectUv;
	}

	public void setTotalTipsExpoUv(Long totalTipsExpoUv) {
		this.totalTipsExpoUv = totalTipsExpoUv;
	}
	public Long getTotalTipsExpoUv( ) {
		return this.totalTipsExpoUv;
	}

}
