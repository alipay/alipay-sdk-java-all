package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BailAuthOrderDTO;
import com.alipay.api.domain.StandardBailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.bail.order.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:16:50
 */
public class AlipayFundBailOrderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7683254282325947829L;

	/** 
	 * 入参uid下查询到的保证金主单列表
	 */
	@ApiListField("bail_auth_list")
	@ApiField("bail_auth_order_d_t_o")
	private List<BailAuthOrderDTO> bailAuthList;

	/** 
	 * 入参uid下查询到的标准保证金（商城保证金/老消保保证金）列表
	 */
	@ApiListField("standard_bail_list")
	@ApiField("standard_bail_d_t_o")
	private List<StandardBailDTO> standardBailList;

	public void setBailAuthList(List<BailAuthOrderDTO> bailAuthList) {
		this.bailAuthList = bailAuthList;
	}
	public List<BailAuthOrderDTO> getBailAuthList( ) {
		return this.bailAuthList;
	}

	public void setStandardBailList(List<StandardBailDTO> standardBailList) {
		this.standardBailList = standardBailList;
	}
	public List<StandardBailDTO> getStandardBailList( ) {
		return this.standardBailList;
	}

}
