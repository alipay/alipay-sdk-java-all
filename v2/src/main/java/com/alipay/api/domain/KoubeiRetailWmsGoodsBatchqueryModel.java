package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑零售货品信息批量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:16:42
 */
public class KoubeiRetailWmsGoodsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7534151997632347487L;

	/**
	 * 货品编码，限制批量查询100个
	 */
	@ApiListField("goods_codes")
	@ApiField("string")
	private List<String> goodsCodes;

	public List<String> getGoodsCodes() {
		return this.goodsCodes;
	}
	public void setGoodsCodes(List<String> goodsCodes) {
		this.goodsCodes = goodsCodes;
	}

}
