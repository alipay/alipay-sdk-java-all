package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PassportInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passportinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-20 21:28:08
 */
public class AnttechOceanbasePassportinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1598299225198198271L;

	/** 
	 * 注册账号信息列表
	 */
	@ApiListField("passport_infos")
	@ApiField("passport_info_d_t_o")
	private List<PassportInfoDTO> passportInfos;

	public void setPassportInfos(List<PassportInfoDTO> passportInfos) {
		this.passportInfos = passportInfos;
	}
	public List<PassportInfoDTO> getPassportInfos( ) {
		return this.passportInfos;
	}

}
