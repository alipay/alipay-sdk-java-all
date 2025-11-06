package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备场景绑定查询
 *
 * @author auto create
 * @since 1.0, 2025-10-10 16:21:41
 */
public class AlipayOfflineNbinteractSceneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2476331372335481667L;

	/**
	 * 碰一下互动跳转链接所属类型,从枚举中选择,不填写默认返回最新的
	 */
	@ApiField("link_url_type")
	private String linkUrlType;

	/**
	 * 设备sn
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备供应商 ID
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
