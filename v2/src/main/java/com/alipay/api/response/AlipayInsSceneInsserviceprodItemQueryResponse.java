package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HealthServiceItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:27:36
 */
public class AlipayInsSceneInsserviceprodItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5275281868932651476L;

	/** 
	 * 商品列表
	 */
	@ApiListField("data_list")
	@ApiField("health_service_item")
	private List<HealthServiceItem> dataList;

	/** 
	 * 当前页码
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 当前页的数据条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 查询商品的总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setDataList(List<HealthServiceItem> dataList) {
		this.dataList = dataList;
	}
	public List<HealthServiceItem> getDataList( ) {
		return this.dataList;
	}

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

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
