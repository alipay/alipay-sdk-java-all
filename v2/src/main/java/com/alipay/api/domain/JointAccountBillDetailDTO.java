package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共同账户账单明细
 *
 * @author auto create
 * @since 1.0, 2023-06-29 19:37:22
 */
public class JointAccountBillDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 2484315948446837371L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 消费金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 账单业务号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 业务时间
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 订单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 1-退款，2-支付
	 */
	@ApiField("in_out")
	private String inOut;

	/**
	 * 共同账户消费的成员openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部交易单号，正向支付为外部交易单号，逆向退款是为外部退款单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 付款方资产信息
	 */
	@ApiField("payer_asset_info")
	private UserAssetInfoVO payerAssetInfo;

	/**
	 * 间连商户显示二级商户全名，直连、直付通则显示一级商户全名。企业商户该字段不脱敏，非企业商户该字段会脱敏
	 */
	@ApiField("seller_full_name")
	private String sellerFullName;

	/**
	 * 收款方登录号信息。间连商户显示二级商户的登录号信息；直连、直付通显示一级商户的登录号信息；该字段脱敏
	 */
	@ApiField("seller_logon_id")
	private String sellerLogonId;

	/**
	 * 账单标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 共同账户消费的成员ID
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

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getInOut() {
		return this.inOut;
	}
	public void setInOut(String inOut) {
		this.inOut = inOut;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public UserAssetInfoVO getPayerAssetInfo() {
		return this.payerAssetInfo;
	}
	public void setPayerAssetInfo(UserAssetInfoVO payerAssetInfo) {
		this.payerAssetInfo = payerAssetInfo;
	}

	public String getSellerFullName() {
		return this.sellerFullName;
	}
	public void setSellerFullName(String sellerFullName) {
		this.sellerFullName = sellerFullName;
	}

	public String getSellerLogonId() {
		return this.sellerLogonId;
	}
	public void setSellerLogonId(String sellerLogonId) {
		this.sellerLogonId = sellerLogonId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
