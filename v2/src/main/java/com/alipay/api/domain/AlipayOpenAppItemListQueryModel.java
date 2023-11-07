package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商品分页查询接口
 *
 * @author auto create
 * @since 1.0, 2023-07-03 17:35:16
 */
public class AlipayOpenAppItemListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3232668457127799573L;

	/**
	 * 支付宝平台侧商品id 列表，最多20个。
	 */
	@ApiListField("item_id_list")
	@ApiField("string")
	private List<String> itemIdList;

	/**
	 * 商家侧商品id 列表，最多20个。
与item_id_list二选一。如果都传，优先使用商家侧商品id。
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
	 * spu商品状态
	 */
	@ApiField("spu_status")
	private String spuStatus;

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

	public String getSpuStatus() {
		return this.spuStatus;
	}
	public void setSpuStatus(String spuStatus) {
		this.spuStatus = spuStatus;
	}

}
