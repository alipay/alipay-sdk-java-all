package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑码查询接口
 *
 * @author auto create
 * @since 1.0, 2017-09-05 16:47:58
 */
public class KoubeiCateringKbcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6156923349496221466L;

	/**
	 * 创建口碑码时返回的批次号（batch_id和shop_id二者必填其一）
	 */
	@ApiField("batch_id")
	private Long batchId;

	/**
	 * 当前页码（大于0的整数）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页返回的记录数（0~100的整数）
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 口碑店铺ID（batch_id和shop_id二者必填其一）
	 */
	@ApiField("shop_id")
	private String shopId;

	public Long getBatchId() {
		return this.batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
