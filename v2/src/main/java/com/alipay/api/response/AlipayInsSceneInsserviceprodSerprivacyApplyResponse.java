package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.serprivacy.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-07 11:42:28
 */
public class AlipayInsSceneInsserviceprodSerprivacyApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5759786595163364726L;

	/** 
	 * 隐私号
	 */
	@ApiField("bind_phone")
	private String bindPhone;

	/** 
	 * 隐私号过期时间
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/** 
	 * axn分机号，仅axn分机号模式有数值
	 */
	@ApiField("extension_no")
	private String extensionNo;

	public void setBindPhone(String bindPhone) {
		this.bindPhone = bindPhone;
	}
	public String getBindPhone( ) {
		return this.bindPhone;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}
	public Date getExpiredTime( ) {
		return this.expiredTime;
	}

	public void setExtensionNo(String extensionNo) {
		this.extensionNo = extensionNo;
	}
	public String getExtensionNo( ) {
		return this.extensionNo;
	}

}
