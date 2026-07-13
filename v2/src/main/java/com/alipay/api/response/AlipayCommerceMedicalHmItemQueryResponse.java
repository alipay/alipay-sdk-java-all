package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hm.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-08 17:27:56
 */
public class AlipayCommerceMedicalHmItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8339588123621371913L;

	/** 
	 * 是否有免费权益
	 */
	@ApiField("has_free")
	private Boolean hasFree;

	/** 
	 * 是否还有下一页
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 页号
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * null
	 */
	@ApiListField("service_item_list")
	@ApiField("service_item")
	private List<ServiceItem> serviceItemList;

	/** 
	 * 服务包ID
	 */
	@ApiField("service_package_id")
	private String servicePackageId;

	/** 
	 * 服务包名称
	 */
	@ApiField("service_package_name")
	private String servicePackageName;

	/** 
	 * 服务包订单ID
	 */
	@ApiField("service_package_order_id")
	private String servicePackageOrderId;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setHasFree(Boolean hasFree) {
		this.hasFree = hasFree;
	}
	public Boolean getHasFree( ) {
		return this.hasFree;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setServiceItemList(List<ServiceItem> serviceItemList) {
		this.serviceItemList = serviceItemList;
	}
	public List<ServiceItem> getServiceItemList( ) {
		return this.serviceItemList;
	}

	public void setServicePackageId(String servicePackageId) {
		this.servicePackageId = servicePackageId;
	}
	public String getServicePackageId( ) {
		return this.servicePackageId;
	}

	public void setServicePackageName(String servicePackageName) {
		this.servicePackageName = servicePackageName;
	}
	public String getServicePackageName( ) {
		return this.servicePackageName;
	}

	public void setServicePackageOrderId(String servicePackageOrderId) {
		this.servicePackageOrderId = servicePackageOrderId;
	}
	public String getServicePackageOrderId( ) {
		return this.servicePackageOrderId;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
