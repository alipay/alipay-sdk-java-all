package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PublicLabel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.label.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 20:12:41
 */
public class AlipayOpenPublicLabelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1234169889176166982L;

	/** 
	 * 该服务窗拥有的标签列表
	 */
	@ApiListField("label_list")
	@ApiField("public_label")
	private List<PublicLabel> labelList;

	public void setLabelList(List<PublicLabel> labelList) {
		this.labelList = labelList;
	}
	public List<PublicLabel> getLabelList( ) {
		return this.labelList;
	}

}
