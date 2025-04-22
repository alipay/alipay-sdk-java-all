package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PassportDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passport.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-26 11:03:10
 */
public class AnttechOceanbasePassportBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4582198631113918229L;

	/** 
	 * 通行证列表
	 */
	@ApiListField("passport_details")
	@ApiField("passport_detail_d_t_o")
	private List<PassportDetailDTO> passportDetails;

	public void setPassportDetails(List<PassportDetailDTO> passportDetails) {
		this.passportDetails = passportDetails;
	}
	public List<PassportDetailDTO> getPassportDetails( ) {
		return this.passportDetails;
	}

}
