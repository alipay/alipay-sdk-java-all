package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建 SDK 使用的 API TOKEN
 *
 * @author auto create
 * @since 1.0, 2020-09-08 19:05:58
 */
public class AlipayOpenMiniMorphoTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2163769942399561894L;

	/**
	 * 闪蝶站点 ID
	 */
	@ApiField("aid")
	private String aid;

	/**
	 * 闪蝶侧用户身份唯一标识
	 */
	@ApiField("identity")
	private MorphoIdentity identity;

	/**
	 * 闪蝶空间ID
	 */
	@ApiField("sid")
	private String sid;

	public String getAid() {
		return this.aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}

	public MorphoIdentity getIdentity() {
		return this.identity;
	}
	public void setIdentity(MorphoIdentity identity) {
		this.identity = identity;
	}

	public String getSid() {
		return this.sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}

}
