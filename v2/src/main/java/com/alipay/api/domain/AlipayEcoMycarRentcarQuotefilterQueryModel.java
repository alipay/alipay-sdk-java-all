package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车报价过滤信息查询
 *
 * @author auto create
 * @since 1.0, 2024-10-15 14:56:34
 */
public class AlipayEcoMycarRentcarQuotefilterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7712215812249237983L;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 车型id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 门店名称
	 */
	@ApiField("sku_sname")
	private String skuSname;

	/**
	 * 起始城市名称
	 */
	@ApiField("start_city_name")
	private String startCityName;

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

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuSname() {
		return this.skuSname;
	}
	public void setSkuSname(String skuSname) {
		this.skuSname = skuSname;
	}

	public String getStartCityName() {
		return this.startCityName;
	}
	public void setStartCityName(String startCityName) {
		this.startCityName = startCityName;
	}

}
