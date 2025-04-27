package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付子户开户
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:44:54
 */
public class AlipayCommerceLogisticsFreightflowSubaccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7345854628293528536L;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式。
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 唯一性区分
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 业务方自己的用户标识（类似于网商2266，主站相关的一般用支付宝2088开头的id）不要有中文
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 网点名称
	 */
	@ApiField("out_user_name")
	private String outUserName;

	/**
	 * 母户信息
	 */
	@ApiField("parent_info")
	private FreigtFlowAccount parentInfo;

	/**
	 * 如果mode为网商银行，则为网商银行分配
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getOutUserName() {
		return this.outUserName;
	}
	public void setOutUserName(String outUserName) {
		this.outUserName = outUserName;
	}

	public FreigtFlowAccount getParentInfo() {
		return this.parentInfo;
	}
	public void setParentInfo(FreigtFlowAccount parentInfo) {
		this.parentInfo = parentInfo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
