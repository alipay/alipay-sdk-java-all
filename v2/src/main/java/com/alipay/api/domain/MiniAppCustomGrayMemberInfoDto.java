package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序灰度用户信息
 *
 * @author auto create
 * @since 1.0, 2023-01-04 16:46:42
 */
public class MiniAppCustomGrayMemberInfoDto extends AlipayObject {

	private static final long serialVersionUID = 7738192965374851126L;

	/**
	 * 用户id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * uid
	 */
	@ApiField("uid")
	private String uid;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
