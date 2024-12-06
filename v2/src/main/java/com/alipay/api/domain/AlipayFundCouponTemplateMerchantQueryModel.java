package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户封面查询接口
 *
 * @author auto create
 * @since 1.0, 2022-12-05 19:35:52
 */
public class AlipayFundCouponTemplateMerchantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7498931863346531311L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 当前页，分页查询时指定的页码
	 */
	@ApiField("page")
	private String page;

	/**
	 * 分页的大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
