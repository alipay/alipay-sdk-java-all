package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询消耗明细列表
 *
 * @author auto create
 * @since 1.0, 2025-01-07 11:36:55
 */
public class PrincipalFinanceDetail extends AlipayObject {

	private static final long serialVersionUID = 8132215782668788778L;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 时间格式yyyy-MM-dd
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 现金金额，单位：元
	 */
	@ApiField("cash_amount_format")
	private String cashAmountFormat;

	/**
	 * 授信金额，单位：元
	 */
	@ApiField("credit_amount_format")
	private String creditAmountFormat;

	/**
	 * 扣款金额，单位：元
	 */
	@ApiField("cut_amount_format")
	private String cutAmountFormat;

	/**
	 * 商家名称
	 */
	@ApiField("principal_name")
	private String principalName;

	/**
	 * 红包金额(计入业绩部分)，单位：元
	 */
	@ApiField("rebate_red_packet_amount_format")
	private String rebateRedPacketAmountFormat;

	/**
	 * 红包金额，单位：元
	 */
	@ApiField("red_packet_amount_format")
	private String redPacketAmountFormat;

	/**
	 * 投放产品名称
	 */
	@ApiField("scene_type_name")
	private String sceneTypeName;

	/**
	 * 消耗类型
	 */
	@ApiField("sell_mode_name")
	private String sellModeName;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getCashAmountFormat() {
		return this.cashAmountFormat;
	}
	public void setCashAmountFormat(String cashAmountFormat) {
		this.cashAmountFormat = cashAmountFormat;
	}

	public String getCreditAmountFormat() {
		return this.creditAmountFormat;
	}
	public void setCreditAmountFormat(String creditAmountFormat) {
		this.creditAmountFormat = creditAmountFormat;
	}

	public String getCutAmountFormat() {
		return this.cutAmountFormat;
	}
	public void setCutAmountFormat(String cutAmountFormat) {
		this.cutAmountFormat = cutAmountFormat;
	}

	public String getPrincipalName() {
		return this.principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getRebateRedPacketAmountFormat() {
		return this.rebateRedPacketAmountFormat;
	}
	public void setRebateRedPacketAmountFormat(String rebateRedPacketAmountFormat) {
		this.rebateRedPacketAmountFormat = rebateRedPacketAmountFormat;
	}

	public String getRedPacketAmountFormat() {
		return this.redPacketAmountFormat;
	}
	public void setRedPacketAmountFormat(String redPacketAmountFormat) {
		this.redPacketAmountFormat = redPacketAmountFormat;
	}

	public String getSceneTypeName() {
		return this.sceneTypeName;
	}
	public void setSceneTypeName(String sceneTypeName) {
		this.sceneTypeName = sceneTypeName;
	}

	public String getSellModeName() {
		return this.sellModeName;
	}
	public void setSellModeName(String sellModeName) {
		this.sellModeName = sellModeName;
	}

}
