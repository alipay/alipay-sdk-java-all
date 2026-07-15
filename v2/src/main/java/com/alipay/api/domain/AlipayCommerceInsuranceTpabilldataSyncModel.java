package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * TPA账单数据同步
 *
 * @author auto create
 * @since 1.0, 2026-06-25 16:02:56
 */
public class AlipayCommerceInsuranceTpabilldataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4783924339289717175L;

	/**
	 * null
	 */
	@ApiListField("tpa_bill_data_list")
	@ApiField("tpa_bill_data_d_t_o")
	private List<TpaBillDataDTO> tpaBillDataList;

	/**
	 * TPA编号
	 */
	@ApiField("tpa_id")
	private String tpaId;

	public List<TpaBillDataDTO> getTpaBillDataList() {
		return this.tpaBillDataList;
	}
	public void setTpaBillDataList(List<TpaBillDataDTO> tpaBillDataList) {
		this.tpaBillDataList = tpaBillDataList;
	}

	public String getTpaId() {
		return this.tpaId;
	}
	public void setTpaId(String tpaId) {
		this.tpaId = tpaId;
	}

}
