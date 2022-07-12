package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换流量结果查询
 *
 * @author auto create
 * @since 1.0, 2018-11-13 20:59:54
 */
public class AlipayEbppFlowStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5421177876513348514L;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_msg")
	private String extMsg;

	/**
	 * 内部订单号
	 */
	@ApiField("merchant_order_id")
	private String merchantOrderId;

	/**
	 * 手机号码，15158886666
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 外部交易号
	 */
	@ApiField("trade_id")
	private String tradeId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getExtMsg() {
		return this.extMsg;
	}
	public void setExtMsg(String extMsg) {
		this.extMsg = extMsg;
	}

	public String getMerchantOrderId() {
		return this.merchantOrderId;
	}
	public void setMerchantOrderId(String merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
