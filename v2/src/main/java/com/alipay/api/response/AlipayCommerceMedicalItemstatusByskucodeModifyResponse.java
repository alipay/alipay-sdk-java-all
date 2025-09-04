package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SkuCodeItemStatusFailDTO;
import com.alipay.api.domain.SkuCodeItemStatusSuccessDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.itemstatus.byskucode.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-30 15:12:27
 */
public class AlipayCommerceMedicalItemstatusByskucodeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1764342845469985756L;

	/** 
	 * 上下架操作失败信息列表
	 */
	@ApiListField("fail_list")
	@ApiField("sku_code_item_status_fail_d_t_o")
	private List<SkuCodeItemStatusFailDTO> failList;

	/** 
	 * 上下架操作成功信息列表
	 */
	@ApiListField("succ_list")
	@ApiField("sku_code_item_status_success_d_t_o")
	private List<SkuCodeItemStatusSuccessDTO> succList;

	public void setFailList(List<SkuCodeItemStatusFailDTO> failList) {
		this.failList = failList;
	}
	public List<SkuCodeItemStatusFailDTO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<SkuCodeItemStatusSuccessDTO> succList) {
		this.succList = succList;
	}
	public List<SkuCodeItemStatusSuccessDTO> getSuccList( ) {
		return this.succList;
	}

}
