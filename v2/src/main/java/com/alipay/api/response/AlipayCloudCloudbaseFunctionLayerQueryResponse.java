package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LayerInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.layer.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-31 14:46:09
 */
public class AlipayCloudCloudbaseFunctionLayerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3114388539813171236L;

	/** 
	 * 绑定层列表
	 */
	@ApiListField("layers")
	@ApiField("layer_info")
	private List<LayerInfo> layers;

	public void setLayers(List<LayerInfo> layers) {
		this.layers = layers;
	}
	public List<LayerInfo> getLayers( ) {
		return this.layers;
	}

}
