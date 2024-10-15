package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租房商品分页查询接口
 *
 * @author auto create
 * @since 1.0, 2024-07-01 13:33:14
 */
public class AlipayOpenAppRoomrentListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4684941831579676781L;

	/**
	 * 支付宝平台侧商品ID列表，最多20个。
	 */
	@ApiListField("item_id_list")
	@ApiField("string")
	private List<String> itemIdList;

	/**
	 * 支付宝商家侧商品ID列表，最多20个。
	 */
	@ApiListField("out_item_id_list")
	@ApiField("string")
	private List<String> outItemIdList;

	/**
	 * 查询页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 查询分页单页数量，不超过20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 审核驳回：商品审核失败时，商品状态为审核驳回。 审核中：商品处于审核流程中时，商品状态为审核中。 已下架：商家可以通过调用接口下架商品，也可以通过商家后台下架商品。 可售卖：商家可以通过调用接口上架商品，也可以通过商家后台上架商品。 冻结：当商家出现违规操作时，支付宝侧将发起冻结，商品无法对外透出。 当商品包含多个规格时，只要有一个规格的商品状态为“可售卖”，spu的商品状态则为“可售卖”。
	 */
	@ApiField("status")
	private String status;

	public List<String> getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(List<String> itemIdList) {
		this.itemIdList = itemIdList;
	}

	public List<String> getOutItemIdList() {
		return this.outItemIdList;
	}
	public void setOutItemIdList(List<String> outItemIdList) {
		this.outItemIdList = outItemIdList;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
