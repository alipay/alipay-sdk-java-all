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
 * @since 1.0, 2022-07-08 19:54:31
 */
public class AlipayOpenAppReproCesCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1317125177652373955L;

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
