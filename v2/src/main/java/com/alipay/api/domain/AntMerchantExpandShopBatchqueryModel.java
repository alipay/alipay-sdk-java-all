package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询线下门店
 *
 * @author auto create
 * @since 1.0, 2020-03-13 16:20:54
 */
public class AntMerchantExpandShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3651792996853451877L;

	/**
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页数量, 最大50
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 插件业务场景code，预约为SHOP_SERVICE
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 线上店ID
	 */
	@ApiField("store_open_id")
	private String storeOpenId;

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getStoreOpenId() {
		return this.storeOpenId;
	}
	public void setStoreOpenId(String storeOpenId) {
		this.storeOpenId = storeOpenId;
	}

}
