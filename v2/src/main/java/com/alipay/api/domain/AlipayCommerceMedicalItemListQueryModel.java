package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询门店商品列表
 *
 * @author auto create
 * @since 1.0, 2025-04-23 10:42:57
 */
public class AlipayCommerceMedicalItemListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5731749614336791923L;

	/**
	 * 分页页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页面展示条数，最大值100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * app方门店编码, 用于标识定位要操作商品的指定门店, 创建门店时设置的值
	 */
	@ApiField("store_code")
	private String storeCode;

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

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
