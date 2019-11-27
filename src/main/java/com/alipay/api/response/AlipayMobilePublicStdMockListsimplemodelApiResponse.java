package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SimpleMockModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.std.mock.listsimplemodel.api response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobilePublicStdMockListsimplemodelApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 8511236374293314376L;

	/** 
	 * 2088
	 */
	@ApiListField("biz_model_list")
	@ApiField("simple_mock_model")
	private List<SimpleMockModel> bizModelList;

	public void setBizModelList(List<SimpleMockModel> bizModelList) {
		this.bizModelList = bizModelList;
	}
	public List<SimpleMockModel> getBizModelList( ) {
		return this.bizModelList;
	}

}
