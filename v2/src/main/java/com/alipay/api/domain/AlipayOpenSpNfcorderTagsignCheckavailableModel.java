package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下线圈签名校验
 *
 * @author auto create
 * @since 1.0, 2025-11-13 16:39:09
 */
public class AlipayOpenSpNfcorderTagsignCheckavailableModel extends AlipayObject {

	private static final long serialVersionUID = 6248215437781984172L;

	/**
	 * 通过小程序api获取到的开放物料id
	 */
	@ApiField("open_tag_id")
	private String openTagId;

	/**
	 * 碰一下获取到的签名信息
	 */
	@ApiField("signature")
	private String signature;

	public String getOpenTagId() {
		return this.openTagId;
	}
	public void setOpenTagId(String openTagId) {
		this.openTagId = openTagId;
	}

	public String getSignature() {
		return this.signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}

}
