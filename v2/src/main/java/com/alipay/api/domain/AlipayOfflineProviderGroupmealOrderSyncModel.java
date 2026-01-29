package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N设备碰一下就餐订单上报
 *
 * @author auto create
 * @since 1.0, 2025-09-29 15:17:43
 */
public class AlipayOfflineProviderGroupmealOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8374846766657383896L;

	/**
	 * 开通企业码后的共享账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 商家侧订单实际金额，金额单位:元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 设备的SN信息
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 商家侧订单优惠金额，金额单位：元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 企业码生成的企业ID，企业码用户产生的该字段必须传，否则影响企业码返佣
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 订单所包含的商品名称
	 */
	@ApiField("good_name")
	private String goodName;

	/**
	 * 服务商pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 商户小程序对应的订单详情页路径地址 value。仅需传入小程序页面路径即可。小程序页面路径规则见请求参数示例-小程序页面url说明
	 */
	@ApiField("merchant_order_link_page")
	private String merchantOrderLinkPage;

	/**
	 * 订单的状态
	 */
	@ApiField("merchant_order_status")
	private String merchantOrderStatus;

	/**
	 * 商家pid信息
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 商户小程序对应的充值页路径地址 value。仅需传入小程序页面路径即可。小程序页面路径规则见请求参数示例-小程序页面url说明
	 */
	@ApiField("merchant_recharge_link_page")
	private String merchantRechargeLinkPage;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单业务扩展信息
	 */
	@ApiField("order_business_info")
	private OrderBusinessInfo orderBusinessInfo;

	/**
	 * 商家侧订单实际创建时间，时间格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单修改时间，时间格式为 yyyy-MM-dd HH:mm:ss，订单状态或内容发生变更时需要同步更新该时间。
	 */
	@ApiField("order_modified_time")
	private Date orderModifiedTime;

	/**
	 * 商家侧订单实际支付时间，时间格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_pay_time")
	private Date orderPayTime;

	/**
	 * 企业/高校库ID，对应orgId 或 logidGroupid
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 外部订单号。由商家自定义。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商家侧订单实际支付金额，金额单位为元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付时的支付类别
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 用于记录支付所需的凭证信息，比如28码
	 */
	@ApiField("payment_voucher")
	private String paymentVoucher;

	/**
	 * 商家小程序appId
	 */
	@ApiField("tiny_app_id")
	private String tinyAppId;

	/**
	 * 商家侧订单使用支付宝支付时，对应的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getGoodName() {
		return this.goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getMerchantOrderLinkPage() {
		return this.merchantOrderLinkPage;
	}
	public void setMerchantOrderLinkPage(String merchantOrderLinkPage) {
		this.merchantOrderLinkPage = merchantOrderLinkPage;
	}

	public String getMerchantOrderStatus() {
		return this.merchantOrderStatus;
	}
	public void setMerchantOrderStatus(String merchantOrderStatus) {
		this.merchantOrderStatus = merchantOrderStatus;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getMerchantRechargeLinkPage() {
		return this.merchantRechargeLinkPage;
	}
	public void setMerchantRechargeLinkPage(String merchantRechargeLinkPage) {
		this.merchantRechargeLinkPage = merchantRechargeLinkPage;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public OrderBusinessInfo getOrderBusinessInfo() {
		return this.orderBusinessInfo;
	}
	public void setOrderBusinessInfo(OrderBusinessInfo orderBusinessInfo) {
		this.orderBusinessInfo = orderBusinessInfo;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderModifiedTime() {
		return this.orderModifiedTime;
	}
	public void setOrderModifiedTime(Date orderModifiedTime) {
		this.orderModifiedTime = orderModifiedTime;
	}

	public Date getOrderPayTime() {
		return this.orderPayTime;
	}
	public void setOrderPayTime(Date orderPayTime) {
		this.orderPayTime = orderPayTime;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentVoucher() {
		return this.paymentVoucher;
	}
	public void setPaymentVoucher(String paymentVoucher) {
		this.paymentVoucher = paymentVoucher;
	}

	public String getTinyAppId() {
		return this.tinyAppId;
	}
	public void setTinyAppId(String tinyAppId) {
		this.tinyAppId = tinyAppId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
