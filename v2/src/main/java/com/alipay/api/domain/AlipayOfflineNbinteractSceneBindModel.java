package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备场景绑定
 *
 * @author auto create
 * @since 1.0, 2025-09-02 14:59:44
 */
public class AlipayOfflineNbinteractSceneBindModel extends AlipayObject {

	private static final long serialVersionUID = 2429279661274633424L;

	/**
	 * 跳转支付宝小程序的链接
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 碰一下互动跳转链接所属类型,从枚举中选择
	 */
	@ApiField("link_url_type")
	private String linkUrlType;

	/**
	 * 设备唯一标识
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备供应商 ID：supplierId，如意生态版AMX设备请填写“201901111100635561”
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getLinkUrlType() {
		return this.linkUrlType;
	}
	public void setLinkUrlType(String linkUrlType) {
		this.linkUrlType = linkUrlType;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
