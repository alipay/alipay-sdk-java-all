package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘宝订购关系迁移
 *
 * @author auto create
 * @since 1.0, 2024-08-02 11:08:04
 */
public class AlipayPcreditHuabeiPcreditmerchantProductorderTransferModel extends AlipayObject {

	private static final long serialVersionUID = 6392884999629612273L;

	/**
	 * 生效时间
	 */
	@ApiField("active_datetime")
	private String activeDatetime;

	/**
	 * 补充字段
	 */
	@ApiField("extending_info")
	private String extendingInfo;

	/**
	 * 应用来源
	 */
	@ApiField("from_app")
	private String fromApp;

	/**
	 * 失效时间
	 */
	@ApiField("inactive_datetime")
	private String inactiveDatetime;

	/**
	 * 退订接受时间
	 */
	@ApiField("inactiving_datetime")
	private String inactivingDatetime;

	/**
	 * 订购原来
	 */
	@ApiField("ordered_channel")
	private String orderedChannel;

	/**
	 * 订购系统码
	 */
	@ApiField("ordered_system_code")
	private String orderedSystemCode;

	/**
	 * 接受订购时间
	 */
	@ApiField("ordering_datetime")
	private String orderingDatetime;

	/**
	 * 外部商户ID
	 */
	@ApiField("out_merchant_id")
	private String outMerchantId;

	/**
	 * 商户支付宝ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 销售产品码
	 */
	@ApiField("ps_code")
	private String psCode;

	/**
	 * 续订标志
	 */
	@ApiField("renew")
	private String renew;

	/**
	 * 原淘宝服务市场订购单号
	 */
	@ApiField("taobao_order_id")
	private String taobaoOrderId;

	public String getActiveDatetime() {
		return this.activeDatetime;
	}
	public void setActiveDatetime(String activeDatetime) {
		this.activeDatetime = activeDatetime;
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

	public String getInactiveDatetime() {
		return this.inactiveDatetime;
	}
	public void setInactiveDatetime(String inactiveDatetime) {
		this.inactiveDatetime = inactiveDatetime;
	}

	public String getInactivingDatetime() {
		return this.inactivingDatetime;
	}
	public void setInactivingDatetime(String inactivingDatetime) {
		this.inactivingDatetime = inactivingDatetime;
	}

	public String getOrderedChannel() {
		return this.orderedChannel;
	}
	public void setOrderedChannel(String orderedChannel) {
		this.orderedChannel = orderedChannel;
	}

	public String getOrderedSystemCode() {
		return this.orderedSystemCode;
	}
	public void setOrderedSystemCode(String orderedSystemCode) {
		this.orderedSystemCode = orderedSystemCode;
	}

	public String getOrderingDatetime() {
		return this.orderingDatetime;
	}
	public void setOrderingDatetime(String orderingDatetime) {
		this.orderingDatetime = orderingDatetime;
	}

	public String getOutMerchantId() {
		return this.outMerchantId;
	}
	public void setOutMerchantId(String outMerchantId) {
		this.outMerchantId = outMerchantId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPsCode() {
		return this.psCode;
	}
	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

	public String getRenew() {
		return this.renew;
	}
	public void setRenew(String renew) {
		this.renew = renew;
	}

	public String getTaobaoOrderId() {
		return this.taobaoOrderId;
	}
	public void setTaobaoOrderId(String taobaoOrderId) {
		this.taobaoOrderId = taobaoOrderId;
	}

}
