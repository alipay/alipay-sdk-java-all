package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbCodeInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.kbcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringKbcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4137936751685922376L;

	/** 
	 * 口碑码信息列表
	 */
	@ApiListField("code_info_list")
	@ApiField("kb_code_info_v_o")
	private List<KbCodeInfoVO> codeInfoList;

	/** 
	 * 当前页码（大于0的整数）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页返回的记录数（0~100的整数）
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 口碑码总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setCodeInfoList(List<KbCodeInfoVO> codeInfoList) {
		this.codeInfoList = codeInfoList;
	}
	public List<KbCodeInfoVO> getCodeInfoList( ) {
		return this.codeInfoList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
