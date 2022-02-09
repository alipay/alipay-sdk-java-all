package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送流量接口
 *
 * @author auto create
 * @since 1.0, 2018-11-13 21:00:10
 */
public class AlipayEbppRechargeFlowSendModel extends AlipayObject {

	private static final long serialVersionUID = 8698114399961535178L;

	/**
	 * 绑定手机号
	 */
	@ApiField("bind_mobile")
	private String bindMobile;

	/**
	 * 扩展信息，json字符串
	 */
	@ApiField("ext_msg")
	private String extMsg;

	/**
	 * 移动兑换流量产品码
	 */
	@ApiField("trade_code")
	private String tradeCode;

	/**
	 * 兑换流量的外部订单号
	 */
	@ApiField("trade_id")
	private String tradeId;

	/**
	 * 兑换交易时间
	 */
	@ApiField("trade_time")
	private String tradeTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBindMobile() {
		return this.bindMobile;
	}
	public void setBindMobile(String bindMobile) {
		this.bindMobile = bindMobile;
	}

	public String getExtMsg() {
		return this.extMsg;
	}
	public void setExtMsg(String extMsg) {
		this.extMsg = extMsg;
	}

	public String getTradeCode() {
		return this.tradeCode;
	}
	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
