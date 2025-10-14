package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备场景解绑
 *
 * @author auto create
 * @since 1.0, 2025-10-10 16:21:28
 */
public class AlipayOfflineNbinteractSceneUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 2238731569199818191L;

	/**
	 * 碰一下互动跳转链接所属类型,从枚举中选择
	 */
	@ApiField("link_url_type")
	private String linkUrlType;

	/**
	 * 设备sn
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备供应商 ID：supplierId，如意生态版AMX设备请填写“201901111100635561”
	 */
	@ApiField("supplier_id")
	private String supplierId;

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
