package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RebusinessEntityRelation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.rebusinessentity.person.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-18 14:02:40
 */
public class ZhimaCreditEpRebusinessentityPersonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4292625748583765657L;

	/** 
	 * 关系数据集
	 */
	@ApiField("data")
	private RebusinessEntityRelation data;

	/** 
	 * 法人姓名（同入参）
	 */
	@ApiField("person_name")
	private String personName;

	/** 
	 * 企业18位统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public void setData(RebusinessEntityRelation data) {
		this.data = data;
	}
	public RebusinessEntityRelation getData( ) {
		return this.data;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonName( ) {
		return this.personName;
	}

	public void setUscc(String uscc) {
		this.uscc = uscc;
	}
	public String getUscc( ) {
		return this.uscc;
	}

}
