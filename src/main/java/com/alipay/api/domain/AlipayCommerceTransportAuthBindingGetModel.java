package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询授权状态
 *
 * @author auto create
 * @since 1.0, 2022-10-27 14:18:13
 */
public class AlipayCommerceTransportAuthBindingGetModel extends AlipayObject {

	private static final long serialVersionUID = 2766196845218428698L;

	/**
	 * 支付宝证件类型
	 */
	@ApiField("alipay_cert_type")
	private String alipayCertType;

	/**
	 * 业务方证件类型。例如NI表示机票授权场景下的身份证类型
	 */
	@ApiField("biz_cert_type")
	private String bizCertType;

	/**
	 * 证件号。证件类型对应的号码。当传入证件类型时，必须填本字段。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型。取值枚举需要找开发人员咨询。例如IDENTITY_CARD表示身份证（已废弃，请使用biz_cert_type）
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 查询授权的渠道，如小程序首页：MINIAPP_HOME，订单同步：ORDER_SYNC
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 蚂蚁统一会员ID（对外）。当没有传证件类型时，必须传本字段。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号，唯一标志本次请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 授权场景，标志具体是哪种授权数据。具体取值需要找开发人员分配。例如机票行程授权场景取值为FLIGHT_SCHEDULE_PLUG_AUTH
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 蚂蚁统一会员ID。当没有传证件类型时，必须传本字段。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayCertType() {
		return this.alipayCertType;
	}
	public void setAlipayCertType(String alipayCertType) {
		this.alipayCertType = alipayCertType;
	}

	public String getBizCertType() {
		return this.bizCertType;
	}
	public void setBizCertType(String bizCertType) {
		this.bizCertType = bizCertType;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
