package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TaxBillContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.invoices.inference.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:32:00
 */
public class AlipayIserviceCognitiveInvoicesInferenceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4823519737235515737L;

	/** 
	 * 算法版本
	 */
	@ApiField("algo_version")
	private String algoVersion;

	/** 
	 * 增值税发票内容
	 */
	@ApiField("content")
	private TaxBillContent content;

	/** 
	 * 当ret不为0，err_msg记录详细错误原因
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 返回值
	 */
	@ApiField("ret")
	private String ret;

	public void setAlgoVersion(String algoVersion) {
		this.algoVersion = algoVersion;
	}
	public String getAlgoVersion( ) {
		return this.algoVersion;
	}

	public void setContent(TaxBillContent content) {
		this.content = content;
	}
	public TaxBillContent getContent( ) {
		return this.content;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setRet(String ret) {
		this.ret = ret;
	}
	public String getRet( ) {
		return this.ret;
	}

}
