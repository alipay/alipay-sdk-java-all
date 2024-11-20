package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资方批次转账结果同步
 *
 * @author auto create
 * @since 1.0, 2024-05-31 15:13:20
 */
public class AlipayCommerceEcCreditWithdrawDisburseModel extends AlipayObject {

	private static final long serialVersionUID = 1561624744645797824L;

	/**
	 * 关联的取款申请明细列表
	 */
	@ApiListField("credit_withdraw_apply_info_list")
	@ApiField("credit_withdraw_apply_info")
	private List<CreditWithdrawApplyInfo> creditWithdrawApplyInfoList;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 转账金额，单位元，精度分
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 资方转账唯一流水号
	 */
	@ApiField("trans_serial_no")
	private String transSerialNo;

	/**
	 * 到账时间
	 */
	@ApiField("trans_time")
	private Date transTime;

	public List<CreditWithdrawApplyInfo> getCreditWithdrawApplyInfoList() {
		return this.creditWithdrawApplyInfoList;
	}
	public void setCreditWithdrawApplyInfoList(List<CreditWithdrawApplyInfo> creditWithdrawApplyInfoList) {
		this.creditWithdrawApplyInfoList = creditWithdrawApplyInfoList;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransSerialNo() {
		return this.transSerialNo;
	}
	public void setTransSerialNo(String transSerialNo) {
		this.transSerialNo = transSerialNo;
	}

	public Date getTransTime() {
		return this.transTime;
	}
	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

}
