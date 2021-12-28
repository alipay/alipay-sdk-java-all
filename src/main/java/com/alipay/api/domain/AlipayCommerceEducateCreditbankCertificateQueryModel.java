package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 培训证书查询接口
 *
 * @author auto create
 * @since 1.0, 2021-03-30 17:58:41
 */
public class AlipayCommerceEducateCreditbankCertificateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3229958144783696241L;

	/**
	 * 学分银行用户ID
	 */
	@ApiField("cb_id")
	private String cbId;

	/**
	 * 渠道，默认值：shcreditbank(上海学分银行)
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCbId() {
		return this.cbId;
	}
	public void setCbId(String cbId) {
		this.cbId = cbId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
