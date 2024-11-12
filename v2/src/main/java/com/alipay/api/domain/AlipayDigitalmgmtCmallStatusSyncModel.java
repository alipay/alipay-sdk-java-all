package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商城商品状态同步
 *
 * @author auto create
 * @since 1.0, 2023-06-28 13:29:15
 */
public class AlipayDigitalmgmtCmallStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8812539738811974261L;

	/**
	 * goods_data_source，用于商品状态同步，由调用方传入
	 */
	@ApiField("goods_data_source")
	private String goodsDataSource;

	/**
	 * goods_source_value，用于商品状态同步，由调用方传入
	 */
	@ApiField("goods_source_value")
	private String goodsSourceValue;

	/**
	 * status，用于商品状态同步，由调用方传入
	 */
	@ApiField("status")
	private String status;

	public String getGoodsDataSource() {
		return this.goodsDataSource;
	}
	public void setGoodsDataSource(String goodsDataSource) {
		this.goodsDataSource = goodsDataSource;
	}

	public String getGoodsSourceValue() {
		return this.goodsSourceValue;
	}
	public void setGoodsSourceValue(String goodsSourceValue) {
		this.goodsSourceValue = goodsSourceValue;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
