package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MpcpromoGoodsList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-02 19:26:53
 */
public class TechriskInnovateMpcpromoDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3114633763695733422L;

	/** 
	 * 商品数据列表
	 */
	@ApiListField("goods_list")
	@ApiField("mpcpromo_goods_list")
	private List<MpcpromoGoodsList> goodsList;

	public void setGoodsList(List<MpcpromoGoodsList> goodsList) {
		this.goodsList = goodsList;
	}
	public List<MpcpromoGoodsList> getGoodsList( ) {
		return this.goodsList;
	}

}
