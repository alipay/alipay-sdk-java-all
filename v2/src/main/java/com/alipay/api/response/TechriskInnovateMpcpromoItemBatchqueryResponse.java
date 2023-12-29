package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MpcItemVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.item.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-10 16:31:46
 */
public class TechriskInnovateMpcpromoItemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6177882318141942768L;

	/** 
	 * 商品信息
	 */
	@ApiField("item_list")
	private MpcItemVO itemList;

	/** 
	 * 每页商品数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 授权店铺名
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 店铺商品总数
	 */
	@ApiField("total")
	private String total;

	public void setItemList(MpcItemVO itemList) {
		this.itemList = itemList;
	}
	public MpcItemVO getItemList( ) {
		return this.itemList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal( ) {
		return this.total;
	}

}
