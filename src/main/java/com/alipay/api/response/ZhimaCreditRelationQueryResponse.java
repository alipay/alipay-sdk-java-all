package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RelationInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.relation.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaCreditRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4241824597215492442L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 对关系的具体描述，只有存在关系时才能输出
	 */
	@ApiField("relation_info")
	private RelationInfo relationInfo;

	/** 
	 * 关系强度，具体关系强度code见产品文档
	 */
	@ApiField("relation_rank")
	private String relationRank;

	/** 
	 * 0~100整数，分数越高与输入关系越匹配度越高，如果入参无relation，则该值为0
	 */
	@ApiField("relation_score")
	private Long relationScore;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setRelationInfo(RelationInfo relationInfo) {
		this.relationInfo = relationInfo;
	}
	public RelationInfo getRelationInfo( ) {
		return this.relationInfo;
	}

	public void setRelationRank(String relationRank) {
		this.relationRank = relationRank;
	}
	public String getRelationRank( ) {
		return this.relationRank;
	}

	public void setRelationScore(Long relationScore) {
		this.relationScore = relationScore;
	}
	public Long getRelationScore( ) {
		return this.relationScore;
	}

}
