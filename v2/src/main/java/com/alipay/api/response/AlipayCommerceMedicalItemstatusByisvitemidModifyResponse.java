package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IsvItemIdItemStatusFailDTO;
import com.alipay.api.domain.IsvItemIdItemStatusSuccessDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.itemstatus.byisvitemid.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-19 16:42:40
 */
public class AlipayCommerceMedicalItemstatusByisvitemidModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1639335312878415958L;

	/** 
	 * 失败信息
	 */
	@ApiListField("fail_list")
	@ApiField("isv_item_id_item_status_fail_d_t_o")
	private List<IsvItemIdItemStatusFailDTO> failList;

	/** 
	 * 成功信息
	 */
	@ApiListField("succ_list")
	@ApiField("isv_item_id_item_status_success_d_t_o")
	private List<IsvItemIdItemStatusSuccessDTO> succList;

	public void setFailList(List<IsvItemIdItemStatusFailDTO> failList) {
		this.failList = failList;
	}
	public List<IsvItemIdItemStatusFailDTO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<IsvItemIdItemStatusSuccessDTO> succList) {
		this.succList = succList;
	}
	public List<IsvItemIdItemStatusSuccessDTO> getSuccList( ) {
		return this.succList;
	}

}
