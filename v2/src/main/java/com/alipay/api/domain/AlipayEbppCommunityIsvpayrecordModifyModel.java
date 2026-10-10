package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 三方回写支付状态
 *
 * @author auto create
 * @since 1.0, 2026-09-29 15:35:57
 */
public class AlipayEbppCommunityIsvpayrecordModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8277812256341421374L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 创单时平台生成并传给服务商的统一单号，回写定位、校验、更新均以其为准
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 房屋外部户号
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 支付状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付单号, 创单SPI接口返回
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
