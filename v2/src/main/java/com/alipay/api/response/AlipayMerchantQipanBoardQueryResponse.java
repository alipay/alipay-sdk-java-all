package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BoardIndex;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.board.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 15:41:04
 */
public class AlipayMerchantQipanBoardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7827274687219542713L;

	/** 
	 * 人群看板分析数据
	 */
	@ApiListField("index_list")
	@ApiField("board_index")
	private List<BoardIndex> indexList;

	public void setIndexList(List<BoardIndex> indexList) {
		this.indexList = indexList;
	}
	public List<BoardIndex> getIndexList( ) {
		return this.indexList;
	}

}
