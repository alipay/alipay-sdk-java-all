package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OpenApiOperationAnalysisCategoryDetailAliasDTO
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:50:05
 */
public class OpenApiOperationAnalysisCategoryDetailAliasDTO extends AlipayObject {

	private static final long serialVersionUID = 1358373585212788123L;

	/**
	 * 小程序应用ID，分配给开发者的应用ID
	 */
	@ApiField("alipay_app_id")
	private String alipayAppId;

	/**
	 * 小程序应用名称，开发者的应用设置的小程序应用名称
	 */
	@ApiField("alipay_app_name")
	private String alipayAppName;

	/**
	 * 加购人数
	 */
	@ApiField("cate_add_user_cnt")
	private OperationValueLongDTO cateAddUserCnt;

	/**
	 * 曝光量
	 */
	@ApiField("cate_expo_pv")
	private OperationValueLongDTO cateExpoPv;

	/**
	 * 品类ID
	 */
	@ApiField("cate_id")
	private String cateId;

	/**
	 * 月复购率
	 */
	@ApiField("cate_month_repurchase_rate")
	private OperationValueBaseDTO cateMonthRepurchaseRate;

	/**
	 * 品类名称
	 */
	@ApiField("cate_name")
	private String cateName;

	/**
	 * 下单支付人数转化率
	 */
	@ApiField("cate_order_traded_user_cvr")
	private OperationValueBaseDTO cateOrderTradedUserCvr;

	/**
	 * 下单人数
	 */
	@ApiField("cate_order_user_cnt")
	private OperationValueLongDTO cateOrderUserCnt;

	/**
	 * 品类访问占比
	 */
	@ApiField("cate_pv_share_rate")
	private OperationValueBaseDTO catePvShareRate;

	/**
	 * 季度复购率
	 */
	@ApiField("cate_season_repurchase_rate")
	private OperationValueBaseDTO cateSeasonRepurchaseRate;

	/**
	 * 支付金额， 单位：元
	 */
	@ApiField("cate_traded_amt")
	private OperationValueBaseDTO cateTradedAmt;

	/**
	 * 支付件数
	 */
	@ApiField("cate_traded_sales_cnt")
	private OperationValueLongDTO cateTradedSalesCnt;

	/**
	 * 品类支付占比
	 */
	@ApiField("cate_traded_share_rate")
	private OperationValueBaseDTO cateTradedShareRate;

	/**
	 * 支付人数
	 */
	@ApiField("cate_traded_user_cnt")
	private OperationValueLongDTO cateTradedUserCnt;

	/**
	 * 访问人数
	 */
	@ApiField("cate_uv")
	private OperationValueLongDTO cateUv;

	/**
	 * 访问后下单人数转化率
	 */
	@ApiField("cate_visit_order_user_cvr")
	private OperationValueBaseDTO cateVisitOrderUserCvr;

	/**
	 * 访问后支付人数转化率
	 */
	@ApiField("cate_visit_traded_user_cvr")
	private OperationValueBaseDTO cateVisitTradedUserCvr;

	/**
	 * 数据平台类型，数据上报的平台类型枚举,所有枚举值情况请查看入参字段的描述
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 业务的数据日期
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 多端小程序应用ID，非支付宝平台的其他平台的小程序应用ID
	 */
	@ApiField("multi_app_id")
	private String multiAppId;

	/**
	 * 多端小程序应用名称，非支付宝平台的小程序应用名称
	 */
	@ApiField("multi_app_name")
	private String multiAppName;

	public String getAlipayAppId() {
		return this.alipayAppId;
	}
	public void setAlipayAppId(String alipayAppId) {
		this.alipayAppId = alipayAppId;
	}

	public String getAlipayAppName() {
		return this.alipayAppName;
	}
	public void setAlipayAppName(String alipayAppName) {
		this.alipayAppName = alipayAppName;
	}

	public OperationValueLongDTO getCateAddUserCnt() {
		return this.cateAddUserCnt;
	}
	public void setCateAddUserCnt(OperationValueLongDTO cateAddUserCnt) {
		this.cateAddUserCnt = cateAddUserCnt;
	}

