package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大额无限付产品个人签约
 *
 * @author auto create
 * @since 1.0, 2021-03-23 11:23:33
 */
public class AlipayTradeServiceSignModel extends AlipayObject {

	private static final long serialVersionUID = 2867693797456238292L;

	/**
	 * 用户发生协议签约的设备终端标识，支付宝分配，目前支持PC/APP
	 */
	@ApiField("access_channel")
	private String accessChannel;

	/**
	 * 用户的支付宝id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 服务对应的业务场景,由支付宝分配. 枚举值列表:
LARGE_INFINITE_V2:无限付2.0;
YUEBAO_TRANSFER:余额宝大额申购;
AD_CHARGE:灯火平台广告费充值;
PERSONAL_ACCOUNT_RECHARGE:灯火平台广告费充值;
ETC_B2B:区块链ETC_B2B
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 用户在商户网站的会员登录标识
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/**
	 * 用户在商户网站的会员标识
	 */
	@ApiField("external_user_id")
	private String externalUserId;

	/**
	 * 子业务场景，由支付宝分配.枚举值列表:
1.ACS模式:
2.FUND_ACCOUNT:场景余额
3.SHBANK:上海银行
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getAccessChannel() {
		return this.accessChannel;
	}
	public void setAccessChannel(String accessChannel) {
		this.accessChannel = accessChannel;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExternalLogonId() {
		return this.externalLogonId;
	}
	public void setExternalLogonId(String externalLogonId) {
		this.externalLogonId = externalLogonId;
	}

	public String getExternalUserId() {
		return this.externalUserId;
	}
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
