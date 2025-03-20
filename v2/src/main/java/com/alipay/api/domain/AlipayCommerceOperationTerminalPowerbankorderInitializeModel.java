package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备订单创建
 *
 * @author auto create
 * @since 1.0, 2022-12-30 20:07:16
 */
public class AlipayCommerceOperationTerminalPowerbankorderInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 6428843378658836925L;

	/**
	 * 预授权单号，通过线上资金授权冻结接口获取
	 */
	@ApiField("auth_id")
	private String authId;

	/**
	 * OpenId是用户（user_id）在应用（AppId）下的唯一用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部订单编号，唯一标识一个商户预授权订单，商户维度下外部订单号唯一。
	 */
	@ApiField("out_trade_id")
	private String outTradeId;

	/**
	 * 商户设备sn。设备必须已经完成进件，上报未进件设备的订单接口会报错
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAuthId() {
		return this.authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutTradeId() {
		return this.outTradeId;
	}
	public void setOutTradeId(String outTradeId) {
		this.outTradeId = outTradeId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
