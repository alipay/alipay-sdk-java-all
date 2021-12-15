package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘系商家取消花呗合约订购
 *
 * @author auto create
 * @since 1.0, 2020-07-01 09:44:05
 */
public class AlipayPcreditHuabeiPcreditmerchantProductorderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5842757464895324376L;

	/**
	 * 合约退订业务场景
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 退订系统码，标志退订业务来源，用于确定退订流程
	 */
	@ApiField("cancel_system_code")
	private String cancelSystemCode;

	/**
	 * 退订类型
	 */
	@ApiField("cancel_type")
	private String cancelType;

	/**
	 * 纯透传风控数据，由调用上游与AGDS约定好
	 */
	@ApiField("extending_info")
	private String extendingInfo;

	/**
	 * 请求APP
	 */
	@ApiField("from_app")
	private String fromApp;

	/**
	 * 退订备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 订购单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户ID
	 */
	@ApiField("pid")
	private String pid;

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getCancelSystemCode() {
		return this.cancelSystemCode;
	}
	public void setCancelSystemCode(String cancelSystemCode) {
		this.cancelSystemCode = cancelSystemCode;
	}

	public String getCancelType() {
		return this.cancelType;
	}
	public void setCancelType(String cancelType) {
		this.cancelType = cancelType;
	}

	public String getExtendingInfo() {
		return this.extendingInfo;
	}
	public void setExtendingInfo(String extendingInfo) {
		this.extendingInfo = extendingInfo;
	}

	public String getFromApp() {
		return this.fromApp;
	}
	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
