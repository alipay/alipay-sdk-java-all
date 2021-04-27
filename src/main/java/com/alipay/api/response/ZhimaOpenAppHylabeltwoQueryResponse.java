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
 * @since 1.0, 2021-03-22 10:27:32
 */
public class ZhimaOpenAppHylabeltwoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5876652887419763893L;

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
