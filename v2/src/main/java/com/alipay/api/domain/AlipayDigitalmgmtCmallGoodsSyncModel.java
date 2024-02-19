package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品同步接口
 *
 * @author auto create
 * @since 1.0, 2024-01-19 14:32:51
 */
public class AlipayDigitalmgmtCmallGoodsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1294817415657295821L;

	/**
	 * access_goods_dto，用于商品同步
	 */
	@ApiField("access_goods_dto")
	private AccessGoodsDto accessGoodsDto;

	/**
	 * access_product_dto，用于商品同步
	 */
	@ApiField("access_product_dto")
	private AccessProductDto accessProductDto;

	public AccessGoodsDto getAccessGoodsDto() {
		return this.accessGoodsDto;
	}
	public void setAccessGoodsDto(AccessGoodsDto accessGoodsDto) {
		this.accessGoodsDto = accessGoodsDto;
	}

	public AccessProductDto getAccessProductDto() {
		return this.accessProductDto;
	}
	public void setAccessProductDto(AccessProductDto accessProductDto) {
		this.accessProductDto = accessProductDto;
	}

}
