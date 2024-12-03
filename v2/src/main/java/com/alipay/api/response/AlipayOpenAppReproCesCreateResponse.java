package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Gavinmed;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.repro.ces.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:36:14
 */
public class AlipayOpenAppReproCesCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8188627839654168798L;

	/** 
	 * 21
	 */
	@ApiListField("resname")
	@ApiField("gavinmed")
	private List<Gavinmed> resname;

	/** 
	 * 21
	 */
	@ApiListField("result")
	@ApiField("string")
	private List<String> result;

	public void setResname(List<Gavinmed> resname) {
		this.resname = resname;
	}
	public List<Gavinmed> getResname( ) {
		return this.resname;
	}

	public void setResult(List<String> result) {
		this.result = result;
	}
	public List<String> getResult( ) {
		return this.result;
	}

}
