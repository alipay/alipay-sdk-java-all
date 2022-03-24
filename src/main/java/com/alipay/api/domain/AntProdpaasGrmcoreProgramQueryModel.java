package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询项目信息
 *
 * @author auto create
 * @since 1.0, 2021-08-31 20:52:02
 */
public class AntProdpaasGrmcoreProgramQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1741467999199425316L;

	/**
	 * 环境标志，必须上送"prod"
	 */
	@ApiField("env")
	private String env;

	/**
	 * 项目编号
	 */
	@ApiField("program_code")
	private String programCode;

	/**
	 * 租户信息，必须送"ANTGROUP"
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getProgramCode() {
		return this.programCode;
	}
	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
