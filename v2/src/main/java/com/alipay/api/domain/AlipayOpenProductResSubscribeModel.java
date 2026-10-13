package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资源市场产品订阅
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:07:58
 */
public class AlipayOpenProductResSubscribeModel extends AlipayObject {

	private static final long serialVersionUID = 6625143223361697623L;

	/**
	 * 幂等键
	 */
	@ApiField("biz_request_id")
	private String bizRequestId;

	/**
	 * OH_AM_SH_PC：三方
ISP_AM_BA_PC：yi fa
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 签约商家主账户oid
	 */
	@ApiField("oid")
	private String oid;

	/**
	 * 开放平台open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品编码列表
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizRequestId() {
		return this.bizRequestId;
	}
	public void setBizRequestId(String bizRequestId) {
		this.bizRequestId = bizRequestId;
	}

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
