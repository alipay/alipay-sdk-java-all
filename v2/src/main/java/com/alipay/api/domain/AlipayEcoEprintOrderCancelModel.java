package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 易联云取消单条未打印订单对外接口服务
 *
 * @author auto create
 * @since 1.0, 2019-09-06 17:54:22
 */
public class AlipayEcoEprintOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1725978977131398733L;

	/**
	 * 应用ID
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 应用Secret
	 */
	@ApiField("client_secret")
	private String clientSecret;

	/**
	 * 应用访问凭证
	 */
	@ApiField("eprint_token")
	private String eprintToken;

	/**
	 * 终端号
	 */
	@ApiField("machine_code")
	private String machineCode;

	/**
	 * 待取消订单Id，云平台端订单Id
	 */
	@ApiField("order_id")
	private String orderId;

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return this.clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getEprintToken() {
		return this.eprintToken;
	}
	public void setEprintToken(String eprintToken) {
		this.eprintToken = eprintToken;
	}

	public String getMachineCode() {
		return this.machineCode;
	}
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
