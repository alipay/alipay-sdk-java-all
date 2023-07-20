package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序实例绑定关系分页查询
 *
 * @author auto create
 * @since 1.0, 2021-08-12 18:50:45
 */
public class AlipayOpenMiniShopRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7864531514163686271L;

	/**
	 * 门店 ID 列表。支付宝门店（蚂蚁门店）的 ShopID。
	 */
	@ApiListField("entity_id_list")
	@ApiField("string")
	private List<String> entityIdList;

	/**
	 * 操作类型，固定为：MINIAPP_SHOP_PAGEQUERY
	 */
	@ApiField("operation")
	private String operation;

	/**
	 * 当前页码，默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量，最大不超过20，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	public List<String> getEntityIdList() {
		return this.entityIdList;
	}
	public void setEntityIdList(List<String> entityIdList) {
		this.entityIdList = entityIdList;
	}

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
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

}
