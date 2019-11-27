package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AmlRiskFlag;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.amlinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 00:55:47
 */
public class AlipaySecurityProdAmlinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2565746459729819697L;

	/** 
	 * 风险标签
	 */
	@ApiListField("flags")
	@ApiField("aml_risk_flag")
	private List<AmlRiskFlag> flags;

	/** 
	 * 是否在黑名单
	 */
	@ApiField("in_black_list")
	private Boolean inBlackList;

	/** 
	 * 是否在灰名单
	 */
	@ApiField("in_gray_list")
	private Boolean inGrayList;

	public void setFlags(List<AmlRiskFlag> flags) {
		this.flags = flags;
	}
	public List<AmlRiskFlag> getFlags( ) {
		return this.flags;
	}

	public void setInBlackList(Boolean inBlackList) {
		this.inBlackList = inBlackList;
	}
	public Boolean getInBlackList( ) {
		return this.inBlackList;
	}

	public void setInGrayList(Boolean inGrayList) {
		this.inGrayList = inGrayList;
	}
	public Boolean getInGrayList( ) {
		return this.inGrayList;
	}

}
