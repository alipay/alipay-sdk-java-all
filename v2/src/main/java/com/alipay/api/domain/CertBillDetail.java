package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证账单详情
 *
 * @author auto create
 * @since 1.0, 2026-05-25 19:59:12
 */
public class CertBillDetail extends AlipayObject {

	private static final long serialVersionUID = 7531285771375614648L;

	/**
	 * 平台接收商家核销请求后的核销处理时间
	 */
	@ApiField("alipay_verify_time")
	private Date alipayVerifyTime;

	/**
	 * 支付宝平台的凭证ID。开发者可以通过凭证核销准备接口获取。
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 仅当商家自行发放的三方码情况下，非空
	 */
	@ApiField("code")
	private String code;

	/**
	 * 预计结算时间
	 */
	@ApiField("et_settle_time")
	private String etSettleTime;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商家商品编码
	 */
	@ApiField("m_item_id")
	private String mItemId;

	/**
	 * 商品门店编号
	 */
	@ApiField("m_shop_id")
	private String mShopId;

	/**
	 * 商家请求同步凭证核销状态接口时传入，即同步凭证核销状态接口的请求参数out_biz_no
	 */
	@ApiField("m_use_order_id")
	private String mUseOrderId;

	/**
	 * 表示商家出资补贴金额。单位：元
	 */
	@ApiField("merchant_discount")
	private String merchantDiscount;

	/**
	 * 表示商家设置的商品优惠，无实际出资，且不计入结算金额。
	 */
	@ApiField("merchant_promo")
	private String merchantPromo;

	/**
	 * 商家应得。单位：元。
	 */
	@ApiField("net_income")
	private String netIncome;

	/**
	 * 平台订单号，表示券售卖订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 券商品售价，单位：元
	 */
	@ApiField("origin_price")
	private String originPrice;

	/**
	 * 表示平台出资补贴金额。单位：元
	 */
	@ApiField("platform_discount")
	private String platformDiscount;

	/**
	 * 用户实付，指用户支付金额，不含商家、平台出资补贴。单位：元。
	 */
	@ApiField("real_pay")
	private String realPay;

	/**
	 * 券商品售价，单位：元
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 订单场景
	 */
	@ApiField("scene_name")
	private String sceneName;

	/**
	 * 次卡业务中表示唯一的一笔核销次序号。
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 当商家结算方式=结算到户，格式：支付宝账户|abc@alipay.com
当商家结算方式=结算到银行卡，格式：工商银行|****卡号末4位
	 */
	@ApiField("settle_account")
	private String settleAccount;

	/**
	 * 表示凭证核销后订单结算金额，未扣除平台技术服务费、三方交易佣金，当status=01时，表示预计结算金额。单位：元
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/**
	 * settle_type 为“USE”：代表“结算时间”；
settle_type 为“REFUND”：代表“退结算时间”
	 */
	@ApiField("settle_time")
	private Date settleTime;

	/**
	 * 账单流水类型
	 */
	@ApiField("settle_type")
	private String settleType;

	/**
	 * 结算状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 第三方交易佣金，如服务商代运营佣金，当status=01时，表示预计交易分佣金额。单位：元
	 */
	@ApiField("total_alloc_amount")
	private String totalAllocAmount;

	/**
	 * 平台技术服务费，当status=01时，表示预计平台服务费金额。单位：元
	 */
	@ApiField("total_commission_amount")
	private String totalCommissionAmount;

	/**
	 * settle_type 为“USE”：代表“核销时间”；
settle_type为“REFUND”：代表“退款时间” 当前字段已废弃(字段废弃，不建议使用)
	 */
	@ApiField("trade_time")
	@Deprecated
	private Date tradeTime;

	/**
	 * 门店ID
	 */
	@ApiField("use_shop_id")
	private String useShopId;

	/**
	 * 门店名称
	 */
	@ApiField("use_shop_name")
	private String useShopName;

	/**
	 * 核销人账号，格式：wsj***@alitest.xyz
	 */
	@ApiField("verify_op")
	private String verifyOp;

