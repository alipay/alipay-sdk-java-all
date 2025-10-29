package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析-商品分析-商品趋势总览返回结构体
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:58
 */
public class OpenApiOperationAnalysisGoodsAliasDTO extends AlipayObject {

	private static final long serialVersionUID = 6545226763899313868L;

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
	 * 数据平台类型，数据上报的平台类型枚举，枚举值列表请见入参的channel_type得描述
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
	 * 客单价，单位：元
	 */
	@ApiField("per_customer_price")
	private OperationValueBaseDTO perCustomerPrice;

	/**
	 * 笔单价，单位：元
	 */
	@ApiField("per_unit_price")
	private OperationValueBaseDTO perUnitPrice;

	/**
	 * 加购笔数
	 */
	@ApiField("spu_add_order_cnt")
	private OperationValueLongDTO spuAddOrderCnt;

	/**
	 * 加购件数
	 */
	@ApiField("spu_add_sku_cnt")
	private OperationValueLongDTO spuAddSkuCnt;

	/**
	 * 加购人数
	 */
	@ApiField("spu_add_user_cnt")
	private OperationValueLongDTO spuAddUserCnt;

	/**
	 * 商品曝光量
	 */
	@ApiField("spu_expo_pv")
	private OperationValueLongDTO spuExpoPv;

	/**
	 * 月复购率
	 */
	@ApiField("spu_month_repurchase_rate")
	private OperationValueBaseDTO spuMonthRepurchaseRate;

	/**
	 * 下单金额，单位：元
	 */
	@ApiField("spu_order_amt")
	private OperationValueBaseDTO spuOrderAmt;

	/**
	 * 下单笔数
	 */
	@ApiField("spu_order_cnt")
	private OperationValueLongDTO spuOrderCnt;

	/**
	 * 下单人数
	 */
	@ApiField("spu_order_user_cnt")
	private OperationValueLongDTO spuOrderUserCnt;

	/**
	 * 退款金额，单位：元
	 */
	@ApiField("spu_refund_amt")
	private OperationValueBaseDTO spuRefundAmt;

	/**
	 * 退款笔数
	 */
	@ApiField("spu_refund_cnt")
	private OperationValueLongDTO spuRefundCnt;

	/**
	 * 退款人数
	 */
	@ApiField("spu_refund_user_cnt")
	private OperationValueLongDTO spuRefundUserCnt;

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
	 * 支付笔数
	 */
	@ApiField("spu_traded_cnt")
	private OperationValueLongDTO spuTradedCnt;

	/**
	 * 退款人数转化率
	 */
	@ApiField("spu_traded_refund_user_cvr")
	private OperationValueBaseDTO spuTradedRefundUserCvr;

	/**
	 * 支付人数
	 */
	@ApiField("spu_traded_user_cnt")
	private OperationValueLongDTO spuTradedUserCnt;

	/**
	 * 未支付金额，单位：元
	 */
	@ApiField("spu_untraded_amt")
	private OperationValueBaseDTO spuUntradedAmt;

	/**
	 * 未支付笔数
	 */
	@ApiField("spu_untraded_cnt")
	private OperationValueLongDTO spuUntradedCnt;

	/**
	 * 未支付人数
	 */
	@ApiField("spu_untraded_user_cnt")
	private OperationValueLongDTO spuUntradedUserCnt;

	/**
	 * 商品访问人数
	 */
	@ApiField("spu_uv")
	private OperationValueLongDTO spuUv;

	/**
	 * 访问商品后加购人数转化率
	 */
	@ApiField("spu_visit_add_user_cvr")
	private OperationValueBaseDTO spuVisitAddUserCvr;

	/**
	 * 被访问商品数
	 */
	@ApiField("spu_visit_cnt")
	private OperationValueLongDTO spuVisitCnt;

	/**
	 * 访问商品后下单人数转化率
	 */
	@ApiField("spu_visit_order_user_cvr")
	private OperationValueBaseDTO spuVisitOrderUserCvr;

	/**
	 * 访问商品后支付人数转化率
	 */
	@ApiField("spu_visit_traded_user_cvr")
	private OperationValueBaseDTO spuVisitTradedUserCvr;

	/**
	 * 未支付人数转化率
	 */
	@ApiField("spu_visit_untrade_user_cvr")
	private OperationValueBaseDTO spuVisitUntradeUserCvr;

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

	public OperationValueBaseDTO getPerCustomerPrice() {
		return this.perCustomerPrice;
	}
	public void setPerCustomerPrice(OperationValueBaseDTO perCustomerPrice) {
		this.perCustomerPrice = perCustomerPrice;
	}

	public OperationValueBaseDTO getPerUnitPrice() {
		return this.perUnitPrice;
	}
	public void setPerUnitPrice(OperationValueBaseDTO perUnitPrice) {
		this.perUnitPrice = perUnitPrice;
	}

	public OperationValueLongDTO getSpuAddOrderCnt() {
		return this.spuAddOrderCnt;
	}
	public void setSpuAddOrderCnt(OperationValueLongDTO spuAddOrderCnt) {
		this.spuAddOrderCnt = spuAddOrderCnt;
	}

	public OperationValueLongDTO getSpuAddSkuCnt() {
		return this.spuAddSkuCnt;
	}
	public void setSpuAddSkuCnt(OperationValueLongDTO spuAddSkuCnt) {
		this.spuAddSkuCnt = spuAddSkuCnt;
	}

