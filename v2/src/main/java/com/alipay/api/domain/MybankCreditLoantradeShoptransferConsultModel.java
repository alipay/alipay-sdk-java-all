package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商法店铺升级转让咨询
 *
 * @author auto create
 * @since 1.0, 2019-05-30 10:06:40
 */
public class MybankCreditLoantradeShoptransferConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4635223719914167576L;

	/**
	 * 咨询业务类型,TRANSFER(转让)/RECEIVE(接收)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 接收方支付宝id
	 */
	@ApiField("receive_alipay_id")
	private String receiveAlipayId;

	/**
	 * 淘宝userId
	 */
	@ApiField("taobao_id")
	private String taobaoId;

	/**
	 * 转让流程编号
	 */
	@ApiField("trans_no")
	private String transNo;

	/**
	 * 转让方支付宝id
	 */
	@ApiField("transfer_alipay_id")
	private String transferAlipayId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getReceiveAlipayId() {
		return this.receiveAlipayId;
	}
	public void setReceiveAlipayId(String receiveAlipayId) {
		this.receiveAlipayId = receiveAlipayId;
	}

	public String getTaobaoId() {
		return this.taobaoId;
	}
	public void setTaobaoId(String taobaoId) {
		this.taobaoId = taobaoId;
	}

	public String getTransNo() {
		return this.transNo;
	}
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	public String getTransferAlipayId() {
		return this.transferAlipayId;
	}
	public void setTransferAlipayId(String transferAlipayId) {
		this.transferAlipayId = transferAlipayId;
	}

}
