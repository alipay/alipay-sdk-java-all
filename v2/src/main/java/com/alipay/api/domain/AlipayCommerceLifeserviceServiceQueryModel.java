package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务项目分页查询
 *
 * @author auto create
 * @since 1.0, 2026-01-28 16:52:42
 */
public class AlipayCommerceLifeserviceServiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1763185947641951841L;

	/**
	 * null
	 */
	@ApiListField("out_service_ids")
	@ApiField("string")
	private List<String> outServiceIds;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * null
	 */
	@ApiListField("service_ids")
	@ApiField("string")
	private List<String> serviceIds;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 服务项目状态
	 */
	@ApiField("status")
	private String status;

	public List<String> getOutServiceIds() {
		return this.outServiceIds;
	}
	public void setOutServiceIds(List<String> outServiceIds) {
		this.outServiceIds = outServiceIds;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getServiceIds() {
		return this.serviceIds;
	}
	public void setServiceIds(List<String> serviceIds) {
		this.serviceIds = serviceIds;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
