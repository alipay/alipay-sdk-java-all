package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘系商户续订购花呗合约
 *
 * @author auto create
 * @since 1.0, 2020-07-01 09:44:14
 */
public class AlipayPcreditHuabeiPcreditmerchantProductorderDelayModel extends AlipayObject {

	private static final long serialVersionUID = 8794432589463777896L;

	/**
	 * 非业务数据
	 */
	@ApiField("extending_info")
	private String extendingInfo;

	/**
	 * 请求APP
	 */
	@ApiField("from_app")
	private String fromApp;

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

	/**
	 * 续订系统码，用于标识订购花呗产品的系统
	 */
	@ApiField("renew_system_code")
	private String renewSystemCode;

	/**
	 * 续订发生时间
	 */
	@ApiField("renewing_datetime")
	private String renewingDatetime;

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

	public String getRenewSystemCode() {
		return this.renewSystemCode;
	}
	public void setRenewSystemCode(String renewSystemCode) {
		this.renewSystemCode = renewSystemCode;
	}

	public String getRenewingDatetime() {
		return this.renewingDatetime;
	}
	public void setRenewingDatetime(String renewingDatetime) {
		this.renewingDatetime = renewingDatetime;
	}

}
