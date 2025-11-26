package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LeadsProductTypeDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.leadproducttype.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-28 15:37:40
 */
public class AnttechOceanbaseObglobalLeadproducttypeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5263981547691666253L;

	/** 
	 * 结果对象
	 */
	@ApiListField("result")
	@ApiField("leads_product_type_d_t_o")
	private List<LeadsProductTypeDTO> result;

	public void setResult(List<LeadsProductTypeDTO> result) {
		this.result = result;
	}
	public List<LeadsProductTypeDTO> getResult( ) {
		return this.result;
	}

}
