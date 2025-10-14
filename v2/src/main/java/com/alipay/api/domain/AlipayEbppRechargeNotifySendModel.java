package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送支付宝手机充值超时提醒与补偿
 *
 * @author auto create
 * @since 1.0, 2022-11-24 15:00:49
 */
public class AlipayEbppRechargeNotifySendModel extends AlipayObject {

	private static final long serialVersionUID = 6878455738557582874L;

	/**
	 * 充值面额或者优惠面额
	 */
	@ApiField("face_price")
	private String facePrice;

	/**
	 * 充值时间或者话费券有效时间
	 */
	@ApiField("gmt_charge")
	private String gmtCharge;

	/**
	 * 充值的手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 阿里通信通知类型
TX:超时提醒
BC:超时补偿
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 支付宝用户open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 充值交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getFacePrice() {
		return this.facePrice;
	}
	public void setFacePrice(String facePrice) {
		this.facePrice = facePrice;
	}

	public String getGmtCharge() {
		return this.gmtCharge;
	}
	public void setGmtCharge(String gmtCharge) {
		this.gmtCharge = gmtCharge;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
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
