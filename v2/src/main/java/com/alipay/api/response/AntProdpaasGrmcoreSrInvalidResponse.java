package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.grmcore.sr.invalid response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:09:21
 */
public class AntProdpaasGrmcoreSrInvalidResponse extends AlipayResponse {

	private static final long serialVersionUID = 1611162696947533656L;

	/** 
	 * 是否同意维护或作废
	 */
	@ApiField("flag")
	private Boolean flag;

	/** 
	 * 校验不通过供应商code列表
	 */
	@ApiListField("suppliers")
	@ApiField("string")
	private List<String> suppliers;

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	public Boolean getFlag( ) {
		return this.flag;
	}

	public void setSuppliers(List<String> suppliers) {
		this.suppliers = suppliers;
	}
	public List<String> getSuppliers( ) {
		return this.suppliers;
	}

}
