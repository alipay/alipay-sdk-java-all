package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.deviceinfo.getidbytoken response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:13:12
 */
public class AlipayMobileDeviceinfoGetidbytokenResponse extends AlipayResponse {

	private static final long serialVersionUID = 6345461882235753179L;

	/** 
	 * 蚂蚁金服集团生成的设备id
	 */
	@ApiField("apdid")
	private String apdid;

	/** 
	 * 操作是否成功
	 */
	@ApiField("operateresult")
	private Boolean operateresult;

	/** 
	 * 阿里巴巴集团安全生产的设备id
	 */
	@ApiField("umid")
	private String umid;

	public void setApdid(String apdid) {
		this.apdid = apdid;
	}
	public String getApdid( ) {
		return this.apdid;
	}

	public void setOperateresult(Boolean operateresult) {
		this.operateresult = operateresult;
	}
	public Boolean getOperateresult( ) {
		return this.operateresult;
	}

	public void setUmid(String umid) {
		this.umid = umid;
	}
	public String getUmid( ) {
		return this.umid;
	}

}
