package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.experience.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-11 17:20:37
 */
public class AlipayOpenMiniInnerExperienceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7378341294276263897L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 体验二维码地址
	 */
	@ApiField("exp_qr_code_url")
	private String expQrCodeUrl;

	/** 
	 * 体验码schema
	 */
	@ApiField("exp_schema_url")
	private String expSchemaUrl;

	/** 
	 * 是否成功
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 查询指定版本的状态
	 */
	@ApiField("status")
	private String status;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setExpQrCodeUrl(String expQrCodeUrl) {
		this.expQrCodeUrl = expQrCodeUrl;
	}
	public String getExpQrCodeUrl( ) {
		return this.expQrCodeUrl;
	}

	public void setExpSchemaUrl(String expSchemaUrl) {
		this.expSchemaUrl = expSchemaUrl;
	}
	public String getExpSchemaUrl( ) {
		return this.expSchemaUrl;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
