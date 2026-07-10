package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AShopItemVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.unishop.itemlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-02 11:47:51
 */
public class AlipayOpenAppUnishopItemlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2443113785317342759L;

	/** 
	 * 团购门店id
	 */
	@ApiField("a_shop_id")
	private String aShopId;

	/** 
	 * null
	 */
	@ApiListField("item_list")
	@ApiField("a_shop_item_v_o")
	private List<AShopItemVO> itemList;

	/** 
	 * 商品总条数
	 */
	@ApiField("total")
	private Long total;

	public void setaShopId(String aShopId) {
		this.aShopId = aShopId;
	}
	public String getaShopId( ) {
		return this.aShopId;
	}

	public void setItemList(List<AShopItemVO> itemList) {
		this.itemList = itemList;
	}
	public List<AShopItemVO> getItemList( ) {
		return this.itemList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
