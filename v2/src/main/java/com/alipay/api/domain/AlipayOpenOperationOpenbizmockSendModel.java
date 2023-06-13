package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * To蚂蚁消息测试
 *
 * @author auto create
 * @since 1.0, 2023-01-17 18:52:00
 */
public class AlipayOpenOperationOpenbizmockSendModel extends AlipayObject {

	private static final long serialVersionUID = 4892219696224849691L;

	/**
	 * 88
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 88
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 88
	 */
	@ApiField("uidaa")
	private String uidaa;

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUidaa() {
		return this.uidaa;
	}
	public void setUidaa(String uidaa) {
		this.uidaa = uidaa;
	}

}
