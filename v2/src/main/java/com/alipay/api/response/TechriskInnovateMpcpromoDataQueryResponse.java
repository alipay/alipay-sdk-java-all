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
 * @since 1.0, 2023-09-21 18:39:41
 */
public class TechriskInnovateMpcpromoDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2211252465547494426L;

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
