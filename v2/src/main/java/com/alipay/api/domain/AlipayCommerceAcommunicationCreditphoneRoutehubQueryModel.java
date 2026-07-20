package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用购运营商侧统一查询接口
 *
 * @author auto create
 * @since 1.0, 2026-07-20 16:32:51
 */
public class AlipayCommerceAcommunicationCreditphoneRoutehubQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4338663874954753262L;

	/**
	 * 机构PID
	 */
	@ApiField("inst_pid")
	private String instPid;

	/**
	 * 运营商侧订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 查询类型
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 请求流水号（TRANSFER、TRANSFER_REFUND、UNBIND）
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 交易流水号（SIGN、TRANSFER_REFUND、UNBIND）
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getInstPid() {
		return this.instPid;
	}
	public void setInstPid(String instPid) {
		this.instPid = instPid;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
