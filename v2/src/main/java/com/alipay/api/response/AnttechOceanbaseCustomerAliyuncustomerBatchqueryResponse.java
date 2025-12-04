package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AliyunCustomerInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.customer.aliyuncustomer.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-04 14:06:58
 */
public class AnttechOceanbaseCustomerAliyuncustomerBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5627423628939114386L;

	/** 
	 * [{"customerName":"test1","cid":"cid1","userId":"test2"}]
	 */
	@ApiListField("aliyun_customer_info_list")
	@ApiField("aliyun_customer_info_d_t_o")
	private List<AliyunCustomerInfoDTO> aliyunCustomerInfoList;

	public void setAliyunCustomerInfoList(List<AliyunCustomerInfoDTO> aliyunCustomerInfoList) {
		this.aliyunCustomerInfoList = aliyunCustomerInfoList;
	}
	public List<AliyunCustomerInfoDTO> getAliyunCustomerInfoList( ) {
		return this.aliyunCustomerInfoList;
	}

}
