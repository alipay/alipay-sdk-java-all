package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OpenApiOperationAnalysisGoodsDetailAliasDTO
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:59
 */
public class OpenApiOperationAnalysisGoodsDetailAliasDTO extends AlipayObject {

	private static final long serialVersionUID = 8477299692435411418L;

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
	 * 品类ID
	 */
	@ApiField("cate_id")
	private String cateId;

	/**
	 * 品类名称
	 */
	@ApiField("cate_name")
	private String cateName;

	/**
	 * 数据平台类型，数据上报的平台类型枚举, 枚举所有情况列表请查看入参字段的描述
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

	/**
	 * 加购人数
	 */
	@ApiField("spu_add_user_cnt")
	private OperationValueLongDTO spuAddUserCnt;

	/**
	 * 品类访问占比
	 */
	@ApiField("spu_cate_pv_share_rate")
	private OperationValueBaseDTO spuCatePvShareRate;

	/**
	 * 品类支付占比
	 */
	@ApiField("spu_cate_traded_share_rate")
	private OperationValueBaseDTO spuCateTradedShareRate;

	/**
	 * 曝光量
	 */
	@ApiField("spu_expo_pv")
	private OperationValueLongDTO spuExpoPv;

	/**
	 * 商品ID
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 月复购率
	 */
	@ApiField("spu_month_repurchase_rate")
	private OperationValueBaseDTO spuMonthRepurchaseRate;

	/**
	 * 商品名称
	 */
	@ApiField("spu_name")
	private String spuName;

	/**
	 * 下单支付人数转化率
	 */
	@ApiField("spu_order_traded_user_cvr")
	private OperationValueBaseDTO spuOrderTradedUserCvr;

	/**
	 * 下单人数
	 */
	@ApiField("spu_order_user_cnt")
	private OperationValueLongDTO spuOrderUserCnt;

	/**
	 * 季度复购率
	 */
	@ApiField("spu_season_repurchase_rate")
	private OperationValueBaseDTO spuSeasonRepurchaseRate;

	/**
	 * 支付金额，单位：元
	 */
	@ApiField("spu_traded_amt")
	private OperationValueBaseDTO spuTradedAmt;

	/**
	 * 支付件数
	 */
	@ApiField("spu_traded_sales_cnt")
	private OperationValueLongDTO spuTradedSalesCnt;

	/**
	 * 支付人数
	 */
	@ApiField("spu_traded_user_cnt")
	private OperationValueLongDTO spuTradedUserCnt;

	/**
	 * 访问人数
	 */
	@ApiField("spu_uv")
	private OperationValueLongDTO spuUv;

	/**
	 * 访问后下单人数转化率
	 */
	@ApiField("spu_visit_order_user_cvr")
	private OperationValueBaseDTO spuVisitOrderUserCvr;

	/**
	 * 访问后支付人数转化率
	 */
	@ApiField("spu_visit_traded_user_cvr")
	private OperationValueBaseDTO spuVisitTradedUserCvr;

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

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	public String getCateName() {
		return this.cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
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

	public OperationValueLongDTO getSpuAddUserCnt() {
		return this.spuAddUserCnt;
	}
	public void setSpuAddUserCnt(OperationValueLongDTO spuAddUserCnt) {
		this.spuAddUserCnt = spuAddUserCnt;
	}

	public OperationValueBaseDTO getSpuCatePvShareRate() {
		return this.spuCatePvShareRate;
	}
	public void setSpuCatePvShareRate(OperationValueBaseDTO spuCatePvShareRate) {
		this.spuCatePvShareRate = spuCatePvShareRate;
	}

	public OperationValueBaseDTO getSpuCateTradedShareRate() {
		return this.spuCateTradedShareRate;
	}
	public void setSpuCateTradedShareRate(OperationValueBaseDTO spuCateTradedShareRate) {
		this.spuCateTradedShareRate = spuCateTradedShareRate;
	}

	public OperationValueLongDTO getSpuExpoPv() {
		return this.spuExpoPv;
	}
	public void setSpuExpoPv(OperationValueLongDTO spuExpoPv) {
		this.spuExpoPv = spuExpoPv;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public OperationValueBaseDTO getSpuMonthRepurchaseRate() {
		return this.spuMonthRepurchaseRate;
	}
	public void setSpuMonthRepurchaseRate(OperationValueBaseDTO spuMonthRepurchaseRate) {
		this.spuMonthRepurchaseRate = spuMonthRepurchaseRate;
	}

	public String getSpuName() {
		return this.spuName;
	}
	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}

	public OperationValueBaseDTO getSpuOrderTradedUserCvr() {
		return this.spuOrderTradedUserCvr;
	}
	public void setSpuOrderTradedUserCvr(OperationValueBaseDTO spuOrderTradedUserCvr) {
		this.spuOrderTradedUserCvr = spuOrderTradedUserCvr;
	}

	public OperationValueLongDTO getSpuOrderUserCnt() {
		return this.spuOrderUserCnt;
	}
	public void setSpuOrderUserCnt(OperationValueLongDTO spuOrderUserCnt) {
		this.spuOrderUserCnt = spuOrderUserCnt;
	}

	public OperationValueBaseDTO getSpuSeasonRepurchaseRate() {
		return this.spuSeasonRepurchaseRate;
	}
	public void setSpuSeasonRepurchaseRate(OperationValueBaseDTO spuSeasonRepurchaseRate) {
		this.spuSeasonRepurchaseRate = spuSeasonRepurchaseRate;
	}

	public OperationValueBaseDTO getSpuTradedAmt() {
		return this.spuTradedAmt;
	}
	public void setSpuTradedAmt(OperationValueBaseDTO spuTradedAmt) {
		this.spuTradedAmt = spuTradedAmt;
	}

	public OperationValueLongDTO getSpuTradedSalesCnt() {
		return this.spuTradedSalesCnt;
	}
	public void setSpuTradedSalesCnt(OperationValueLongDTO spuTradedSalesCnt) {
		this.spuTradedSalesCnt = spuTradedSalesCnt;
	}

	public OperationValueLongDTO getSpuTradedUserCnt() {
		return this.spuTradedUserCnt;
	}
	public void setSpuTradedUserCnt(OperationValueLongDTO spuTradedUserCnt) {
		this.spuTradedUserCnt = spuTradedUserCnt;
	}

	public OperationValueLongDTO getSpuUv() {
		return this.spuUv;
	}
	public void setSpuUv(OperationValueLongDTO spuUv) {
		this.spuUv = spuUv;
	}

	public OperationValueBaseDTO getSpuVisitOrderUserCvr() {
		return this.spuVisitOrderUserCvr;
	}
	public void setSpuVisitOrderUserCvr(OperationValueBaseDTO spuVisitOrderUserCvr) {
		this.spuVisitOrderUserCvr = spuVisitOrderUserCvr;
	}

	public OperationValueBaseDTO getSpuVisitTradedUserCvr() {
		return this.spuVisitTradedUserCvr;
	}
	public void setSpuVisitTradedUserCvr(OperationValueBaseDTO spuVisitTradedUserCvr) {
		this.spuVisitTradedUserCvr = spuVisitTradedUserCvr;
	}

}
