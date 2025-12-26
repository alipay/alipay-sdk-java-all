package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IsvItemIdItemStockFailDTO;
import com.alipay.api.domain.IsvItemIdItemStockSuccessDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.itemstock.byisvitemid.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-25 17:12:40
 */
public class AlipayCommerceMedicalItemstockByisvitemidModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7135935666563624539L;

	/** 
	 * 失败记录
	 */
	@ApiListField("fail_list")
	@ApiField("isv_item_id_item_stock_fail_d_t_o")
	private List<IsvItemIdItemStockFailDTO> failList;

	/** 
	 * 成功记录
	 */
	@ApiListField("succ_list")
	@ApiField("isv_item_id_item_stock_success_d_t_o")
	private List<IsvItemIdItemStockSuccessDTO> succList;

	public void setFailList(List<IsvItemIdItemStockFailDTO> failList) {
		this.failList = failList;
	}
	public List<IsvItemIdItemStockFailDTO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<IsvItemIdItemStockSuccessDTO> succList) {
		this.succList = succList;
	}
	public List<IsvItemIdItemStockSuccessDTO> getSuccList( ) {
		return this.succList;
	}

}
