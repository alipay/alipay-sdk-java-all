package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HonorAlipayAccountModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.userbind.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 15:07:40
 */
public class AlipayPcreditLoanHonorUserbindCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 1548678363417487755L;

	/** 
	 * 准入状态，1-允许绑定，0-拒绝绑定
	 */
	@ApiField("access")
	private Long access;

	/** 
	 * 可用支付宝账号列表
	 */
	@ApiListField("account_list")
	@ApiField("honor_alipay_account_model")
	private List<HonorAlipayAccountModel> accountList;

	/** 
	 * 绑定检查id，准入时有
	 */
	@ApiField("bind_check_serial_no")
	private String bindCheckSerialNo;

	/** 
	 * 准入失败原因码
01：无关联账号
02：实名信息不一致
03：身份信息失效
04：其他原因
	 */
	@ApiField("fail_code")
	private String failCode;

	/** 
	 * 准入失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 准入失败具体原因
	 */
	@ApiField("refuse_msg_data")
	private String refuseMsgData;

	public void setAccess(Long access) {
		this.access = access;
	}
	public Long getAccess( ) {
		return this.access;
	}

	public void setAccountList(List<HonorAlipayAccountModel> accountList) {
		this.accountList = accountList;
	}
	public List<HonorAlipayAccountModel> getAccountList( ) {
		return this.accountList;
	}

	public void setBindCheckSerialNo(String bindCheckSerialNo) {
		this.bindCheckSerialNo = bindCheckSerialNo;
	}
	public String getBindCheckSerialNo( ) {
		return this.bindCheckSerialNo;
	}

	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}
	public String getFailCode( ) {
		return this.failCode;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setRefuseMsgData(String refuseMsgData) {
		this.refuseMsgData = refuseMsgData;
	}
	public String getRefuseMsgData( ) {
		return this.refuseMsgData;
	}

}
