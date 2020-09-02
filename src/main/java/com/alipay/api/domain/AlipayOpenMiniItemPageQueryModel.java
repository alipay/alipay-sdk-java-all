package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商品分页查询
 *
 * @author auto create
 * @since 1.0, 2020-08-17 20:35:31
 */
public class AlipayOpenMiniItemPageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7728617816935792329L;

	/**
	 * 商家侧商品id列表
	 */
	@ApiListField("item_id_list")
	@ApiField("string")
	private List<String> itemIdList;

	/**
	 * 操作类型，固定为：ITEM_PAGEQUERY
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

	public List<String> getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(List<String> itemIdList) {
		this.itemIdList = itemIdList;
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
