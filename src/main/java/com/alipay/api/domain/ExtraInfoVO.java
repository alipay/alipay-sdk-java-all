package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关系的扩展信息
 *
 * @author auto create
 * @since 1.0, 2017-08-18 16:52:40
 */
public class ExtraInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1864623169315119642L;

	/**
	 * 是否是taomaomao好友关系
	 */
	@ApiField("maomao_friend")
	private Boolean maomaoFriend;

	/**
	 * 是否注册taomaomao游戏
	 */
	@ApiField("maomao_register")
	private Boolean maomaoRegister;

	/**
	 * 支付宝对应的taobao_id
	 */
	@ApiField("taobao_id")
	private String taobaoId;

	public Boolean getMaomaoFriend() {
		return this.maomaoFriend;
	}
	public void setMaomaoFriend(Boolean maomaoFriend) {
		this.maomaoFriend = maomaoFriend;
	}

	public Boolean getMaomaoRegister() {
		return this.maomaoRegister;
	}
	public void setMaomaoRegister(Boolean maomaoRegister) {
		this.maomaoRegister = maomaoRegister;
	}

	public String getTaobaoId() {
		return this.taobaoId;
	}
	public void setTaobaoId(String taobaoId) {
		this.taobaoId = taobaoId;
	}

}
