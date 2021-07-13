package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.notaryprocsum.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-03 01:23:10
 */
public class AlipayBossProdAntlegalchainNotaryprocsumQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2215139751611244544L;

	/** 
	 * 法链业务ID,用于查询上链状态
	 */
	@ApiField("bas_data_id")
	private String basDataId;

	/** 
	 * 操作记录列表
	 */
	@ApiListField("record_list")
	@ApiField("query_record")
	private List<QueryRecord> recordList;

	public void setBasDataId(String basDataId) {
		this.basDataId = basDataId;
	}
	public String getBasDataId( ) {
		return this.basDataId;
	}

	public void setRecordList(List<QueryRecord> recordList) {
		this.recordList = recordList;
	}
	public List<QueryRecord> getRecordList( ) {
		return this.recordList;
	}

}
