package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreativeDesignInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apecreative.styledesignrelation.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-27 20:51:57
 */
public class AlipayDigitalopUcdpApecreativeStyledesignrelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6112222695922431439L;

	/** 
	 * 布局id 和对应的关联信息
	 */
	@ApiField("creative_design_info_list")
	private CreativeDesignInfo creativeDesignInfoList;

	/** 
	 * 布局id对应的关联信息
	 */
	@ApiListField("select_design_info_list")
	@ApiField("creative_design_info")
	private List<CreativeDesignInfo> selectDesignInfoList;

	public void setCreativeDesignInfoList(CreativeDesignInfo creativeDesignInfoList) {
		this.creativeDesignInfoList = creativeDesignInfoList;
	}
	public CreativeDesignInfo getCreativeDesignInfoList( ) {
		return this.creativeDesignInfoList;
	}

	public void setSelectDesignInfoList(List<CreativeDesignInfo> selectDesignInfoList) {
		this.selectDesignInfoList = selectDesignInfoList;
	}
	public List<CreativeDesignInfo> getSelectDesignInfoList( ) {
		return this.selectDesignInfoList;
	}

}
