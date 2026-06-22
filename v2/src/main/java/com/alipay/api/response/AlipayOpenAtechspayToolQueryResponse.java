package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ToolDatas;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.atechspay.tool.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-14 16:16:28
 */
public class AlipayOpenAtechspayToolQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6366958493675955768L;

	/** 
	 * 诊断详情
	 */
	@ApiField("diagnosis_info")
	private ToolDatas diagnosisInfo;

	/** 
	 * 诊断环境
	 */
	@ApiField("env")
	private String env;

	/** 
	 * 使用的工具标识
	 */
	@ApiField("tool")
	private String tool;

	public void setDiagnosisInfo(ToolDatas diagnosisInfo) {
		this.diagnosisInfo = diagnosisInfo;
	}
	public ToolDatas getDiagnosisInfo( ) {
		return this.diagnosisInfo;
	}

	public void setEnv(String env) {
		this.env = env;
	}
	public String getEnv( ) {
		return this.env;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}
	public String getTool( ) {
		return this.tool;
	}

}
