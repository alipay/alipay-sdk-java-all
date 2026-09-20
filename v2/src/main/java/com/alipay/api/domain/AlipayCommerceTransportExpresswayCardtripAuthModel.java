package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝高速行程消息授权接口
 *
 * @author auto create
 * @since 1.0, 2026-08-24 14:25:20
 */
public class AlipayCommerceTransportExpresswayCardtripAuthModel extends AlipayObject {

	private static final long serialVersionUID = 6368535384726125547L;

	/**
	 * 渠道商身份标识
	 */
	@ApiField("channel_isv_id")
	private String channelIsvId;

	/**
	 * 渠道商侧开通授权号，需在商户纬度唯一
	 */
	@ApiField("channel_out_biz_no")
	private String channelOutBizNo;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	public String getChannelIsvId() {
		return this.channelIsvId;
	}
	public void setChannelIsvId(String channelIsvId) {
		this.channelIsvId = channelIsvId;
	}

	public String getChannelOutBizNo() {
		return this.channelOutBizNo;
	}
	public void setChannelOutBizNo(String channelOutBizNo) {
		this.channelOutBizNo = channelOutBizNo;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

}
