package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.findata.operator.userinfo.certify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class SsdataFindataOperatorUserinfoCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1721592418672593717L;

	/** 
	 * 系统业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 返回的表单key值
	 */
	@ApiListField("form_list")
	@ApiField("string")
	private List<String> formList;

	/** 
	 * 商户系统的业务流水号
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setFormList(List<String> formList) {
		this.formList = formList;
	}
	public List<String> getFormList( ) {
		return this.formList;
	}

	public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}
	public String getOrgBizNo( ) {
		return this.orgBizNo;
	}

}
