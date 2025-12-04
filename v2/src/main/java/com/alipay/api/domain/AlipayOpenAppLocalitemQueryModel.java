package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序本地商品详情查询接口
 *
 * @author auto create
 * @since 1.0, 2025-10-22 16:58:04
 */
public class AlipayOpenAppLocalitemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4865677744758838522L;

	/**
	 * 店铺id
	 */
	@ApiField("a_store_id")
	private String aStoreId;

	/**
	 * 支付平台侧商品id。与商家侧商品id不能同时为空，如果都提供，优先使用商家侧商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 是否查询编辑版本。默认为0
	 */
	@ApiField("need_edit_spu")
	private String needEditSpu;

	/**
	 * 商家侧商品id。与支付平台侧商品id不能同时为空，如果都提供，优先使用商家侧商品id。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public String getaStoreId() {
		return this.aStoreId;
	}
	public void setaStoreId(String aStoreId) {
		this.aStoreId = aStoreId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getNeedEditSpu() {
		return this.needEditSpu;
	}
	public void setNeedEditSpu(String needEditSpu) {
		this.needEditSpu = needEditSpu;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

}
