package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保函还原申请
 *
 * @author auto create
 * @since 1.0, 2022-09-19 15:23:20
 */
public class MybankCreditLoantradeGuarletterRestoreApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1222463453769936883L;

	/**
	 * 受益人信息
	 */
	@ApiField("beneficiary_user_info")
	private EnterpriseCustomerInfoVO beneficiaryUserInfo;

	/**
	 * 标的详情
	 */
	@ApiField("bid_detail")
	private BidDetailVO bidDetail;

	/**
	 * 加密字段解密秘钥
	 */
	@ApiField("decrypt_key")
	private String decryptKey;

	/**
	 * 担保订单号
	 */
	@ApiField("guar_letter_order_no")
	private String guarLetterOrderNo;

	/**
	 * 请求单号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 方案合约号
	 */
	@ApiField("scheme_ar_no")
	private String schemeArNo;

	public EnterpriseCustomerInfoVO getBeneficiaryUserInfo() {
		return this.beneficiaryUserInfo;
	}
	public void setBeneficiaryUserInfo(EnterpriseCustomerInfoVO beneficiaryUserInfo) {
		this.beneficiaryUserInfo = beneficiaryUserInfo;
	}

	public BidDetailVO getBidDetail() {
		return this.bidDetail;
	}
	public void setBidDetail(BidDetailVO bidDetail) {
		this.bidDetail = bidDetail;
	}

	public String getDecryptKey() {
		return this.decryptKey;
	}
	public void setDecryptKey(String decryptKey) {
		this.decryptKey = decryptKey;
	}

	public String getGuarLetterOrderNo() {
		return this.guarLetterOrderNo;
	}
	public void setGuarLetterOrderNo(String guarLetterOrderNo) {
		this.guarLetterOrderNo = guarLetterOrderNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSchemeArNo() {
		return this.schemeArNo;
	}
	public void setSchemeArNo(String schemeArNo) {
		this.schemeArNo = schemeArNo;
	}

}
