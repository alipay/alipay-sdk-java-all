package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OBBatchCustomerIdentityDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obcustomercore.batchuserentity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-06 17:47:41
 */
public class AnttechOceanbaseObcustomercoreBatchuserentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4491722151465359431L;

	/** 
	 * 客户身份信息列表
	 */
	@ApiListField("customer_identity_list")
	@ApiField("o_b_batch_customer_identity_d_t_o")
	private List<OBBatchCustomerIdentityDTO> customerIdentityList;

	public void setCustomerIdentityList(List<OBBatchCustomerIdentityDTO> customerIdentityList) {
		this.customerIdentityList = customerIdentityList;
	}
	public List<OBBatchCustomerIdentityDTO> getCustomerIdentityList( ) {
		return this.customerIdentityList;
	}

}
