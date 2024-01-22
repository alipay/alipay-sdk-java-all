package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部开放给金融云端用于查询pid下面所有小程序的详细信息
 *
 * @author auto create
 * @since 1.0, 2022-09-04 22:04:30
 */
public class AlipayOpenMiniCloudDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1431554783534586119L;

	/**
	 * 应用的appid。partner_id和mini_appid不能同时为空。
	 */
	@ApiField("mini_appid")
	private String miniAppid;

	/**
	 * 商户和支付宝交互时，支付宝分配给商户ID。partner_id和mini_appid不能同时为空。
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getMiniAppid() {
		return this.miniAppid;
	}
	public void setMiniAppid(String miniAppid) {
		this.miniAppid = miniAppid;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
