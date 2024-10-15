package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FmBindFmVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.fm.bindlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-09 09:57:05
 */
public class AlipayCommerceMedicalFmBindlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5894265833422559597L;

	/** 
	 * 主账户绑定的亲情账户列表
	 */
	@ApiListField("bind_list")
	@ApiField("fm_bind_fm_v_o")
	private List<FmBindFmVO> bindList;

	public void setBindList(List<FmBindFmVO> bindList) {
		this.bindList = bindList;
	}
	public List<FmBindFmVO> getBindList( ) {
		return this.bindList;
	}

}
