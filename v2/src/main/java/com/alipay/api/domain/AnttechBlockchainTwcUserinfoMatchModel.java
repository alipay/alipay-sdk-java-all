package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息匹配
 *
 * @author auto create
 * @since 1.0, 2020-09-11 11:25:33
 */
public class AnttechBlockchainTwcUserinfoMatchModel extends AlipayObject {

	private static final long serialVersionUID = 6552944143238253486L;

	/**
	 * 支付宝的UID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 移动号码hash后的字符串
	 */
	@ApiField("call_no_hash")
	private String callNoHash;

	/**
	 * 注册使用的用户名
	 */
	@ApiField("unify_no")
	private String unifyNo;

	/**
	 * 名字证件号对应的sha256的hash值
	 */
	@ApiField("unify_no_hash")
	private String unifyNoHash;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCallNoHash() {
		return this.callNoHash;
	}
	public void setCallNoHash(String callNoHash) {
		this.callNoHash = callNoHash;
	}

	public String getUnifyNo() {
		return this.unifyNo;
	}
	public void setUnifyNo(String unifyNo) {
		this.unifyNo = unifyNo;
	}

	public String getUnifyNoHash() {
		return this.unifyNoHash;
	}
	public void setUnifyNoHash(String unifyNoHash) {
		this.unifyNoHash = unifyNoHash;
	}

}
