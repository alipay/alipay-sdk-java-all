package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SkuStockPriceResultVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.item.price.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 15:52:28
 */
public class AlipayCommerceMedicalItemPriceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5125694118132223889L;

	/** 
	 * 该参数代表批量操作失败的列表，会具体返回失败的商品信息以及失败代码和失败原因。
	 */
	@ApiListField("fail_list")
	@ApiField("sku_stock_price_result_v_o")
	private List<SkuStockPriceResultVO> failList;

	/** 
	 * 该参数代表商家批量操作成功的列表，返回成功的商品具体信息。
	 */
	@ApiListField("succ_list")
	@ApiField("sku_stock_price_result_v_o")
	private List<SkuStockPriceResultVO> succList;

	public void setFailList(List<SkuStockPriceResultVO> failList) {
		this.failList = failList;
	}
	public List<SkuStockPriceResultVO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<SkuStockPriceResultVO> succList) {
		this.succList = succList;
	}
	public List<SkuStockPriceResultVO> getSuccList( ) {
		return this.succList;
	}

}
