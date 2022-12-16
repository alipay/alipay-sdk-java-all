package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryProfileDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.inspetprod.hasprofile.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:35:45
 */
public class AlipayInsSceneInspetprodHasprofileBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6569534733641319395L;

	/** 
	 * 示例List<QueryProfileDTO>
	 */
	@ApiListField("model_list")
	@ApiField("query_profile_d_t_o")
	private List<QueryProfileDTO> modelList;

	public void setModelList(List<QueryProfileDTO> modelList) {
		this.modelList = modelList;
	}
	public List<QueryProfileDTO> getModelList( ) {
		return this.modelList;
	}

}
