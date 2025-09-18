package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.icontroldc.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-29 10:52:19
 */
public class AlipayIserviceIcontroldcUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8681398675286182657L;

	/** 
	 * 星云1088ID
	 */
	@ApiField("nebula_id")
	private String nebulaId;

	/** 
	 * 星云租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/** 
	 * 小二1099ID
	 */
	@ApiField("ur_id")
	private String urId;

	public void setNebulaId(String nebulaId) {
		this.nebulaId = nebulaId;
	}
	public String getNebulaId( ) {
		return this.nebulaId;
	}

	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}
	public String getTntInstId( ) {
		return this.tntInstId;
	}

	public void setUrId(String urId) {
		this.urId = urId;
	}
	public String getUrId( ) {
		return this.urId;
	}

}
