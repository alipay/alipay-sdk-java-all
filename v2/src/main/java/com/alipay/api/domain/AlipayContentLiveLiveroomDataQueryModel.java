package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直播中观看人数查询
 *
 * @author auto create
 * @since 1.0, 2025-07-10 19:17:53
 */
public class AlipayContentLiveLiveroomDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5719298344369989774L;

	/**
	 * 加密后的直播间id
	 */
	@ApiField("encrypted_live_id")
	private String encryptedLiveId;

	public String getEncryptedLiveId() {
		return this.encryptedLiveId;
	}
	public void setEncryptedLiveId(String encryptedLiveId) {
		this.encryptedLiveId = encryptedLiveId;
	}

}
