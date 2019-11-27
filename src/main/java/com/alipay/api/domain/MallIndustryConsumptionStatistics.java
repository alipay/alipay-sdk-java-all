package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * MALL行业消费能力
 *
 * @author auto create
 * @since 1.0, 2016-09-01 13:14:46
 */
public class MallIndustryConsumptionStatistics extends AlipayObject {

	private static final long serialVersionUID = 2785467547265645988L;

	/**
	 * 业务日期
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 最近30天天消费能力[0,50)人数总和(去重)
	 */
	@ApiField("recent_30d_consume_0_50_cnt")
	private String recent30dConsume050Cnt;

	/**
	 * 最近30天天消费能力[100,300)人数总和(去重)
	 */
	@ApiField("recent_30d_consume_100_300_cnt")
	private String recent30dConsume100300Cnt;

	/**
	 * 最近30天天消费能力[300,500)人数总和(去重)
	 */
	@ApiField("recent_30d_consume_300_500_cnt")
	private String recent30dConsume300500Cnt;

	/**
	 * 最近30天天消费能力[500,1000)人数总和(去重)
	 */
	@ApiField("recent_30d_consume_500_1000_cnt")
	private String recent30dConsume5001000Cnt;

	/**
	 * 最近30天天消费能力[50,100)人数总和(去重)
	 */
	@ApiField("recent_30d_consume_50_100_cnt")
	private String recent30dConsume50100Cnt;

	/**
	 * 最近30天天消费能力[1000,)人数总和(去重)
	 */
	@ApiField("recent_30d_consume_ge_1000_cnt")
	private String recent30dConsumeGe1000Cnt;

	/**
	 * 最近30天消费人数总和(去重)
	 */
	@ApiField("recent_30d_consume_total_cnt")
	private String recent30dConsumeTotalCnt;

	/**
	 * 最近7天天消费能力[0,50)人数总和(去重)
	 */
	@ApiField("recent_7d_consume_0_50_cnt")
	private String recent7dConsume050Cnt;

	/**
	 * 最近7天天消费能力[100,300)人数总和(去重)
	 */
	@ApiField("recent_7d_consume_100_300_cnt")
	private String recent7dConsume100300Cnt;

	/**
	 * 最近7天天消费能力[300,500)人数总和(去重)
	 */
	@ApiField("recent_7d_consume_300_500_cnt")
	private String recent7dConsume300500Cnt;

	/**
	 * 最近7天天消费能力[500,1000)人数总和(去重)
	 */
	@ApiField("recent_7d_consume_500_1000_cnt")
	private String recent7dConsume5001000Cnt;

	/**
	 * 最近7天天消费能力[50,100)人数总和(去重)
	 */
	@ApiField("recent_7d_consume_50_100_cnt")
	private String recent7dConsume50100Cnt;

	/**
	 * 最近7天天消费能力[1000,)人数总和(去重)
	 */
	@ApiField("recent_7d_consume_ge_1000_cnt")
	private String recent7dConsumeGe1000Cnt;

	/**
	 * 最近7天消费人数总和(去重)
	 */
	@ApiField("recent_7d_consume_total_cnt")
	private String recent7dConsumeTotalCnt;

	/**
	 * 最近90天天消费能力[0,50)人数总和(去重)
	 */
	@ApiField("recent_90d_consume_0_50_cnt")
	private String recent90dConsume050Cnt;

	/**
	 * 最近90天天消费能力[100,300)人数总和(去重)
	 */
	@ApiField("recent_90d_consume_100_300_cnt")
	private String recent90dConsume100300Cnt;

	/**
	 * 最近90天天消费能力[300,500)人数总和(去重)
	 */
	@ApiField("recent_90d_consume_300_500_cnt")
	private String recent90dConsume300500Cnt;

	/**
	 * 最近90天天消费能力[500,1000)人数总和(去重)
	 */
	@ApiField("recent_90d_consume_500_1000_cnt")
	private String recent90dConsume5001000Cnt;

	/**
	 * 最近90天天消费能力[50,100)人数总和(去重)
	 */
	@ApiField("recent_90d_consume_50_100_cnt")
	private String recent90dConsume50100Cnt;

	/**
	 * 最近90天天消费能力[1000,)人数总和(去重)
	 */
	@ApiField("recent_90d_consume_ge_1000_cnt")
	private String recent90dConsumeGe1000Cnt;

	/**
	 * 最近90天消费人数总和(去重)
	 */
	@ApiField("recent_90d_consume_total_cnt")
	private String recent90dConsumeTotalCnt;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getRecent30dConsume050Cnt() {
		return this.recent30dConsume050Cnt;
	}
	public void setRecent30dConsume050Cnt(String recent30dConsume050Cnt) {
		this.recent30dConsume050Cnt = recent30dConsume050Cnt;
	}

	public String getRecent30dConsume100300Cnt() {
		return this.recent30dConsume100300Cnt;
	}
	public void setRecent30dConsume100300Cnt(String recent30dConsume100300Cnt) {
		this.recent30dConsume100300Cnt = recent30dConsume100300Cnt;
	}

	public String getRecent30dConsume300500Cnt() {
		return this.recent30dConsume300500Cnt;
	}
	public void setRecent30dConsume300500Cnt(String recent30dConsume300500Cnt) {
		this.recent30dConsume300500Cnt = recent30dConsume300500Cnt;
	}

