package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.orgfourelements.match response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-29 15:21:58
 */
public class ZhimaCreditEpOrgfourelementsMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 3425732384284579683L;

	/** 
	 * 四要素匹配结果码
	 */
	@ApiField("match_code")
	private String matchCode;

	/** 
	 * 校验结果不匹配列
	 */
	@ApiListField("match_result_columns")
	@ApiField("string")
	private List<String> matchResultColumns;

	public void setMatchCode(String matchCode) {
		this.matchCode = matchCode;
	}
	public String getMatchCode( ) {
		return this.matchCode;
	}

	public void setMatchResultColumns(List<String> matchResultColumns) {
		this.matchResultColumns = matchResultColumns;
	}
	public List<String> getMatchResultColumns( ) {
		return this.matchResultColumns;
	}

}
