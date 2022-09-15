package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * hellobike用户参与月卡打折活动行为日志回流接口
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:38:29
 */
public class AlipayDataDataserviceHellobikeLogSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2596158233795388524L;

	/**
	 * 业务类型，表示用户在参与hellobike月卡打折活动中发生的业务操作（领券和购买月卡）；有两个枚举值：getvoucher:领券；pay:购买月卡；该参数由hellobike调用方所执行的业务操作确定取值。
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 用户购买hellobike月卡的渠道，目前有两种：alipay_tinyapp:小程序, hellobike_app:hellobike客户端，该参数取值为hellobike调用方自身的业务参数。
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市编码，国标码，hellobike定位到的用户当前所在城市，该参数由hellobike调用方定位用户当前所在城市得到。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 用户在hellobike购买月卡的实际金额，单位为分；action_type=pay的时候必传，其他场景不必传；该参数取值为hellobike调用方自身的业务参数。
	 */
	@ApiField("pay_price_cent")
	private Long payPriceCent;

	/**
	 * 用户购买hellobike月卡时使用的支付方式，目前和hellobike约定的几种支付方式为：alipay_account:支付宝支付，hellobike_account:hellobike余额，weixin_pay:微信支付；该参数取值为hellobike调用方自身的业务参数。
	 */
	@ApiField("pay_tool")
	private String payTool;

	/**
	 * 用户参与一次月卡打折活动的业务标识，需要唯一。通过该业务标识串联用户在一次月卡打折活动中的涉及的关键业务流程（调用alipay.data.aiservice.smartprice.get接口获取用户购买月卡的活动价格、领取折扣券、购买月卡3个业务流程），该参数由hellobike业务端生成该id并在上述3个业务流程推进过程中存储记录该id。
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * 蚂蚁统一会员ID，作为用户标识，该参数可通过alipay.user.info.share接口获取。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Long getPayPriceCent() {
		return this.payPriceCent;
	}
	public void setPayPriceCent(Long payPriceCent) {
		this.payPriceCent = payPriceCent;
	}

	public String getPayTool() {
		return this.payTool;
	}
	public void setPayTool(String payTool) {
		this.payTool = payTool;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
