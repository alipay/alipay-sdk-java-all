package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VerifyInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.finrisk.company.verify.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-22 15:10:01
 */
public class AlipayAccountFinriskCompanyVerifyGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2187481333146246981L;

	/** 
	 * 二代结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 三代结果码
	 */
	@ApiField("result_code_third")
	private String resultCodeThird;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 是否业务处理成功。 true：处理成功；false：处理失败。 默认：false
	 */
	@ApiField("success")
	private String success;

	/** 
	 * 防伪结果信息
	 */
	@ApiListField("verify_info")
	@ApiField("verify_info_v_o")
	private List<VerifyInfoVO> verifyInfo;

	/** 
	 * 防伪结果码
	 */
	@ApiField("verify_result_code")
	private String verifyResultCode;

	/** 
	 * 防伪结果描述
	 */
	@ApiField("verify_result_desc")
	private String verifyResultDesc;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultCodeThird(String resultCodeThird) {
		this.resultCodeThird = resultCodeThird;
	}
	public String getResultCodeThird( ) {
		return this.resultCodeThird;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

	public void setVerifyInfo(List<VerifyInfoVO> verifyInfo) {
		this.verifyInfo = verifyInfo;
	}
	public List<VerifyInfoVO> getVerifyInfo( ) {
		return this.verifyInfo;
	}

	public void setVerifyResultCode(String verifyResultCode) {
		this.verifyResultCode = verifyResultCode;
	}
	public String getVerifyResultCode( ) {
		return this.verifyResultCode;
	}

	public void setVerifyResultDesc(String verifyResultDesc) {
		this.verifyResultDesc = verifyResultDesc;
	}
	public String getVerifyResultDesc( ) {
		return this.verifyResultDesc;
	}

}
