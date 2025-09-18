package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * trusple外贸贷借款场景数据推送服务接口
 *
 * @author auto create
 * @since 1.0, 2023-03-27 10:42:57
 */
public class AnttechBlockchainFinanceTruspleLoanscenedatapushSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5864836356847561239L;

	/**
	 * 人民币:CNY
美元:USD
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 借款金额
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/**
	 * 外部机构的会员Id，用于在Trusple侧进行登录
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 附言备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部业务id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 收款人账户
	 */
	@ApiField("receiver_account_no")
	private String receiverAccountNo;

	/**
	 * 开户行银行编码
示例:
      中国银行:BKCHCNBJ,
      中国工商银行:ICBKCNBJ,
      中国农业银行:ABOCCNBJ,
      中国建设银行:PCBCCNBJ,
      中国交通银行:COMMCNSH,
      邮储银行:PSBCCNBJ,
      兴业银行:FJIBCNBA,
      招商银行:CMBCCNBS,
      平安银行:SZDBCNBS,
      上海浦东发展银行:SPDBCNSH,
      中信银行:CIBKCNBJ,
      民生银行:MSBCCNBJ,
      华夏银行:HXBKCNBJ,
      上海银行:BOSHCNSH,
      北京银行:BJCNCNBJ,
      宁波银行:BKNBCN2N,
      中国光大银行:EVERCNBJ,
      徽商银行:HFCBCNSH,
      浙商银行:ZJCBCN2N,
      广发银行:GDBKCN22,
      渤海银行:CHBHCNBT,
      汇丰银行(中国):HSBCCNSH
	 */
	@ApiField("receiver_bank_code")
	private String receiverBankCode;

	/**
	 * 收款人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 幂等id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getReceiverAccountNo() {
		return this.receiverAccountNo;
	}
	public void setReceiverAccountNo(String receiverAccountNo) {
		this.receiverAccountNo = receiverAccountNo;
	}

	public String getReceiverBankCode() {
		return this.receiverBankCode;
	}
	public void setReceiverBankCode(String receiverBankCode) {
		this.receiverBankCode = receiverBankCode;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
