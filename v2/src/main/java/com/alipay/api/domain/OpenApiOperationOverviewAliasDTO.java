package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营概况总览返回结果
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:56
 */
public class OpenApiOperationOverviewAliasDTO extends AlipayObject {

	private static final long serialVersionUID = 3768197951919635888L;

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
	 * 数据平台类型，数据上报的平台类型枚举,非必传，如不传则默认为ALIPAY
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
	 * 客单价, 单位: 元
	 */
	@ApiField("per_customer_price")
	private OperationValueBaseDTO perCustomerPrice;

	/**
	 * 笔单价, 单位: 元
	 */
	@ApiField("per_unit_price")
	private OperationValueBaseDTO perUnitPrice;

	/**
	 * 商家账户ID，经营概况模块由于是默认支持商户粒度的数据分析，故会返回pid商户信息
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 商家账户名称，经营概况模块由于是默认支持商户粒度的数据分析，故会返回pid商户信息
	 */
	@ApiField("pid_name")
	private String pidName;

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
	 * 季度复购率
	 */
	@ApiField("spu_season_repurchase_rate")
	private OperationValueBaseDTO spuSeasonRepurchaseRate;

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
	 * 加购笔数
	 */
	@ApiField("tapp_add_order_cnt")
	private OperationValueLongDTO tappAddOrderCnt;

	/**
	 * 加购件数
	 */
	@ApiField("tapp_add_sku_cnt")
	private OperationValueLongDTO tappAddSkuCnt;

	/**
	 * 加购人数
	 */
	@ApiField("tapp_add_user_cnt")
	private OperationValueLongDTO tappAddUserCnt;

	/**
	 * 新增小程序访客数
	 */
	@ApiField("tapp_new_uv")
	private OperationValueLongDTO tappNewUv;

	/**
	 * 小程序老访客数
	 */
	@ApiField("tapp_old_uv")
	private OperationValueLongDTO tappOldUv;

	/**
	 * 下单金额, 单位: 元
	 */
	@ApiField("tapp_order_amt")
	private OperationValueBaseDTO tappOrderAmt;

	/**
	 * 下单笔数
	 */
	@ApiField("tapp_order_cnt")
	private OperationValueLongDTO tappOrderCnt;

	/**
	 * 下单人数
	 */
	@ApiField("tapp_order_user_cnt")
	private OperationValueLongDTO tappOrderUserCnt;

	/**
	 * 小程序打开次数
	 */
	@ApiField("tapp_pv")
	private OperationValueLongDTO tappPv;

	/**
	 * 退款金额, 单位: 元
	 */
	@ApiField("tapp_refund_amt")
	private OperationValueBaseDTO tappRefundAmt;

	/**
	 * 退款笔数
	 */
	@ApiField("tapp_refund_cnt")
	private OperationValueLongDTO tappRefundCnt;

	/**
	 * 退款人数
	 */
	@ApiField("tapp_refund_user_cnt")
	private OperationValueLongDTO tappRefundUserCnt;

	/**
	 * 支付金额, 单位: 元
	 */
	@ApiField("tapp_traded_amt")
	private OperationValueBaseDTO tappTradedAmt;

	/**
	 * 支付笔数
	 */
	@ApiField("tapp_traded_cnt")
	private OperationValueLongDTO tappTradedCnt;

	/**
	 * 退款人数转化率
	 */
	@ApiField("tapp_traded_refund_user_cvr")
	private OperationValueBaseDTO tappTradedRefundUserCvr;

	/**
	 * 支付人数
	 */
	@ApiField("tapp_traded_user_cnt")
	private OperationValueLongDTO tappTradedUserCnt;

	/**
	 * 未支付金额, 单位: 元
	 */
	@ApiField("tapp_untraded_amt")
	private OperationValueBaseDTO tappUntradedAmt;

	/**
	 * 未支付笔数
	 */
	@ApiField("tapp_untraded_cnt")
	private OperationValueLongDTO tappUntradedCnt;

	/**
	 * 未支付人数
	 */
	@ApiField("tapp_untraded_user_cnt")
	private OperationValueLongDTO tappUntradedUserCnt;

