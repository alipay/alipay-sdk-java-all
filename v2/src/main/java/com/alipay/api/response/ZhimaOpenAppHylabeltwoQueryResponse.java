package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Hylabel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.open.app.hylabeltwo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-11 10:32:39
 */
public class ZhimaOpenAppHylabeltwoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6542692344745685229L;

	/** 
	 * 行业分类概率列表
	 */
	@ApiListField("hylabel_list")
	@ApiField("hylabel")
	private List<Hylabel> hylabelList;

	public void setHylabelList(List<Hylabel> hylabelList) {
		this.hylabelList = hylabelList;
	}
	public List<Hylabel> getHylabelList( ) {
		return this.hylabelList;
	}

}
