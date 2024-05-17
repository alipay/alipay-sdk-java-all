package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.icp.faceauth.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:50:59
 */
public class AlipayOpenMiniIcpFaceauthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2376887683276758528L;

	/** 
	 * 人脸核验结果描述，当certify_result_status为FAIL时展示失败的原因
	 */
	@ApiField("certify_result_desc")
	private String certifyResultDesc;

	/** 
	 * 人脸核验结果状态
	 */
	@ApiField("certify_result_status")
	private String certifyResultStatus;

	public void setCertifyResultDesc(String certifyResultDesc) {
		this.certifyResultDesc = certifyResultDesc;
	}
	public String getCertifyResultDesc( ) {
		return this.certifyResultDesc;
	}

	public void setCertifyResultStatus(String certifyResultStatus) {
		this.certifyResultStatus = certifyResultStatus;
	}
	public String getCertifyResultStatus( ) {
		return this.certifyResultStatus;
	}

}
