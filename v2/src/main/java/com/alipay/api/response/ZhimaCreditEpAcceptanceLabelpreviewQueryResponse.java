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
 * @since 1.0, 2024-04-01 12:02:00
 */
public class ZhimaCreditEpAcceptanceLabelpreviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1346875429578138222L;

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

	/** 
	 * 企业名下预计标签数量
	 */
	@ApiField("label_count")
	private Long labelCount;

	/** 
	 * 标签展示类型
	 */
	@ApiField("label_show_type")
	private String labelShowType;

	/** 
	 * 企业名下标签待获取数量
	 */
	@ApiField("label_to_obtain_count")
	private Long labelToObtainCount;

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

	public void setLabelCount(Long labelCount) {
		this.labelCount = labelCount;
	}
	public Long getLabelCount( ) {
		return this.labelCount;
	}

	public void setLabelShowType(String labelShowType) {
		this.labelShowType = labelShowType;
	}
	public String getLabelShowType( ) {
		return this.labelShowType;
	}

	public void setLabelToObtainCount(Long labelToObtainCount) {
		this.labelToObtainCount = labelToObtainCount;
	}
	public Long getLabelToObtainCount( ) {
		return this.labelToObtainCount;
	}

}