	public OperationValueLongDTO getCateExpoPv() {
		return this.cateExpoPv;
	}
	public void setCateExpoPv(OperationValueLongDTO cateExpoPv) {
		this.cateExpoPv = cateExpoPv;
	}

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	public OperationValueBaseDTO getCateMonthRepurchaseRate() {
		return this.cateMonthRepurchaseRate;
	}
	public void setCateMonthRepurchaseRate(OperationValueBaseDTO cateMonthRepurchaseRate) {
		this.cateMonthRepurchaseRate = cateMonthRepurchaseRate;
	}

	public String getCateName() {
		return this.cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public OperationValueBaseDTO getCateOrderTradedUserCvr() {
		return this.cateOrderTradedUserCvr;
	}
	public void setCateOrderTradedUserCvr(OperationValueBaseDTO cateOrderTradedUserCvr) {
		this.cateOrderTradedUserCvr = cateOrderTradedUserCvr;
	}

	public OperationValueLongDTO getCateOrderUserCnt() {
		return this.cateOrderUserCnt;
	}
	public void setCateOrderUserCnt(OperationValueLongDTO cateOrderUserCnt) {
		this.cateOrderUserCnt = cateOrderUserCnt;
	}

	public OperationValueBaseDTO getCatePvShareRate() {
		return this.catePvShareRate;
	}
	public void setCatePvShareRate(OperationValueBaseDTO catePvShareRate) {
		this.catePvShareRate = catePvShareRate;
	}

	public OperationValueBaseDTO getCateSeasonRepurchaseRate() {
		return this.cateSeasonRepurchaseRate;
	}
	public void setCateSeasonRepurchaseRate(OperationValueBaseDTO cateSeasonRepurchaseRate) {
		this.cateSeasonRepurchaseRate = cateSeasonRepurchaseRate;
	}

	public OperationValueBaseDTO getCateTradedAmt() {
		return this.cateTradedAmt;
	}
	public void setCateTradedAmt(OperationValueBaseDTO cateTradedAmt) {
		this.cateTradedAmt = cateTradedAmt;
	}

	public OperationValueLongDTO getCateTradedSalesCnt() {
		return this.cateTradedSalesCnt;
	}
	public void setCateTradedSalesCnt(OperationValueLongDTO cateTradedSalesCnt) {
		this.cateTradedSalesCnt = cateTradedSalesCnt;
	}

	public OperationValueBaseDTO getCateTradedShareRate() {
		return this.cateTradedShareRate;
	}
	public void setCateTradedShareRate(OperationValueBaseDTO cateTradedShareRate) {
		this.cateTradedShareRate = cateTradedShareRate;
	}

	public OperationValueLongDTO getCateTradedUserCnt() {
		return this.cateTradedUserCnt;
	}
	public void setCateTradedUserCnt(OperationValueLongDTO cateTradedUserCnt) {
		this.cateTradedUserCnt = cateTradedUserCnt;
	}

	public OperationValueLongDTO getCateUv() {
		return this.cateUv;
	}
	public void setCateUv(OperationValueLongDTO cateUv) {
		this.cateUv = cateUv;
	}

	public OperationValueBaseDTO getCateVisitOrderUserCvr() {
		return this.cateVisitOrderUserCvr;
	}
	public void setCateVisitOrderUserCvr(OperationValueBaseDTO cateVisitOrderUserCvr) {
		this.cateVisitOrderUserCvr = cateVisitOrderUserCvr;
	}

	public OperationValueBaseDTO getCateVisitTradedUserCvr() {
		return this.cateVisitTradedUserCvr;
	}
	public void setCateVisitTradedUserCvr(OperationValueBaseDTO cateVisitTradedUserCvr) {
		this.cateVisitTradedUserCvr = cateVisitTradedUserCvr;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getDt() {
		return this.dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getMultiAppId() {
		return this.multiAppId;
	}
	public void setMultiAppId(String multiAppId) {
		this.multiAppId = multiAppId;
	}

	public String getMultiAppName() {
		return this.multiAppName;
	}
	public void setMultiAppName(String multiAppName) {
		this.multiAppName = multiAppName;
	}

}
