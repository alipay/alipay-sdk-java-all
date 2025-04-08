package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店关联标品信息查询
 *
 * @author auto create
 * @since 1.0, 2018-09-17 10:34:17
 */
public class KoubeiRetailExtitemShopextitemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1344418854178237861L;

	/**
	 * 查询页码，表示第几页，不传默认1
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 分页大小，表示每页查询数量，不传默认10
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 口碑店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
