package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IsvItemIdItemPriceFailDTO;
import com.alipay.api.domain.IsvItemIdItemPriceSuccessDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.itemprice.byisvitemid.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-26 14:27:41
 */
public class AlipayCommerceMedicalItempriceByisvitemidModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8464966251886819626L;

	/** 
	 * 失败信息
	 */
	@ApiListField("fail_list")
	@ApiField("isv_item_id_item_price_fail_d_t_o")
	private List<IsvItemIdItemPriceFailDTO> failList;

	/** 
	 * 成功信息
	 */
	@ApiListField("succ_list")
	@ApiField("isv_item_id_item_price_success_d_t_o")
	private List<IsvItemIdItemPriceSuccessDTO> succList;

	public void setFailList(List<IsvItemIdItemPriceFailDTO> failList) {
		this.failList = failList;
	}
	public List<IsvItemIdItemPriceFailDTO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<IsvItemIdItemPriceSuccessDTO> succList) {
		this.succList = succList;
	}
	public List<IsvItemIdItemPriceSuccessDTO> getSuccList( ) {
		return this.succList;
	}

}
