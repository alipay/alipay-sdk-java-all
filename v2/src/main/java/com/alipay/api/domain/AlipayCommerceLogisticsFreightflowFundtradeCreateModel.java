package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付收银台资金支付创单
 *
 * @author auto create
 * @since 1.0, 2025-07-02 19:17:32
 */
public class AlipayCommerceLogisticsFreightflowFundtradeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3272826273897441688L;

	/**
	 * 商户需要保证业务流水号的唯一性，运企付内部通过业务流水号进行幂等处理
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 可填写网点信息+具体的动作
	 */
	@ApiField("body")
	private String body;

	/**
	 * 币种,人民币为CNY
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 与运企付约定的物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 备注（可填写订单描述信息）
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 银行管理模式
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 网商银行应用id,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_app_id")
	private String mybankAppId;

	/**
	 * 网商银行分配的合作方机构号
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 关单时间2024-06-18 15:12:36
	 */
	@ApiField("pay_expire_time")
	private String payExpireTime;

	/**
	 * 收款方户名
	 */
	@ApiField("payee_card_name")
	private String payeeCardName;

	/**
	 * 收款方卡号
	 */
	@ApiField("payee_id")
	private String payeeId;

	/**
	 * 订单总金额,单位:分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getMybankAppId() {
		return this.mybankAppId;
	}
	public void setMybankAppId(String mybankAppId) {
		this.mybankAppId = mybankAppId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayExpireTime() {
		return this.payExpireTime;
	}
	public void setPayExpireTime(String payExpireTime) {
		this.payExpireTime = payExpireTime;
	}

	public String getPayeeCardName() {
		return this.payeeCardName;
	}
	public void setPayeeCardName(String payeeCardName) {
		this.payeeCardName = payeeCardName;
	}

	public String getPayeeId() {
		return this.payeeId;
	}
	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
