package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppModelQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.model.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayOpenMiniModelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5257894838329219871L;

	/** 
	 * 蚂蚁域小程序核心模型查询接口返回对象，model_type：查询模型类型，records：记录列表
	 */
	@ApiListField("model_infos")
	@ApiField("mini_app_model_query_response")
	private List<MiniAppModelQueryResponse> modelInfos;

	public void setModelInfos(List<MiniAppModelQueryResponse> modelInfos) {
		this.modelInfos = modelInfos;
	}
	public List<MiniAppModelQueryResponse> getModelInfos( ) {
		return this.modelInfos;
	}

}
