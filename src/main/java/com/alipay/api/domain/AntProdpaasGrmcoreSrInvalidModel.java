package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 维护和作废SR校验接口
 *
 * @author auto create
 * @since 1.0, 2021-08-31 20:52:15
 */
public class AntProdpaasGrmcoreSrInvalidModel extends AlipayObject {

	private static final long serialVersionUID = 3496384795583832341L;

	/**
	 * 环境标识，送“prod”
	 */
	@ApiField("env")
	private String env;

	/**
	 * sr编号
	 */
	@ApiListField("sr_nos")
	@ApiField("string")
	private List<String> srNos;

	/**
	 * 删除供应商code列表
	 */
	@ApiListField("suppliers")
	@ApiField("string")
	private List<String> suppliers;

	/**
	 * 租户，必送
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public List<String> getSrNos() {
		return this.srNos;
	}
	public void setSrNos(List<String> srNos) {
		this.srNos = srNos;
	}

	public List<String> getSuppliers() {
		return this.suppliers;
	}
	public void setSuppliers(List<String> suppliers) {
		this.suppliers = suppliers;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
