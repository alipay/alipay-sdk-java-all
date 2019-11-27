package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PublicSummaryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.app.summary.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-12 15:41:11
 */
public class AlipayOpenPublicAppSummaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8272681276522972118L;

	/** 
	 * 生活号摘要信息列表
	 */
	@ApiListField("public_list")
	@ApiField("public_summary_info")
	private List<PublicSummaryInfo> publicList;

	public void setPublicList(List<PublicSummaryInfo> publicList) {
		this.publicList = publicList;
	}
	public List<PublicSummaryInfo> getPublicList( ) {
		return this.publicList;
	}

}
