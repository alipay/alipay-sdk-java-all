package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SkuStockPriceResultVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.item.calendarstock.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-13 19:47:45
 */
public class AlipayCommerceMedicalItemCalendarstockModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2587424532282556234L;

	/** 
	 * null
	 */
	@ApiListField("fail_list")
	@ApiField("sku_stock_price_result_v_o")
	private List<SkuStockPriceResultVO> failList;

	/** 
	 * null
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
