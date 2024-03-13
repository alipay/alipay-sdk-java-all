package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EpLabelContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.acceptance.labelpreview.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-19 16:28:01
 */
public class ZhimaCreditEpAcceptanceLabelpreviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1378599844329998183L;

	/** 
	 * 是否授权标签信用服务
	 */
	@ApiField("has_authed")
	private Boolean hasAuthed;

	/** 
	 * 企业名下是否有正向标签
	 */
	@ApiField("has_data")
	private Boolean hasData;

	/** 
	 * 企业标签内容模型
	 */
	@ApiListField("label_content")
	@ApiField("ep_label_content")
	private List<EpLabelContent> labelContent;

	public void setHasAuthed(Boolean hasAuthed) {
		this.hasAuthed = hasAuthed;
	}
	public Boolean getHasAuthed( ) {
		return this.hasAuthed;
	}

	public void setHasData(Boolean hasData) {
		this.hasData = hasData;
	}
	public Boolean getHasData( ) {
		return this.hasData;
	}

	public void setLabelContent(List<EpLabelContent> labelContent) {
		this.labelContent = labelContent;
	}
	public List<EpLabelContent> getLabelContent( ) {
		return this.labelContent;
	}

}
