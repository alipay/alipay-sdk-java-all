package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DvcAttrForLocate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.dvcattr.locate.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-19 14:42:34
 */
public class AlipayOfflineProviderDvcattrLocateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2464569938348745256L;

	/** 
	 * 设备辅助室内定位数据列表
	 */
	@ApiListField("dvc_attr_for_locate")
	@ApiField("dvc_attr_for_locate")
	private List<DvcAttrForLocate> dvcAttrForLocate;

	/** 
	 * 页数，和入参保持一致
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 分页大小，和入参保持一致
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 列表总数量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setDvcAttrForLocate(List<DvcAttrForLocate> dvcAttrForLocate) {
		this.dvcAttrForLocate = dvcAttrForLocate;
	}
	public List<DvcAttrForLocate> getDvcAttrForLocate( ) {
		return this.dvcAttrForLocate;
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

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
