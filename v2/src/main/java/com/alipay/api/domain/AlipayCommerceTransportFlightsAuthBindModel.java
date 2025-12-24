package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权绑定关系绑定
 *
 * @author auto create
 * @since 1.0, 2025-09-04 13:46:45
 */
public class AlipayCommerceTransportFlightsAuthBindModel extends AlipayObject {

	private static final long serialVersionUID = 5275985263144515726L;

	/**
	 * 授权码主体用于授权对象范围，当字段不为空时，表示仅授权特定航旅航司；若字段值为空，则表示一键授权所有航旅航司
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 授权场景
	 */
	@ApiField("auth_scene")
	private String authScene;

	/**
	 * 是否自动授权
	 */
	@ApiField("auto_auth")
	private Boolean autoAuth;

	/**
	 * 是否取消全部场景
	 */
	@ApiField("cancel_all")
	private Boolean cancelAll;

	/**
	 * 授权的渠道，如小程序首页：MINIAPP_HOME
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 操作类型，限定取值：binded / unbinded
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 外部业务号，唯一标志本次请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthScene() {
		return this.authScene;
	}
	public void setAuthScene(String authScene) {
		this.authScene = authScene;
	}

	public Boolean getAutoAuth() {
		return this.autoAuth;
	}
	public void setAutoAuth(Boolean autoAuth) {
		this.autoAuth = autoAuth;
	}

	public Boolean getCancelAll() {
		return this.cancelAll;
	}
	public void setCancelAll(Boolean cancelAll) {
		this.cancelAll = cancelAll;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
