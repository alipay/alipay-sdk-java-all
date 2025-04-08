package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DarwinParameter;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.darwin.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-01 17:02:06
 */
public class AntfortuneStockDarwinQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3412783784397195149L;

	/** 
	 * 达尔文参数
	 */
	@ApiListField("darwin_parameter")
	@ApiField("darwin_parameter")
	private List<DarwinParameter> darwinParameter;

	/** 
	 * 实验id
	 */
	@ApiField("exp_id")
	private String expId;

	public void setDarwinParameter(List<DarwinParameter> darwinParameter) {
		this.darwinParameter = darwinParameter;
	}
	public List<DarwinParameter> getDarwinParameter( ) {
		return this.darwinParameter;
	}

	public void setExpId(String expId) {
		this.expId = expId;
	}
	public String getExpId( ) {
		return this.expId;
	}

}
