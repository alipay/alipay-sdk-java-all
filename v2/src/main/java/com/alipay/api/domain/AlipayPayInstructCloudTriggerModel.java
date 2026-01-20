package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小指令发起收银
 *
 * @author auto create
 * @since 1.0, 2025-08-13 10:20:18
 */
public class AlipayPayInstructCloudTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 2841829455965146228L;

	/**
	 * 本次收款金额，单位（元）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * ABCP请求超时时间，单位毫秒，默认值为2 * 60 * 1000L(2分钟)超时，-1表示永不超时，可以根据业务情况修改
	 */
	@ApiField("bpaas_ipc_timeout")
	private String bpaasIpcTimeout;

	/**
	 * 收银类型，默认值：cashier
	 */
	@ApiField("cashier_type")
	private String cashierType;

	/**
	 * 控制本次调用执行的操作：
（1）show：发起收银，N设备唤起收银台
（2）pop：取消收银，N设备取消收银台
（3）update，保持收银台唤起，并更新收款金额
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 必需是cashier
	 */
	@ApiField("page")
	private String page;

	/**
	 * POS 设备唯一标识，建议取 POS 设备 SN 编号，保证每个设备唯一
	 */
	@ApiField("pos_id")
	private String posId;

	/**
	 * 外部订单号 tradeNo，可确认“快捷收款”、“收银员模式”是同一个订单
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBpaasIpcTimeout() {
		return this.bpaasIpcTimeout;
	}
	public void setBpaasIpcTimeout(String bpaasIpcTimeout) {
		this.bpaasIpcTimeout = bpaasIpcTimeout;
	}

	public String getCashierType() {
		return this.cashierType;
	}
	public void setCashierType(String cashierType) {
		this.cashierType = cashierType;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public String getPosId() {
		return this.posId;
	}
	public void setPosId(String posId) {
		this.posId = posId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
