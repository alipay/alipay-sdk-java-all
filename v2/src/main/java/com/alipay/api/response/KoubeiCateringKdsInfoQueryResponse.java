package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KdsInfoModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.kds.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:34
 */
public class KoubeiCateringKdsInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6522835425941246775L;

	/** 
	 * kds 配置信息列表
	 */
	@ApiListField("kds_info_model_list")
	@ApiField("kds_info_model")
	private List<KdsInfoModel> kdsInfoModelList;

	public void setKdsInfoModelList(List<KdsInfoModel> kdsInfoModelList) {
		this.kdsInfoModelList = kdsInfoModelList;
	}
	public List<KdsInfoModel> getKdsInfoModelList( ) {
		return this.kdsInfoModelList;
	}

}
