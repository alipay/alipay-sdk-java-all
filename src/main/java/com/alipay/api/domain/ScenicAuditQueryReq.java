package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 景区审核信息查询请求
 *
 * @author auto create
 * @since 1.0, 2021-06-10 15:24:56
 */
public class ScenicAuditQueryReq extends AlipayObject {

	private static final long serialVersionUID = 8733256641335528162L;

	/**
	 * 服务商负责的景区小程序APPID
	 */
	@ApiField("scenic_app_id")
	private String scenicAppId;

	/**
	 * 支付宝景区ID
	 */
	@ApiField("scenic_id")
	private String scenicId;

	public String getScenicAppId() {
		return this.scenicAppId;
	}
	public void setScenicAppId(String scenicAppId) {
		this.scenicAppId = scenicAppId;
	}

	public String getScenicId() {
		return this.scenicId;
	}
	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}

}
