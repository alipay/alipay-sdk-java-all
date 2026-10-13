package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资源市场产品查询最新版本信息
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:12:58
 */
public class AlipayOpenProductLatestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8855482425299193945L;

	/**
	 * 渠道
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * oid
	 */
	@ApiField("oid")
	private String oid;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getOid() {
		return this.oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
