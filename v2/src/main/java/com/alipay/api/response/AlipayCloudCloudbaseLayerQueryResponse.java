package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Layer;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.layer.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:23
 */
public class AlipayCloudCloudbaseLayerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3871947849352713817L;

	/** 
	 * 层列表
	 */
	@ApiListField("layers")
	@ApiField("layer")
	private List<Layer> layers;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setLayers(List<Layer> layers) {
		this.layers = layers;
	}
	public List<Layer> getLayers( ) {
		return this.layers;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
