package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RetailKbcodeQueryVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.kbcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailKbcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3346768376128766245L;

	/** 
	 * 口碑码信息列表
	 */
	@ApiListField("code_info_list")
	@ApiField("retail_kbcode_query_vo")
	private List<RetailKbcodeQueryVo> codeInfoList;

	/** 
	 * 口碑码总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setCodeInfoList(List<RetailKbcodeQueryVo> codeInfoList) {
		this.codeInfoList = codeInfoList;
	}
	public List<RetailKbcodeQueryVo> getCodeInfoList( ) {
		return this.codeInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
