package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GoodsVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.goods.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsGoodsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4418629418369813955L;

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
	private Long totalCount;

	public void setGoods(List<GoodsVO> goods) {
		this.goods = goods;
	}
	public List<GoodsVO> getGoods( ) {
		return this.goods;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
