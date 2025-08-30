package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下业务数据回传设备
 *
 * @author auto create
 * @since 1.0, 2025-08-29 17:26:09
 */
public class AlipayPayDeviceNlinkNfccallbackSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2852247877339635921L;

	/**
	 * 业务code
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务方用户userId
	 */
	@ApiField("biz_user_id")
	private String bizUserId;

	/**
	 * 碰一下回传的业务数据
	 */
	@ApiField("nfc_callback_content")
	private String nfcCallbackContent;

	/**
	 * 动态码token
	 */
	@ApiField("ntoken")
	private String ntoken;

	/**
	 * 子业务code
	 */
	@ApiField("sub_biz_code")
	private String subBizCode;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizUserId() {
		return this.bizUserId;
	}
	public void setBizUserId(String bizUserId) {
		this.bizUserId = bizUserId;
	}

	public String getNfcCallbackContent() {
		return this.nfcCallbackContent;
	}
	public void setNfcCallbackContent(String nfcCallbackContent) {
		this.nfcCallbackContent = nfcCallbackContent;
	}

	public String getNtoken() {
		return this.ntoken;
	}
	public void setNtoken(String ntoken) {
		this.ntoken = ntoken;
	}

	public String getSubBizCode() {
		return this.subBizCode;
	}
	public void setSubBizCode(String subBizCode) {
		this.subBizCode = subBizCode;
	}

}
