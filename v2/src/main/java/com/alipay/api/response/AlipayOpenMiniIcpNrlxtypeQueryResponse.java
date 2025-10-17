package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IcpNrlxTypeList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.icp.nrlxtype.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:02:08
 */
public class AlipayOpenMiniIcpNrlxtypeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1816292763629323537L;

	/** 
	 * 前置审批项类型
	 */
	@ApiListField("nrlx_types")
	@ApiField("icp_nrlx_type_list")
	private List<IcpNrlxTypeList> nrlxTypes;

	public void setNrlxTypes(List<IcpNrlxTypeList> nrlxTypes) {
		this.nrlxTypes = nrlxTypes;
	}
	public List<IcpNrlxTypeList> getNrlxTypes( ) {
		return this.nrlxTypes;
	}

}
