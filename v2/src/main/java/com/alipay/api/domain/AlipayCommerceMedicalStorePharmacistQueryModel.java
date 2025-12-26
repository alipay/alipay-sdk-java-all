package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询门店药师
 *
 * @author auto create
 * @since 1.0, 2025-04-16 10:10:13
 */
public class AlipayCommerceMedicalStorePharmacistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8698669793849756695L;

	/**
	 * 组织渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 页码，默认：1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页大小，默认：20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * APP方门店编码
	 */
	@ApiField("store_code")
	private String storeCode;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

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

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
