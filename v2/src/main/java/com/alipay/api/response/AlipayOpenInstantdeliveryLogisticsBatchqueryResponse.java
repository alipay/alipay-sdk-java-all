package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LogisticsCompanyDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.instantdelivery.logistics.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-22 20:19:15
 */
public class AlipayOpenInstantdeliveryLogisticsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1131239669627437764L;

	/** 
	 * 支持的即时配送公司列表
	 */
	@ApiListField("logistics_companys")
	@ApiField("logistics_company_d_t_o")
	private List<LogisticsCompanyDTO> logisticsCompanys;

	public void setLogisticsCompanys(List<LogisticsCompanyDTO> logisticsCompanys) {
		this.logisticsCompanys = logisticsCompanys;
	}
	public List<LogisticsCompanyDTO> getLogisticsCompanys( ) {
		return this.logisticsCompanys;
	}

}
