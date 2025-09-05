package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签到数据下载
 *
 * @author auto create
 * @since 1.0, 2025-04-29 14:16:54
 */
public class AlipayCommerceEducateCampusCheckinDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 6598977166796672268L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
