package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HuaweiMPBuyerDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.entityrole.huaweimp.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 10:02:31
 */
public class AnttechOceanbaseEntityroleHuaweimpBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3645992518664211579L;

	/** 
	 * [{"passportId":"test1","customerId":"test1","customerName":"test"}]
	 */
	@ApiListField("huawei_buyer_info_list")
	@ApiField("huawei_m_p_buyer_d_t_o")
	private List<HuaweiMPBuyerDTO> huaweiBuyerInfoList;

	public void setHuaweiBuyerInfoList(List<HuaweiMPBuyerDTO> huaweiBuyerInfoList) {
		this.huaweiBuyerInfoList = huaweiBuyerInfoList;
	}
	public List<HuaweiMPBuyerDTO> getHuaweiBuyerInfoList( ) {
		return this.huaweiBuyerInfoList;
	}

}
