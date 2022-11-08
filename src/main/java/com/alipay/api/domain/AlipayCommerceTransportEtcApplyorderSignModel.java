package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC订单代扣协议签约
 *
 * @author auto create
 * @since 1.0, 2022-06-30 20:39:17
 */
public class AlipayCommerceTransportEtcApplyorderSignModel extends AlipayObject {

	private static final long serialVersionUID = 2818866464733365281L;

	/**
	 * 外部宿主商户（ISV）的appid
	 */
	@ApiField("agent_appid")
	private String agentAppid;

	/**
	 * 外部宿主商户（ISV）的pid
	 */
	@ApiField("agent_pid")
	private String agentPid;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 发行方ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 签约完成后的承接页链接（宿主原页面）
	 */
	@ApiField("sign_return_url")
	private String signReturnUrl;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 是否同步到车档案标识
	 */
	@ApiField("vehicle_info_sync_flag")
	private Boolean vehicleInfoSyncFlag;

	public String getAgentAppid() {
		return this.agentAppid;
	}
	public void setAgentAppid(String agentAppid) {
		this.agentAppid = agentAppid;
	}

	public String getAgentPid() {
		return this.agentPid;
	}
	public void setAgentPid(String agentPid) {
		this.agentPid = agentPid;
	}

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSignReturnUrl() {
		return this.signReturnUrl;
	}
	public void setSignReturnUrl(String signReturnUrl) {
		this.signReturnUrl = signReturnUrl;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Boolean getVehicleInfoSyncFlag() {
		return this.vehicleInfoSyncFlag;
	}
	public void setVehicleInfoSyncFlag(Boolean vehicleInfoSyncFlag) {
		this.vehicleInfoSyncFlag = vehicleInfoSyncFlag;
	}

}
