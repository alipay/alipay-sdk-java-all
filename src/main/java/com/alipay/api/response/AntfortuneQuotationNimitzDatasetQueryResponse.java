package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ObjRsDataDTO;
import com.alipay.api.domain.Status;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.quotation.nimitz.dataset.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-14 10:31:45
 */
public class AntfortuneQuotationNimitzDatasetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5291678971734817583L;

	/** 
	 * 数据
	 */
	@ApiListField("result_data")
	@ApiField("obj_rs_data_d_t_o")
	private List<ObjRsDataDTO> resultData;

	/** 
	 * 状态信息
	 */
	@ApiField("result_status")
	private Status resultStatus;

	public void setResultData(List<ObjRsDataDTO> resultData) {
		this.resultData = resultData;
	}
	public List<ObjRsDataDTO> getResultData( ) {
		return this.resultData;
	}

	public void setResultStatus(Status resultStatus) {
		this.resultStatus = resultStatus;
	}
	public Status getResultStatus( ) {
		return this.resultStatus;
	}

}
