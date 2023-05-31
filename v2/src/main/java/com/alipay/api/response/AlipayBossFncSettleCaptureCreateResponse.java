package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CaptureCreateDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.settle.capture.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:03:52
 */
public class AlipayBossFncSettleCaptureCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6821172111267535852L;

	/** 
	 * 请款创建数据对象
	 */
	@ApiListField("result_set")
	@ApiField("capture_create_d_t_o")
	private List<CaptureCreateDTO> resultSet;

	public void setResultSet(List<CaptureCreateDTO> resultSet) {
		this.resultSet = resultSet;
	}
	public List<CaptureCreateDTO> getResultSet( ) {
		return this.resultSet;
	}

}
