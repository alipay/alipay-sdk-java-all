package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditlink.collect.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 19:26:37
 */
public class ZhimaCreditEpCreditlinkCollectBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7486839794688935335L;

	/** 
	 * 数据列表，其中list是JSON数据列表，目前只有招投标数据,其单项结构是

{
  "agentUnit": "XX招标代理有限公司",
  "areaCity": "B市",
  "areaCountry": "C区",
  "areaProvince": "A省",
  "biddingType": "0",
  "budget": "",
  "infoFile": [],
  "infoId": "123",    
  "infoPublishTime": "2021-11-12 18:02:48",  
  "infoTitle": "XXX成交结果公告",
  "infoType": "3",
  "infoTypeSegment": "11",
  "isElectronic": "0",
  "winnerAmount": "878000.00",
  "zhaoBiaoUnit": "XXX信息中心",
  "zhongBiaoUnit": "XXX分公司"
}
	 */
	@ApiField("contents")
	private String contents;

	/** 
	 * 当前请求的页码，和入参中的页码保持一致
	 */
	@ApiField("cur_page_number")
	private Long curPageNumber;

	/** 
	 * 数据采集状态，只有值为"END"才表示数据采集完成（包含没数据的情况，不存在数据也被认为是正常采集动作）。INIT表示任务还在初始化状态，COLLECT表示任务在进行中，FAIL表示任务处理失败。
	 */
	@ApiField("data_status")
	private String dataStatus;

	/** 
	 * 数据类型，和传入的数据类型保持一致
	 */
	@ApiField("data_type")
	private String dataType;

	/** 
	 * 商户单号，和入参中的商户单号保持一致
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	/** 
	 * 查询的总条数，此数据只有在data_status为"END"状态才有意义。为0，则表示未采集到有效数据
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 页码总数，商户根据此数据判定是否继续翻页操作获取数据。此数据只有在data_status为"END"状态才有意义。为0，则表示未采集到有效数据
	 */
	@ApiField("total_page_number")
	private Long totalPageNumber;

	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getContents( ) {
		return this.contents;
	}

	public void setCurPageNumber(Long curPageNumber) {
		this.curPageNumber = curPageNumber;
	}
	public Long getCurPageNumber( ) {
		return this.curPageNumber;
	}

	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus;
	}
	public String getDataStatus( ) {
		return this.dataStatus;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getDataType( ) {
		return this.dataType;
	}

	public void setMerchantRequestId(String merchantRequestId) {
		this.merchantRequestId = merchantRequestId;
	}
	public String getMerchantRequestId( ) {
		return this.merchantRequestId;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPageNumber(Long totalPageNumber) {
		this.totalPageNumber = totalPageNumber;
	}
	public Long getTotalPageNumber( ) {
		return this.totalPageNumber;
	}

}
