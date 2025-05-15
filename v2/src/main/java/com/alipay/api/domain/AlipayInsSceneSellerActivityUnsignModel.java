package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解约
 *
 * @author auto create
 * @since 1.0, 2017-10-27 18:12:10
 */
public class AlipayInsSceneSellerActivityUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 8678715199691421263L;

	/**
	 * 渠道账号对应的uid，如果证据类型字段没填则必填
	 */
	@ApiField("channel_account_id")
	private String channelAccountId;

	/**
	 * 渠道账号类型,如果证据类型字段没填则必填1:支付宝账号 2:淘宝账号
	 */
	@ApiField("channel_account_type")
	private String channelAccountType;

	/**
	 * 解约的相关产品编号
	 */
	@ApiField("sp_code")
	private String spCode;

	public String getChannelAccountId() {
		return this.channelAccountId;
	}
	public void setChannelAccountId(String channelAccountId) {
		this.channelAccountId = channelAccountId;
	}

	public String getChannelAccountType() {
		return this.channelAccountType;
	}
	public void setChannelAccountType(String channelAccountType) {
		this.channelAccountType = channelAccountType;
	}

	public String getSpCode() {
		return this.spCode;
	}
	public void setSpCode(String spCode) {
		this.spCode = spCode;
	}

}
