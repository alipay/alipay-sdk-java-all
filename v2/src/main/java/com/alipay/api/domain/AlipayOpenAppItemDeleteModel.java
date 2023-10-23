package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序商品删除接口
 *
 * @author auto create
 * @since 1.0, 2023-09-11 14:52:20
 */
public class AlipayOpenAppItemDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4717225371734448277L;

	/**
	 * 支付宝平台侧商品ID列表，最多20个，所选商品下所有sku均会被删除。
与out_item_id_list二选一必填，如果两个参数都填，优先使用商家侧商品ID。
	 */
	@ApiListField("item_id_list")
	@ApiField("string")
	private List<String> itemIdList;

	/**
	 * 商家侧商品ID列表，最多20个，所选商品下所有sku均会被删除。
与item_id_list二选一必填。
	 */
	@ApiListField("out_item_id_list")
	@ApiField("string")
	private List<String> outItemIdList;

	public List<String> getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(List<String> itemIdList) {
		this.itemIdList = itemIdList;
	}

	public List<String> getOutItemIdList() {
		return this.outItemIdList;
	}
	public void setOutItemIdList(List<String> outItemIdList) {
		this.outItemIdList = outItemIdList;
	}

}
