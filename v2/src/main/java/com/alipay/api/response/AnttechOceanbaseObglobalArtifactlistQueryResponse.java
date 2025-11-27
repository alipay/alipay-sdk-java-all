package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryObArtifactListDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.artifactlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-04 14:06:57
 */
public class AnttechOceanbaseObglobalArtifactlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1114831544319498269L;

	/** 
	 * 业务错误码
	 */
	@ApiField("biz_error_code")
	private String bizErrorCode;

	/** 
	 * 业务错误信息
	 */
	@ApiField("biz_error_msg")
	private String bizErrorMsg;

	/** 
	 * 业务是否成功
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 结果对象
	 */
	@ApiListField("result")
	@ApiField("query_ob_artifact_list_d_t_o")
	private List<QueryObArtifactListDTO> result;

	public void setBizErrorCode(String bizErrorCode) {
		this.bizErrorCode = bizErrorCode;
	}
	public String getBizErrorCode( ) {
		return this.bizErrorCode;
	}

	public void setBizErrorMsg(String bizErrorMsg) {
		this.bizErrorMsg = bizErrorMsg;
	}
	public String getBizErrorMsg( ) {
		return this.bizErrorMsg;
	}

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

	public void setResult(List<QueryObArtifactListDTO> result) {
		this.result = result;
	}
	public List<QueryObArtifactListDTO> getResult( ) {
		return this.result;
	}

}
