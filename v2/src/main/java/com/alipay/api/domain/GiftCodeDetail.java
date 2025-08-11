package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 喜气红包二维码详情
 *
 * @author auto create
 * @since 1.0, 2023-08-14 11:23:20
 */
public class GiftCodeDetail extends AlipayObject {

	private static final long serialVersionUID = 3456133844664636484L;

	/**
	 * 二维码所属码组的ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 喜气红包二维码唯一标识，一个二维码有唯一一个ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 二维码对应的短链接
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

}
