package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenProductCategory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adentitylibrary.entitycategory.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-07 08:52:55
 */
public class AlipayDataDataserviceAdentitylibraryEntitycategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4375552717893289325L;

	/** 
	 * null
	 */
	@ApiListField("result")
	@ApiField("open_product_category")
	private List<OpenProductCategory> result;

	public void setResult(List<OpenProductCategory> result) {
		this.result = result;
	}
	public List<OpenProductCategory> getResult( ) {
		return this.result;
	}

}
