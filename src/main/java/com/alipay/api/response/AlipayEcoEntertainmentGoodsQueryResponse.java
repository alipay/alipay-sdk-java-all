package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EntertainmentGoodsInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.entertainment.goods.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-28 09:59:21
 */
public class AlipayEcoEntertainmentGoodsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3297943488972888938L;

	/** 
	 * 数娱充值类商品查询结果,包含商品 id, 名称,供应商,价格和上下架时间等信息
	 */
	@ApiListField("goods_info_list")
	@ApiField("entertainment_goods_info")
	private List<EntertainmentGoodsInfo> goodsInfoList;

	public void setGoodsInfoList(List<EntertainmentGoodsInfo> goodsInfoList) {
		this.goodsInfoList = goodsInfoList;
	}
	public List<EntertainmentGoodsInfo> getGoodsInfoList( ) {
		return this.goodsInfoList;
	}

}
