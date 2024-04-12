package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行订单关闭接口
 *
 * @author auto create
 * @since 1.0, 2023-01-05 15:06:34
 */
public class MybankPaymentTradeBusinessOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 5348625395624177989L;

	/**
	 * 创建订单时返回的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单创建的外部平台的单据号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 网商用户信息ID，一般是银行卡或者会员ID
	 */
	@ApiField("user_info_id")
	private String userInfoId;

	/**
	 * 网商用户类型
	 */
	@ApiField("user_info_type")
	private String userInfoType;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getUserInfoId() {
		return this.userInfoId;
	}
	public void setUserInfoId(String userInfoId) {
		this.userInfoId = userInfoId;
	}

	public String getUserInfoType() {
		return this.userInfoType;
	}
	public void setUserInfoType(String userInfoType) {
		this.userInfoType = userInfoType;
	}

}
