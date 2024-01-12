package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试专用此接口为强制走证书的接口
 *
 * @author auto create
 * @since 1.0, 2023-06-28 16:03:17
 */
public class AlipayOpenOperationOpenbizmockTestcertificateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7876321858346895778L;

	/**
	 * 1
	 */
	@ApiField("hahaha")
	private String hahaha;

	/**
	 * ceshi
	 */
	@ApiField("keykey")
	private String keykey;

	/**
	 * ceshi
	 */
	@ApiField("keykey_openid")
	private String keykeyOpenid;

	/**
	 * 1
	 */
	@ApiField("lalala")
	private String lalala;

	/**
	 * 1
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1
	 */
	@ApiField("uid")
	private String uid;

	public String getHahaha() {
		return this.hahaha;
	}
	public void setHahaha(String hahaha) {
		this.hahaha = hahaha;
	}

	public String getKeykey() {
		return this.keykey;
	}
	public void setKeykey(String keykey) {
		this.keykey = keykey;
	}

	public String getKeykeyOpenid() {
		return this.keykeyOpenid;
	}
	public void setKeykeyOpenid(String keykeyOpenid) {
		this.keykeyOpenid = keykeyOpenid;
	}

	public String getLalala() {
		return this.lalala;
	}
	public void setLalala(String lalala) {
		this.lalala = lalala;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