	public String getRecent30dConsume5001000Cnt() {
		return this.recent30dConsume5001000Cnt;
	}
	public void setRecent30dConsume5001000Cnt(String recent30dConsume5001000Cnt) {
		this.recent30dConsume5001000Cnt = recent30dConsume5001000Cnt;
	}

	public String getRecent30dConsume50100Cnt() {
		return this.recent30dConsume50100Cnt;
	}
	public void setRecent30dConsume50100Cnt(String recent30dConsume50100Cnt) {
		this.recent30dConsume50100Cnt = recent30dConsume50100Cnt;
	}

	public String getRecent30dConsumeGe1000Cnt() {
		return this.recent30dConsumeGe1000Cnt;
	}
	public void setRecent30dConsumeGe1000Cnt(String recent30dConsumeGe1000Cnt) {
		this.recent30dConsumeGe1000Cnt = recent30dConsumeGe1000Cnt;
	}

	public String getRecent30dConsumeTotalCnt() {
		return this.recent30dConsumeTotalCnt;
	}
	public void setRecent30dConsumeTotalCnt(String recent30dConsumeTotalCnt) {
		this.recent30dConsumeTotalCnt = recent30dConsumeTotalCnt;
	}

	public String getRecent7dConsume050Cnt() {
		return this.recent7dConsume050Cnt;
	}
	public void setRecent7dConsume050Cnt(String recent7dConsume050Cnt) {
		this.recent7dConsume050Cnt = recent7dConsume050Cnt;
	}

	public String getRecent7dConsume100300Cnt() {
		return this.recent7dConsume100300Cnt;
	}
	public void setRecent7dConsume100300Cnt(String recent7dConsume100300Cnt) {
		this.recent7dConsume100300Cnt = recent7dConsume100300Cnt;
	}

	public String getRecent7dConsume300500Cnt() {
		return this.recent7dConsume300500Cnt;
	}
	public void setRecent7dConsume300500Cnt(String recent7dConsume300500Cnt) {
		this.recent7dConsume300500Cnt = recent7dConsume300500Cnt;
	}

	public String getRecent7dConsume5001000Cnt() {
		return this.recent7dConsume5001000Cnt;
	}
	public void setRecent7dConsume5001000Cnt(String recent7dConsume5001000Cnt) {
		this.recent7dConsume5001000Cnt = recent7dConsume5001000Cnt;
	}

	public String getRecent7dConsume50100Cnt() {
		return this.recent7dConsume50100Cnt;
	}
	public void setRecent7dConsume50100Cnt(String recent7dConsume50100Cnt) {
		this.recent7dConsume50100Cnt = recent7dConsume50100Cnt;
	}

	public String getRecent7dConsumeGe1000Cnt() {
		return this.recent7dConsumeGe1000Cnt;
	}
	public void setRecent7dConsumeGe1000Cnt(String recent7dConsumeGe1000Cnt) {
		this.recent7dConsumeGe1000Cnt = recent7dConsumeGe1000Cnt;
	}

	public String getRecent7dConsumeTotalCnt() {
		return this.recent7dConsumeTotalCnt;
	}
	public void setRecent7dConsumeTotalCnt(String recent7dConsumeTotalCnt) {
		this.recent7dConsumeTotalCnt = recent7dConsumeTotalCnt;
	}

	public String getRecent90dConsume050Cnt() {
		return this.recent90dConsume050Cnt;
	}
	public void setRecent90dConsume050Cnt(String recent90dConsume050Cnt) {
		this.recent90dConsume050Cnt = recent90dConsume050Cnt;
	}

	public String getRecent90dConsume100300Cnt() {
		return this.recent90dConsume100300Cnt;
	}
	public void setRecent90dConsume100300Cnt(String recent90dConsume100300Cnt) {
		this.recent90dConsume100300Cnt = recent90dConsume100300Cnt;
	}

	public String getRecent90dConsume300500Cnt() {
		return this.recent90dConsume300500Cnt;
	}
	public void setRecent90dConsume300500Cnt(String recent90dConsume300500Cnt) {
		this.recent90dConsume300500Cnt = recent90dConsume300500Cnt;
	}

	public String getRecent90dConsume5001000Cnt() {
		return this.recent90dConsume5001000Cnt;
	}
	public void setRecent90dConsume5001000Cnt(String recent90dConsume5001000Cnt) {
		this.recent90dConsume5001000Cnt = recent90dConsume5001000Cnt;
	}

	public String getRecent90dConsume50100Cnt() {
		return this.recent90dConsume50100Cnt;
	}
	public void setRecent90dConsume50100Cnt(String recent90dConsume50100Cnt) {
		this.recent90dConsume50100Cnt = recent90dConsume50100Cnt;
	}

	public String getRecent90dConsumeGe1000Cnt() {
		return this.recent90dConsumeGe1000Cnt;
	}
	public void setRecent90dConsumeGe1000Cnt(String recent90dConsumeGe1000Cnt) {
		this.recent90dConsumeGe1000Cnt = recent90dConsumeGe1000Cnt;
	}

	public String getRecent90dConsumeTotalCnt() {
		return this.recent90dConsumeTotalCnt;
	}
	public void setRecent90dConsumeTotalCnt(String recent90dConsumeTotalCnt) {
		this.recent90dConsumeTotalCnt = recent90dConsumeTotalCnt;
	}

}
