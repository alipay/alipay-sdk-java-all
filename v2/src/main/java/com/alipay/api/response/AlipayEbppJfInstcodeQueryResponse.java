package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PucInstCode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jf.instcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 09:56:42
 */
public class AlipayEbppJfInstcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5536268863855544254L;

	/** 
	 * 返回的机构信息列表
	 */
	@ApiListField("inst_code_list")
	@ApiField("puc_inst_code")
	private List<PucInstCode> instCodeList;

	public void setInstCodeList(List<PucInstCode> instCodeList) {
		this.instCodeList = instCodeList;
	}
	public List<PucInstCode> getInstCodeList( ) {
		return this.instCodeList;
	}

}
