package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ZmContractDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.contract.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-17 10:40:44
 */
public class ZhimaMerchantContractPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6794167978731937242L;

	/** 
	 * 合约详情信息
	 */
	@ApiListField("biz_data")
	@ApiField("zm_contract_detail")
	private List<ZmContractDetail> bizData;

	/** 
	 * 业务结果描述，成功则为空，失败才会有
	 */
	@ApiField("biz_desc")
	private String bizDesc;

	/** 
	 * 业务成功标识，success/failed
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	public void setBizData(List<ZmContractDetail> bizData) {
		this.bizData = bizData;
	}
	public List<ZmContractDetail> getBizData( ) {
		return this.bizData;
	}

	public void setBizDesc(String bizDesc) {
		this.bizDesc = bizDesc;
	}
	public String getBizDesc( ) {
		return this.bizDesc;
	}

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

}
