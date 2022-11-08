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
 * @since 1.0, 2022-06-30 11:26:50
 */
public class AntfortuneQuotationNimitzDatasetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2269859428333765722L;

	/** 
	 * Nimitz 数据查询返回值，json形式
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 已弃用，返回时不要填充此字段，填充了也不会处理。
	 */
	@ApiListField("result_data")
	@ApiField("obj_rs_data_d_t_o")
	private List<ObjRsDataDTO> resultData;

	/** 
	 * 已弃用，返回时不要填充此字段，填充了也不会处理。
	 */
	@ApiField("result_status")
	private Status resultStatus;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

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
