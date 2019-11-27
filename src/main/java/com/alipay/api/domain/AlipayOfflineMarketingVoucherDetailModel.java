package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询券详情信息
 *
 * @author auto create
 * @since 1.0, 2016-04-20 16:46:21
 */
public class AlipayOfflineMarketingVoucherDetailModel extends AlipayObject {

	private static final long serialVersionUID = 6162462816113431175L;

	/**
	 * 必填
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
