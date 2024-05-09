package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景支付参与者业务参数模型
 *
 * @author auto create
 * @since 1.0, 2024-04-02 14:32:15
 */
public class ScenePayParticipantBizParamDTO extends AlipayObject {

	private static final long serialVersionUID = 8737694714586514273L;

	/**
	 * 由各业务场景定义，具体参考场景解决方案接入文档
	 */
	@ApiField("authorization_id")
	private String authorizationId;

	/**
	 * 外部用户的证件号码，若证件类型为身份证，那么填入身份证号码即可
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 外部用户的证件类型，例如身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 国家局医保一码付场景使用，用于标识签约渠道id
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 外部卡号
	 */
	@ApiField("out_card_no")
	private String outCardNo;

	/**
	 * 外部用户的姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAuthorizationId() {
		return this.authorizationId;
	}
	public void setAuthorizationId(String authorizationId) {
		this.authorizationId = authorizationId;
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

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getOutCardNo() {
		return this.outCardNo;
	}
	public void setOutCardNo(String outCardNo) {
		this.outCardNo = outCardNo;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
