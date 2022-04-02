package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CodeResInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.product.code.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-30 15:11:02
 */
public class ZhimaCreditEpProductCodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3172779796536963719L;

	/** 
	 * 批次号,本次申请单据号与商户所传org_biz_no一一对应
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 申码结果信息:
code_id  二维码唯一标识id;
code_url 二维码url地址
	 */
	@ApiListField("code_list")
	@ApiField("code_res_info")
	private List<CodeResInfo> codeList;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setCodeList(List<CodeResInfo> codeList) {
		this.codeList = codeList;
	}
	public List<CodeResInfo> getCodeList( ) {
		return this.codeList;
	}

}
