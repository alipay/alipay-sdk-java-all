package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UniqueBizInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.servicepackage.grantbyphoneno.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-10 11:37:55
 */
public class AlipayCommerceMedicalServicepackageGrantbyphonenoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7832374652945666971L;

	/** 
	 * null
	 */
	@ApiListField("sub_unique_biz_info_list")
	@ApiField("unique_biz_info")
	private List<UniqueBizInfo> subUniqueBizInfoList;

	/** 
	 * 业务唯一单号
	 */
	@ApiField("unique_biz_no")
	private String uniqueBizNo;

	public void setSubUniqueBizInfoList(List<UniqueBizInfo> subUniqueBizInfoList) {
		this.subUniqueBizInfoList = subUniqueBizInfoList;
	}
	public List<UniqueBizInfo> getSubUniqueBizInfoList( ) {
		return this.subUniqueBizInfoList;
	}

	public void setUniqueBizNo(String uniqueBizNo) {
		this.uniqueBizNo = uniqueBizNo;
	}
	public String getUniqueBizNo( ) {
		return this.uniqueBizNo;
	}

}
