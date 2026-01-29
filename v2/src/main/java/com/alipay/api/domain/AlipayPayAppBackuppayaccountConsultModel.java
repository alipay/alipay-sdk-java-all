package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询备用付款账号信息
 *
 * @author auto create
 * @since 1.0, 2025-12-19 11:07:42
 */
public class AlipayPayAppBackuppayaccountConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6371224899154399578L;

	/**
	 * 表示需要咨询备用付款账号的uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 调用来源方
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝userId，表示需要咨询备用付款账号的uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
