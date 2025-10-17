package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WelfareForestDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.welfareforest.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 15:33:51
 */
public class AlipaySocialAntforestWelfareforestBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7676451783984556879L;

	/** 
	 * 用于页面展示使用的图片等信息
	 */
	@ApiField("global_display_info")
	private String globalDisplayInfo;

	/** 
	 * 公益林详情信息列表
	 */
	@ApiListField("welfare_forest_detail_list")
	@ApiField("welfare_forest_detail_d_t_o")
	private List<WelfareForestDetailDTO> welfareForestDetailList;

	public void setGlobalDisplayInfo(String globalDisplayInfo) {
		this.globalDisplayInfo = globalDisplayInfo;
	}
	public String getGlobalDisplayInfo( ) {
		return this.globalDisplayInfo;
	}

	public void setWelfareForestDetailList(List<WelfareForestDetailDTO> welfareForestDetailList) {
		this.welfareForestDetailList = welfareForestDetailList;
	}
	public List<WelfareForestDetailDTO> getWelfareForestDetailList( ) {
		return this.welfareForestDetailList;
	}

}
