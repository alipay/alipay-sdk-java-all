package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.lendadmit.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 17:12:40
 */
public class AlipayPcreditLoanHonorLendadmitConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2326278425257127325L;

	/** 
	 * 不需要核身，true-跳过核身，false-需要核身 （用于dev mock）
	 */
	@ApiField("exempt_verify")
	private Boolean exemptVerify;

	/** 
	 * 拒绝原因码（包含风控拒绝），status=1时必传
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 拒绝原因说明, status=1时必传
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/** 
	 * 拒绝具体原因说明, status=1时必传
	 */
	@ApiField("refuse_msg_data")
	private String refuseMsgData;

	/** 
	 * 鉴权状态，枚举值：
1-拒绝，
2-通过
	 */
	@ApiField("status")
	private Long status;

	/** 
	 * 核身方式，支用准入后必传，默认返回FACE_CHECK，渠道侧拉起支付宝核身，核身verifyId有效期半小时
	 */
	@ApiListField("verify_list")
	@ApiField("string")
	private List<String> verifyList;

	/** 
	 * 核身url，支用准入必传，访问此URL进行H5核身
	 */
	@ApiField("verify_url")
	private String verifyUrl;

	public void setExemptVerify(Boolean exemptVerify) {
		this.exemptVerify = exemptVerify;
	}
	public Boolean getExemptVerify( ) {
		return this.exemptVerify;
	}

	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}
	public String getRefuseCode( ) {
		return this.refuseCode;
	}

	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public String getRefuseMsg( ) {
		return this.refuseMsg;
	}

	public void setRefuseMsgData(String refuseMsgData) {
		this.refuseMsgData = refuseMsgData;
	}
	public String getRefuseMsgData( ) {
		return this.refuseMsgData;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

	public void setVerifyList(List<String> verifyList) {
		this.verifyList = verifyList;
	}
	public List<String> getVerifyList( ) {
		return this.verifyList;
	}

	public void setVerifyUrl(String verifyUrl) {
		this.verifyUrl = verifyUrl;
	}
	public String getVerifyUrl( ) {
		return this.verifyUrl;
	}

}
