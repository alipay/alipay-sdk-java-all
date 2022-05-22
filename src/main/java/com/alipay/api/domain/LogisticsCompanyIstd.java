package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 即时配送公司配置
 *
 * @author auto create
 * @since 1.0, 2020-09-22 16:28:44
 */
public class LogisticsCompanyIstd extends AlipayObject {

	private static final long serialVersionUID = 8658421651533458271L;

	/**
	 * 即时配送公司编码，由支付宝分配
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 即时配送公司服务代码列表
	 */
	@ApiListField("service_codes")
	@ApiField("service_code_istd")
	private List<ServiceCodeIstd> serviceCodes;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public List<ServiceCodeIstd> getServiceCodes() {
		return this.serviceCodes;
	}
	public void setServiceCodes(List<ServiceCodeIstd> serviceCodes) {
		this.serviceCodes = serviceCodes;
	}

}
