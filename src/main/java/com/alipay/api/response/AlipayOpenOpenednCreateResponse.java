package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GavintestNewLeveaOne;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.openedn.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-21 17:48:31
 */
public class AlipayOpenOpenednCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1671265213449652523L;

	/** 
	 * 21
	 */
	@ApiListField("de")
	@ApiField("gavintest_new_levea_one")
	private List<GavintestNewLeveaOne> de;

	/** 
	 * 2
	 */
	@ApiListField("des")
	@ApiField("string")
	private List<String> des;

	public void setDe(List<GavintestNewLeveaOne> de) {
		this.de = de;
	}
	public List<GavintestNewLeveaOne> getDe( ) {
		return this.de;
	}

	public void setDes(List<String> des) {
		this.des = des;
	}
	public List<String> getDes( ) {
		return this.des;
	}

}
