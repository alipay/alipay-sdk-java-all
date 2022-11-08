package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达列表查询
 *
 * @author auto create
 * @since 1.0, 2022-08-09 11:08:40
 */
public class AlipayOpenSearchBoxBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5751357824953623842L;

	/**
	 * 商户id，代运营模式下传入。代运营模式，需要服务商已获得商家"运营支付宝小程序"授权。
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 分页查询的当前页号,从1开始
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 每页查询的数量，默认10，不得超过50
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
