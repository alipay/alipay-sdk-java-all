package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 闪蝶用户信息
 *
 * @author auto create
 * @since 1.0, 2019-12-10 16:02:33
 */
public class MorphoUser extends AlipayObject {

	private static final long serialVersionUID = 3755749466381365551L;

	/**
	 * 闪蝶侧用户ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 用户花名
	 */
	@ApiField("nick")
	private String nick;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

}
