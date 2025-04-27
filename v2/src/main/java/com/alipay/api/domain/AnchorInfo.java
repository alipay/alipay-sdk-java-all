package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联主播信息
 *
 * @author auto create
 * @since 1.0, 2024-08-12 15:01:25
 */
public class AnchorInfo extends AlipayObject {

	private static final long serialVersionUID = 4757784242863887478L;

	/**
	 * 主播昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 平台ID
	 */
	@ApiField("platform_id")
	private String platformId;

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

}
