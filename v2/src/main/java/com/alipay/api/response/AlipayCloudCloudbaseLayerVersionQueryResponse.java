package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LayerVersion;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.layer.version.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:22
 */
public class AlipayCloudCloudbaseLayerVersionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7464412674841388773L;

	/** 
	 * 镜像列表
	 */
	@ApiListField("layer_versions")
	@ApiField("layer_version")
	private List<LayerVersion> layerVersions;

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

	public void setLayerVersions(List<LayerVersion> layerVersions) {
		this.layerVersions = layerVersions;
	}
	public List<LayerVersion> getLayerVersions( ) {
		return this.layerVersions;
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
