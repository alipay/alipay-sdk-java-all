package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活服务尾款单服务项目
 *
 * @author auto create
 * @since 1.0, 2026-05-15 15:44:14
 */
public class LifeServiceTailPaymentServiceProgram extends AlipayObject {

	private static final long serialVersionUID = 4816876667974341552L;

	/**
	 * 服务项目的数量
	 */
	@ApiField("service_program_count")
	private Long serviceProgramCount;

	/**
	 * 服务项目的具体明细
	 */
	@ApiField("service_program_name")
	private String serviceProgramName;

	/**
	 * 服务项目费用
	 */
	@ApiField("service_program_unit_price_yuan")
	private String serviceProgramUnitPriceYuan;

	public Long getServiceProgramCount() {
		return this.serviceProgramCount;
	}
	public void setServiceProgramCount(Long serviceProgramCount) {
		this.serviceProgramCount = serviceProgramCount;
	}

	public String getServiceProgramName() {
		return this.serviceProgramName;
	}
	public void setServiceProgramName(String serviceProgramName) {
		this.serviceProgramName = serviceProgramName;
	}

	public String getServiceProgramUnitPriceYuan() {
		return this.serviceProgramUnitPriceYuan;
	}
	public void setServiceProgramUnitPriceYuan(String serviceProgramUnitPriceYuan) {
		this.serviceProgramUnitPriceYuan = serviceProgramUnitPriceYuan;
	}

}