	/**
	 * 小程序访问人数
	 */
	@ApiField("tapp_uv")
	private OperationValueLongDTO tappUv;

	/**
	 * 访问小程序后加购人数转化率
	 */
	@ApiField("tapp_visit_add_user_cvr")
	private OperationValueBaseDTO tappVisitAddUserCvr;

	/**
	 * 访问小程序后下单人数转化率
	 */
	@ApiField("tapp_visit_order_user_cvr")
	private OperationValueBaseDTO tappVisitOrderUserCvr;

	/**
	 * 访问小程序后支付人数转化率
	 */
	@ApiField("tapp_visit_traded_user_cvr")
	private OperationValueBaseDTO tappVisitTradedUserCvr;

	/**
	 * 未支付人数转化率
	 */
	@ApiField("tapp_visit_untraded_user_cvr")
	private OperationValueBaseDTO tappVisitUntradedUserCvr;

	/**
	 * 小程序云数据模板，用于对分析数据的过滤筛选的条件参数，不传时代表不参与数据模板条件过滤
	 */
	@ApiField("template")
	private String template;

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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPidName() {
		return this.pidName;
	}
	public void setPidName(String pidName) {
		this.pidName = pidName;
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

	public OperationValueBaseDTO getSpuSeasonRepurchaseRate() {
		return this.spuSeasonRepurchaseRate;
	}
	public void setSpuSeasonRepurchaseRate(OperationValueBaseDTO spuSeasonRepurchaseRate) {
		this.spuSeasonRepurchaseRate = spuSeasonRepurchaseRate;
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

	public OperationValueLongDTO getTappAddOrderCnt() {
		return this.tappAddOrderCnt;
	}
	public void setTappAddOrderCnt(OperationValueLongDTO tappAddOrderCnt) {
		this.tappAddOrderCnt = tappAddOrderCnt;
	}

	public OperationValueLongDTO getTappAddSkuCnt() {
		return this.tappAddSkuCnt;
	}
	public void setTappAddSkuCnt(OperationValueLongDTO tappAddSkuCnt) {
		this.tappAddSkuCnt = tappAddSkuCnt;
	}

	public OperationValueLongDTO getTappAddUserCnt() {
		return this.tappAddUserCnt;
	}
	public void setTappAddUserCnt(OperationValueLongDTO tappAddUserCnt) {
		this.tappAddUserCnt = tappAddUserCnt;
	}

	public OperationValueLongDTO getTappNewUv() {
		return this.tappNewUv;
	}
	public void setTappNewUv(OperationValueLongDTO tappNewUv) {
		this.tappNewUv = tappNewUv;
	}

	public OperationValueLongDTO getTappOldUv() {
		return this.tappOldUv;
	}
	public void setTappOldUv(OperationValueLongDTO tappOldUv) {
		this.tappOldUv = tappOldUv;
	}

	public OperationValueBaseDTO getTappOrderAmt() {
		return this.tappOrderAmt;
	}
	public void setTappOrderAmt(OperationValueBaseDTO tappOrderAmt) {
		this.tappOrderAmt = tappOrderAmt;
	}

	public OperationValueLongDTO getTappOrderCnt() {
		return this.tappOrderCnt;
	}
	public void setTappOrderCnt(OperationValueLongDTO tappOrderCnt) {
		this.tappOrderCnt = tappOrderCnt;
	}

	public OperationValueLongDTO getTappOrderUserCnt() {
		return this.tappOrderUserCnt;
	}
	public void setTappOrderUserCnt(OperationValueLongDTO tappOrderUserCnt) {
		this.tappOrderUserCnt = tappOrderUserCnt;
	}

	public OperationValueLongDTO getTappPv() {
		return this.tappPv;
	}
	public void setTappPv(OperationValueLongDTO tappPv) {
		this.tappPv = tappPv;
	}

	public OperationValueBaseDTO getTappRefundAmt() {
		return this.tappRefundAmt;
	}
	public void setTappRefundAmt(OperationValueBaseDTO tappRefundAmt) {
		this.tappRefundAmt = tappRefundAmt;
	}

	public OperationValueLongDTO getTappRefundCnt() {
		return this.tappRefundCnt;
	}
	public void setTappRefundCnt(OperationValueLongDTO tappRefundCnt) {
		this.tappRefundCnt = tappRefundCnt;
	}

	public OperationValueLongDTO getTappRefundUserCnt() {
		return this.tappRefundUserCnt;
	}
	public void setTappRefundUserCnt(OperationValueLongDTO tappRefundUserCnt) {
		this.tappRefundUserCnt = tappRefundUserCnt;
	}

	public OperationValueBaseDTO getTappTradedAmt() {
		return this.tappTradedAmt;
	}
	public void setTappTradedAmt(OperationValueBaseDTO tappTradedAmt) {
		this.tappTradedAmt = tappTradedAmt;
	}

	public OperationValueLongDTO getTappTradedCnt() {
		return this.tappTradedCnt;
	}
	public void setTappTradedCnt(OperationValueLongDTO tappTradedCnt) {
		this.tappTradedCnt = tappTradedCnt;
	}

	public OperationValueBaseDTO getTappTradedRefundUserCvr() {
		return this.tappTradedRefundUserCvr;
	}
	public void setTappTradedRefundUserCvr(OperationValueBaseDTO tappTradedRefundUserCvr) {
		this.tappTradedRefundUserCvr = tappTradedRefundUserCvr;
	}

	public OperationValueLongDTO getTappTradedUserCnt() {
		return this.tappTradedUserCnt;
	}
	public void setTappTradedUserCnt(OperationValueLongDTO tappTradedUserCnt) {
		this.tappTradedUserCnt = tappTradedUserCnt;
	}

	public OperationValueBaseDTO getTappUntradedAmt() {
		return this.tappUntradedAmt;
	}
	public void setTappUntradedAmt(OperationValueBaseDTO tappUntradedAmt) {
		this.tappUntradedAmt = tappUntradedAmt;
	}

	public OperationValueLongDTO getTappUntradedCnt() {
		return this.tappUntradedCnt;
	}
	public void setTappUntradedCnt(OperationValueLongDTO tappUntradedCnt) {
		this.tappUntradedCnt = tappUntradedCnt;
	}

	public OperationValueLongDTO getTappUntradedUserCnt() {
		return this.tappUntradedUserCnt;
	}
	public void setTappUntradedUserCnt(OperationValueLongDTO tappUntradedUserCnt) {
		this.tappUntradedUserCnt = tappUntradedUserCnt;
	}

	public OperationValueLongDTO getTappUv() {
		return this.tappUv;
	}
	public void setTappUv(OperationValueLongDTO tappUv) {
		this.tappUv = tappUv;
	}

	public OperationValueBaseDTO getTappVisitAddUserCvr() {
		return this.tappVisitAddUserCvr;
	}
	public void setTappVisitAddUserCvr(OperationValueBaseDTO tappVisitAddUserCvr) {
		this.tappVisitAddUserCvr = tappVisitAddUserCvr;
	}

	public OperationValueBaseDTO getTappVisitOrderUserCvr() {
		return this.tappVisitOrderUserCvr;
	}
	public void setTappVisitOrderUserCvr(OperationValueBaseDTO tappVisitOrderUserCvr) {
		this.tappVisitOrderUserCvr = tappVisitOrderUserCvr;
	}

	public OperationValueBaseDTO getTappVisitTradedUserCvr() {
		return this.tappVisitTradedUserCvr;
	}
	public void setTappVisitTradedUserCvr(OperationValueBaseDTO tappVisitTradedUserCvr) {
		this.tappVisitTradedUserCvr = tappVisitTradedUserCvr;
	}

	public OperationValueBaseDTO getTappVisitUntradedUserCvr() {
		return this.tappVisitUntradedUserCvr;
	}
	public void setTappVisitUntradedUserCvr(OperationValueBaseDTO tappVisitUntradedUserCvr) {
		this.tappVisitUntradedUserCvr = tappVisitUntradedUserCvr;
	}

	public String getTemplate() {
		return this.template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}

}
