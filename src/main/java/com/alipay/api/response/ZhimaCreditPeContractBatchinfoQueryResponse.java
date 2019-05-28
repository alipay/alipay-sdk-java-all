package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.contract.batchinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaCreditPeContractBatchinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2314878765351551849L;

	/** 
	 * 本批次记录条数
	 */
	@ApiField("batch_record")
	private Long batchRecord;

	/** 
	 * 记录数据，通过gzip压缩
	 */
	@ApiField("data_content")
	private String dataContent;

	/** 
	 * 数据MD5签名
	 */
	@ApiField("md_5_sign")
	private String md5Sign;

	/** 
	 * 下一个查询批次号
	 */
	@ApiField("next_batch_index")
	private Long nextBatchIndex;

	/** 
	 * 总记录条数
	 */
	@ApiField("total_record")
	private Long totalRecord;

	/** 
	 * 查询事务号，包含时间戳因素，只会返回在这个事务号之前创建的相关合约
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public void setBatchRecord(Long batchRecord) {
		this.batchRecord = batchRecord;
	}
	public Long getBatchRecord( ) {
		return this.batchRecord;
	}

	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}
	public String getDataContent( ) {
		return this.dataContent;
	}

	public void setMd5Sign(String md5Sign) {
		this.md5Sign = md5Sign;
	}
	public String getMd5Sign( ) {
		return this.md5Sign;
	}

	public void setNextBatchIndex(Long nextBatchIndex) {
		this.nextBatchIndex = nextBatchIndex;
	}
	public Long getNextBatchIndex( ) {
		return this.nextBatchIndex;
	}

	public void setTotalRecord(Long totalRecord) {
		this.totalRecord = totalRecord;
	}
	public Long getTotalRecord( ) {
		return this.totalRecord;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionId( ) {
		return this.transactionId;
	}

}
