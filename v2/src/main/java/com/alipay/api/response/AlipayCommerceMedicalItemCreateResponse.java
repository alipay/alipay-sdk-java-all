package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemCreateFailInfoDTO;
import com.alipay.api.domain.ItemCreateSuccessInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-20 10:09:00
 */
public class AlipayCommerceMedicalItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4534987772734847845L;

	/** 
	 * 失败记录
	 */
	@ApiListField("fail_list")
	@ApiField("item_create_fail_info_d_t_o")
	private List<ItemCreateFailInfoDTO> failList;

	/** 
	 * 成功记录
	 */
	@ApiListField("succ_list")
	@ApiField("item_create_success_info_d_t_o")
	private List<ItemCreateSuccessInfoDTO> succList;

	public void setFailList(List<ItemCreateFailInfoDTO> failList) {
		this.failList = failList;
	}
	public List<ItemCreateFailInfoDTO> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<ItemCreateSuccessInfoDTO> succList) {
		this.succList = succList;
	}
	public List<ItemCreateSuccessInfoDTO> getSuccList( ) {
		return this.succList;
	}

}