	public OperationValueLongDTO getSpuAddUserCnt() {
		return this.spuAddUserCnt;
	}
	public void setSpuAddUserCnt(OperationValueLongDTO spuAddUserCnt) {
		this.spuAddUserCnt = spuAddUserCnt;
	}

	public OperationValueLongDTO getSpuExpoPv() {
		return this.spuExpoPv;
	}
	public void setSpuExpoPv(OperationValueLongDTO spuExpoPv) {
		this.spuExpoPv = spuExpoPv;
	}

	public OperationValueBaseDTO getSpuMonthRepurchaseRate() {
		return this.spuMonthRepurchaseRate;
	}
	public void setSpuMonthRepurchaseRate(OperationValueBaseDTO spuMonthRepurchaseRate) {
		this.spuMonthRepurchaseRate = spuMonthRepurchaseRate;
	}

	public OperationValueBaseDTO getSpuOrderAmt() {
		return this.spuOrderAmt;
	}
	public void setSpuOrderAmt(OperationValueBaseDTO spuOrderAmt) {
		this.spuOrderAmt = spuOrderAmt;
	}

	public OperationValueLongDTO getSpuOrderCnt() {
		return this.spuOrderCnt;
	}
	public void setSpuOrderCnt(OperationValueLongDTO spuOrderCnt) {
		this.spuOrderCnt = spuOrderCnt;
	}

	public OperationValueLongDTO getSpuOrderUserCnt() {
		return this.spuOrderUserCnt;
	}
	public void setSpuOrderUserCnt(OperationValueLongDTO spuOrderUserCnt) {
		this.spuOrderUserCnt = spuOrderUserCnt;
	}

	public OperationValueBaseDTO getSpuRefundAmt() {
		return this.spuRefundAmt;
	}
	public void setSpuRefundAmt(OperationValueBaseDTO spuRefundAmt) {
		this.spuRefundAmt = spuRefundAmt;
	}

	public OperationValueLongDTO getSpuRefundCnt() {
		return this.spuRefundCnt;
	}
	public void setSpuRefundCnt(OperationValueLongDTO spuRefundCnt) {
		this.spuRefundCnt = spuRefundCnt;
	}

	public OperationValueLongDTO getSpuRefundUserCnt() {
		return this.spuRefundUserCnt;
	}
	public void setSpuRefundUserCnt(OperationValueLongDTO spuRefundUserCnt) {
		this.spuRefundUserCnt = spuRefundUserCnt;
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

	public OperationValueLongDTO getSpuTradedCnt() {
		return this.spuTradedCnt;
	}
	public void setSpuTradedCnt(OperationValueLongDTO spuTradedCnt) {
		this.spuTradedCnt = spuTradedCnt;
	}

	public OperationValueBaseDTO getSpuTradedRefundUserCvr() {
		return this.spuTradedRefundUserCvr;
	}
	public void setSpuTradedRefundUserCvr(OperationValueBaseDTO spuTradedRefundUserCvr) {
		this.spuTradedRefundUserCvr = spuTradedRefundUserCvr;
	}

	public OperationValueLongDTO getSpuTradedUserCnt() {
		return this.spuTradedUserCnt;
	}
	public void setSpuTradedUserCnt(OperationValueLongDTO spuTradedUserCnt) {
		this.spuTradedUserCnt = spuTradedUserCnt;
	}

	public OperationValueBaseDTO getSpuUntradedAmt() {
		return this.spuUntradedAmt;
	}
	public void setSpuUntradedAmt(OperationValueBaseDTO spuUntradedAmt) {
		this.spuUntradedAmt = spuUntradedAmt;
	}

	public OperationValueLongDTO getSpuUntradedCnt() {
		return this.spuUntradedCnt;
	}
	public void setSpuUntradedCnt(OperationValueLongDTO spuUntradedCnt) {
		this.spuUntradedCnt = spuUntradedCnt;
	}

	public OperationValueLongDTO getSpuUntradedUserCnt() {
		return this.spuUntradedUserCnt;
	}
	public void setSpuUntradedUserCnt(OperationValueLongDTO spuUntradedUserCnt) {
		this.spuUntradedUserCnt = spuUntradedUserCnt;
	}

	public OperationValueLongDTO getSpuUv() {
		return this.spuUv;
	}
	public void setSpuUv(OperationValueLongDTO spuUv) {
		this.spuUv = spuUv;
	}

	public OperationValueBaseDTO getSpuVisitAddUserCvr() {
		return this.spuVisitAddUserCvr;
	}
	public void setSpuVisitAddUserCvr(OperationValueBaseDTO spuVisitAddUserCvr) {
		this.spuVisitAddUserCvr = spuVisitAddUserCvr;
	}

	public OperationValueLongDTO getSpuVisitCnt() {
		return this.spuVisitCnt;
	}
	public void setSpuVisitCnt(OperationValueLongDTO spuVisitCnt) {
		this.spuVisitCnt = spuVisitCnt;
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

	public OperationValueBaseDTO getSpuVisitUntradeUserCvr() {
		return this.spuVisitUntradeUserCvr;
	}
	public void setSpuVisitUntradeUserCvr(OperationValueBaseDTO spuVisitUntradeUserCvr) {
		this.spuVisitUntradeUserCvr = spuVisitUntradeUserCvr;
	}

}
