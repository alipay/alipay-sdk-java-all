package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnvVar;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.envvars.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:51:41
 */
public class AlipayCloudCloudbaseFunctionEnvvarsGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3695339422565195295L;

	/** 
	 * 环境变量集合
	 */
	@ApiListField("env_vars")
	@ApiField("env_var")
	private List<EnvVar> envVars;

	public void setEnvVars(List<EnvVar> envVars) {
		this.envVars = envVars;
	}
	public List<EnvVar> getEnvVars( ) {
		return this.envVars;
	}

}
