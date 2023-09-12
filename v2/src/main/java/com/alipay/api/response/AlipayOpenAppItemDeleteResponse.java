package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemSpuIdPair;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 14:52:20
 */
public class AlipayOpenAppItemDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6139778659156279788L;

	/** 
	 * 删除成功的商家侧商品ID和支付宝平台侧商品ID列表
	 */
	@ApiListField("records")
	@ApiField("item_spu_id_pair")
	private List<ItemSpuIdPair> records;

	public void setRecords(List<ItemSpuIdPair> records) {
		this.records = records;
	}
	public List<ItemSpuIdPair> getRecords( ) {
		return this.records;
	}

}
