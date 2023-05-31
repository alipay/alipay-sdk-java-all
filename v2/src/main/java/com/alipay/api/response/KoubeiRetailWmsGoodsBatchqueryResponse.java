package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GoodsVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.goods.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:33:45
 */
public class KoubeiRetailWmsGoodsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5454925893217923997L;

	/** 
	 * 货品信息
	 */
	@ApiListField("goods")
	@ApiField("goods_v_o")
	private List<GoodsVO> goods;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setGoods(List<GoodsVO> goods) {
		this.goods = goods;
	}
	public List<GoodsVO> getGoods( ) {
		return this.goods;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
