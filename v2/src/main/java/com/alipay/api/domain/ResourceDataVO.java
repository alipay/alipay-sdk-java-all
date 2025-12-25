package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量位数据视图
 *
 * @author auto create
 * @since 1.0, 2021-06-18 10:18:56
 */
public class ResourceDataVO extends AlipayObject {

	private static final long serialVersionUID = 5351743286941157984L;

	/**
	 * 人均访问停留时长（ms） 聚合天数为多天时，则为日均指标
	 */
	@ApiField("avg_stay_duration_per_user")
	private String avgStayDurationPerUser;

	/**
	 * 次均访问停留时长（ms) 聚合天数为多天时，则为日均指标
	 */
	@ApiField("avg_stay_duration_per_vst")
	private String avgStayDurationPerVst;

	/**
	 * 插件内容点击次数
	 */
	@ApiField("clk_cnt")
	private Long clkCnt;

	/**
	 * 插件内容点击去重用户数量
	 */
	@ApiField("clk_user_cnt")
	private Long clkUserCnt;

	/**
	 * 插件日分佣金额
	 */
	@ApiField("commission")
	private String commission;

	/**
	 * PV分佣额产值
	 */
	@ApiField("commission_per_pv")
	private String commissionPerPv;

	/**
	 * UV分佣额产值
	 */
	@ApiField("commission_per_uv")
	private String commissionPerUv;

	/**
	 * 插件内容曝光次数
	 */
	@ApiField("expo_cnt")
	private Long expoCnt;

	/**
	 * 插件内容曝光去重用户数量
	 */
	@ApiField("expo_user_cnt")
	private Long expoUserCnt;

	/**
	 * 成交金额
	 */
	@ApiField("order_gmv")
	private String orderGmv;

	/**
	 * 推广位名称
	 */
	@ApiField("origin_name")
	private String originName;

	/**
	 * 推广位ID1
	 */
	@ApiField("platform_promotion_id")
	private String platformPromotionId;

	/**
	 * 插件内容点击量转化率
	 */
	@ApiField("pv_rate")
	private String pvRate;

	/**
	 * 数据统计时间
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 插件日销售笔数
	 */
	@ApiField("trade_cnt")
	private String tradeCnt;

	/**
	 * PV销售额产值
	 */
	@ApiField("trade_gmv_per_pv")
	private String tradeGmvPerPv;

	/**
	 * UV销售额产值
	 */
	@ApiField("trade_gmv_per_uv")
	private String tradeGmvPerUv;

	/**
	 * 插件内容点击用户转化率
	 */
	@ApiField("uv_rate")
	private String uvRate;

	/**
	 * 插件访问次数
	 */
	@ApiField("vst_cnt")
	private Long vstCnt;

	/**
	 * 插件访问去重用户数量
	 */
	@ApiField("vst_user_cnt")
	private Long vstUserCnt;

	public String getAvgStayDurationPerUser() {
		return this.avgStayDurationPerUser;
	}
	public void setAvgStayDurationPerUser(String avgStayDurationPerUser) {
		this.avgStayDurationPerUser = avgStayDurationPerUser;
	}

	public String getAvgStayDurationPerVst() {
		return this.avgStayDurationPerVst;
	}
	public void setAvgStayDurationPerVst(String avgStayDurationPerVst) {
		this.avgStayDurationPerVst = avgStayDurationPerVst;
	}

	public Long getClkCnt() {
		return this.clkCnt;
	}
	public void setClkCnt(Long clkCnt) {
		this.clkCnt = clkCnt;
	}

	public Long getClkUserCnt() {
		return this.clkUserCnt;
	}
	public void setClkUserCnt(Long clkUserCnt) {
		this.clkUserCnt = clkUserCnt;
	}

	public String getCommission() {
		return this.commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getCommissionPerPv() {
		return this.commissionPerPv;
	}
	public void setCommissionPerPv(String commissionPerPv) {
		this.commissionPerPv = commissionPerPv;
	}

	public String getCommissionPerUv() {
		return this.commissionPerUv;
	}
	public void setCommissionPerUv(String commissionPerUv) {
		this.commissionPerUv = commissionPerUv;
	}

	public Long getExpoCnt() {
		return this.expoCnt;
	}
	public void setExpoCnt(Long expoCnt) {
		this.expoCnt = expoCnt;
	}

	public Long getExpoUserCnt() {
		return this.expoUserCnt;
	}
	public void setExpoUserCnt(Long expoUserCnt) {
		this.expoUserCnt = expoUserCnt;
	}

	public String getOrderGmv() {
		return this.orderGmv;
	}
	public void setOrderGmv(String orderGmv) {
		this.orderGmv = orderGmv;
	}

	public String getOriginName() {
		return this.originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getPlatformPromotionId() {
		return this.platformPromotionId;
	}
	public void setPlatformPromotionId(String platformPromotionId) {
		this.platformPromotionId = platformPromotionId;
	}

	public String getPvRate() {
		return this.pvRate;
	}
	public void setPvRate(String pvRate) {
		this.pvRate = pvRate;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getTradeCnt() {
		return this.tradeCnt;
	}
	public void setTradeCnt(String tradeCnt) {
		this.tradeCnt = tradeCnt;
	}

	public String getTradeGmvPerPv() {
		return this.tradeGmvPerPv;
	}
	public void setTradeGmvPerPv(String tradeGmvPerPv) {
		this.tradeGmvPerPv = tradeGmvPerPv;
	}

	public String getTradeGmvPerUv() {
		return this.tradeGmvPerUv;
	}
	public void setTradeGmvPerUv(String tradeGmvPerUv) {
		this.tradeGmvPerUv = tradeGmvPerUv;
	}

	public String getUvRate() {
		return this.uvRate;
	}
	public void setUvRate(String uvRate) {
		this.uvRate = uvRate;
	}

	public Long getVstCnt() {
		return this.vstCnt;
	}
	public void setVstCnt(Long vstCnt) {
		this.vstCnt = vstCnt;
	}

	public Long getVstUserCnt() {
		return this.vstUserCnt;
	}
	public void setVstUserCnt(Long vstUserCnt) {
		this.vstUserCnt = vstUserCnt;
	}

}
