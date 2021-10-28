package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PluginUseRelationInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerapp.pluginrelation.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-21 14:10:23
 */
public class AlipayOpenMiniInnerappPluginrelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2431595913463644959L;

	/** 
	 * 页码
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 插件关联关系信息
	 */
	@ApiListField("plugin_relation_info_list")
	@ApiField("plugin_use_relation_info")
	private List<PluginUseRelationInfo> pluginRelationInfoList;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setPluginRelationInfoList(List<PluginUseRelationInfo> pluginRelationInfoList) {
		this.pluginRelationInfoList = pluginRelationInfoList;
	}
	public List<PluginUseRelationInfo> getPluginRelationInfoList( ) {
		return this.pluginRelationInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