	/**
	 * 核销人名称
	 */
	@ApiField("verify_op_name")
	private String verifyOpName;

	/**
	 * 核销点ID
	 */
	@ApiField("verify_point_id")
	private String verifyPointId;

	/**
	 * 核销点名称
	 */
	@ApiField("verify_point_name")
	private String verifyPointName;

	/**
	 * 商家请求凭证核销接口时传入的时间，即同步凭证核销状态接口中的请求参数biz_dt
	 */
	@ApiField("verify_time")
	private Date verifyTime;

	public Date getAlipayVerifyTime() {
		return this.alipayVerifyTime;
	}
	public void setAlipayVerifyTime(Date alipayVerifyTime) {
		this.alipayVerifyTime = alipayVerifyTime;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getEtSettleTime() {
		return this.etSettleTime;
	}
	public void setEtSettleTime(String etSettleTime) {
		this.etSettleTime = etSettleTime;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getmItemId() {
		return this.mItemId;
	}
	public void setmItemId(String mItemId) {
		this.mItemId = mItemId;
	}

	public String getmShopId() {
		return this.mShopId;
	}
	public void setmShopId(String mShopId) {
		this.mShopId = mShopId;
	}

	public String getmUseOrderId() {
		return this.mUseOrderId;
	}
	public void setmUseOrderId(String mUseOrderId) {
		this.mUseOrderId = mUseOrderId;
	}

	public String getMerchantDiscount() {
		return this.merchantDiscount;
	}
	public void setMerchantDiscount(String merchantDiscount) {
		this.merchantDiscount = merchantDiscount;
	}

	public String getMerchantPromo() {
		return this.merchantPromo;
	}
	public void setMerchantPromo(String merchantPromo) {
		this.merchantPromo = merchantPromo;
	}

	public String getNetIncome() {
		return this.netIncome;
	}
	public void setNetIncome(String netIncome) {
		this.netIncome = netIncome;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public String getPlatformDiscount() {
		return this.platformDiscount;
	}
	public void setPlatformDiscount(String platformDiscount) {
		this.platformDiscount = platformDiscount;
	}

	public String getRealPay() {
		return this.realPay;
	}
	public void setRealPay(String realPay) {
		this.realPay = realPay;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSettleAccount() {
		return this.settleAccount;
	}
	public void setSettleAccount(String settleAccount) {
		this.settleAccount = settleAccount;
	}

	public String getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

	public Date getSettleTime() {
		return this.settleTime;
	}
	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotalAllocAmount() {
		return this.totalAllocAmount;
	}
	public void setTotalAllocAmount(String totalAllocAmount) {
		this.totalAllocAmount = totalAllocAmount;
	}

	public String getTotalCommissionAmount() {
		return this.totalCommissionAmount;
	}
	public void setTotalCommissionAmount(String totalCommissionAmount) {
		this.totalCommissionAmount = totalCommissionAmount;
	}

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getUseShopId() {
		return this.useShopId;
	}
	public void setUseShopId(String useShopId) {
		this.useShopId = useShopId;
	}

	public String getUseShopName() {
		return this.useShopName;
	}
	public void setUseShopName(String useShopName) {
		this.useShopName = useShopName;
	}

	public String getVerifyOp() {
		return this.verifyOp;
	}
	public void setVerifyOp(String verifyOp) {
		this.verifyOp = verifyOp;
	}

	public String getVerifyOpName() {
		return this.verifyOpName;
	}
	public void setVerifyOpName(String verifyOpName) {
		this.verifyOpName = verifyOpName;
	}

	public String getVerifyPointId() {
		return this.verifyPointId;
	}
	public void setVerifyPointId(String verifyPointId) {
		this.verifyPointId = verifyPointId;
	}

	public String getVerifyPointName() {
		return this.verifyPointName;
	}
	public void setVerifyPointName(String verifyPointName) {
		this.verifyPointName = verifyPointName;
	}

	public Date getVerifyTime() {
		return this.verifyTime;
	}
	public void setVerifyTime(Date verifyTime) {
		this.verifyTime = verifyTime;
	}

}
