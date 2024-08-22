package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算账单详情
 *
 * @author auto create
 * @since 1.0, 2024-07-30 16:25:17
 */
public class LocalSettleBillItem extends AlipayObject {

	private static final long serialVersionUID = 6115834555632163263L;

	/**
	 * 支付宝优惠（元）
	 */
	@ApiField("alipay_discount_amount")
	private String alipayDiscountAmount;

	/**
	 * 商品类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 凭证号
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 核销序列号
	 */
	@ApiField("certificate_serial_no")
	private String certificateSerialNo;

	/**
	 * 商家订单凭证的核销状态，下钻到次序号维度
	 */
	@ApiField("certificate_status")
	private String certificateStatus;

	/**
	 * 该笔账单的类型
	 */
	@ApiField("direction_type_en")
	private String directionTypeEn;

	/**
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 平台商品库商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 平台商品库商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 商家优惠（元）
	 */
	@ApiField("mvirtual_amount")
	private String mvirtualAmount;

	/**
	 * 平台订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 本地生活商品原价，单位：元，精确到小数点后两位
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 外部门店ID
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 外部门店备注名
	 */
	@ApiField("out_shop_name")
	private String outShopName;

	/**
	 * 支付宝账号绑定手机号、银行卡号,脱敏
	 */
	@ApiField("settle_account_loginid_bank")
	private String settleAccountLoginidBank;

	/**
	 * 结算账号类型
	 */
	@ApiField("settle_account_type")
	private String settleAccountType;

	/**
	 * 结算金额（元）
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/**
	 * 结算批次号
	 */
	@ApiField("settle_batch_no")
	private String settleBatchNo;

	/**
	 * 结算时间
	 */
	@ApiField("settle_gmt")
	private Date settleGmt;

	/**
	 * 核销门店ID
	 */
	@ApiField("settle_shop_id")
	private String settleShopId;

	/**
	 * 核销门店名称
	 */
	@ApiField("settle_shop_name")
	private String settleShopName;

	/**
	 * 凭证面额（元）
	 */
	@ApiField("total_cash")
	private String totalCash;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 订单成交场景
	 */
	@ApiField("trade_order_scene_desc")
	private String tradeOrderSceneDesc;

	/**
	 * 核销外部订单号
	 */
	@ApiField("use_order_no")
	private String useOrderNo;

	/**
	 * 核销时间，单位：秒。
	 */
	@ApiField("use_time")
	private Date useTime;

	/**
	 * 核销交易号
	 */
	@ApiField("use_trade_no")
	private String useTradeNo;

	public String getAlipayDiscountAmount() {
		return this.alipayDiscountAmount;
	}
	public void setAlipayDiscountAmount(String alipayDiscountAmount) {
		this.alipayDiscountAmount = alipayDiscountAmount;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateSerialNo() {
		return this.certificateSerialNo;
	}
	public void setCertificateSerialNo(String certificateSerialNo) {
		this.certificateSerialNo = certificateSerialNo;
	}

	public String getCertificateStatus() {
		return this.certificateStatus;
	}
	public void setCertificateStatus(String certificateStatus) {
		this.certificateStatus = certificateStatus;
	}

	public String getDirectionTypeEn() {
		return this.directionTypeEn;
	}
	public void setDirectionTypeEn(String directionTypeEn) {
		this.directionTypeEn = directionTypeEn;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMvirtualAmount() {
		return this.mvirtualAmount;
	}
	public void setMvirtualAmount(String mvirtualAmount) {
		this.mvirtualAmount = mvirtualAmount;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getOutShopName() {
		return this.outShopName;
	}
	public void setOutShopName(String outShopName) {
		this.outShopName = outShopName;
	}

	public String getSettleAccountLoginidBank() {
		return this.settleAccountLoginidBank;
	}
	public void setSettleAccountLoginidBank(String settleAccountLoginidBank) {
		this.settleAccountLoginidBank = settleAccountLoginidBank;
	}

	public String getSettleAccountType() {
		return this.settleAccountType;
	}
	public void setSettleAccountType(String settleAccountType) {
		this.settleAccountType = settleAccountType;
	}

	public String getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

	public String getSettleBatchNo() {
		return this.settleBatchNo;
	}
	public void setSettleBatchNo(String settleBatchNo) {
		this.settleBatchNo = settleBatchNo;
	}

	public Date getSettleGmt() {
		return this.settleGmt;
	}
	public void setSettleGmt(Date settleGmt) {
		this.settleGmt = settleGmt;
	}

	public String getSettleShopId() {
		return this.settleShopId;
	}
	public void setSettleShopId(String settleShopId) {
		this.settleShopId = settleShopId;
	}

	public String getSettleShopName() {
		return this.settleShopName;
	}
	public void setSettleShopName(String settleShopName) {
		this.settleShopName = settleShopName;
	}

	public String getTotalCash() {
		return this.totalCash;
	}
	public void setTotalCash(String totalCash) {
		this.totalCash = totalCash;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeOrderSceneDesc() {
		return this.tradeOrderSceneDesc;
	}
	public void setTradeOrderSceneDesc(String tradeOrderSceneDesc) {
		this.tradeOrderSceneDesc = tradeOrderSceneDesc;
	}

	public String getUseOrderNo() {
		return this.useOrderNo;
	}
	public void setUseOrderNo(String useOrderNo) {
		this.useOrderNo = useOrderNo;
	}

	public Date getUseTime() {
		return this.useTime;
	}
	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	public String getUseTradeNo() {
		return this.useTradeNo;
	}
	public void setUseTradeNo(String useTradeNo) {
		this.useTradeNo = useTradeNo;
	}

}
