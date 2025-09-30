package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceEntity;
import com.alipay.api.domain.EntityPagination;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adentitylibrary.serviceentity.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-25 12:00:20
 */
public class AlipayDataDataserviceAdentitylibraryServiceentityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6462765777999581753L;

	/** 
	 * 实体详情信息的列表
	 */
	@ApiListField("list")
	@ApiField("service_entity")
	private List<ServiceEntity> list;

	/** 
	 * 返回的分页信息
	 */
	@ApiField("pagination")
	private EntityPagination pagination;

	public void setList(List<ServiceEntity> list) {
		this.list = list;
	}
	public List<ServiceEntity> getList( ) {
		return this.list;
	}

	public void setPagination(EntityPagination pagination) {
		this.pagination = pagination;
	}
	public EntityPagination getPagination( ) {
		return this.pagination;
	}

}
