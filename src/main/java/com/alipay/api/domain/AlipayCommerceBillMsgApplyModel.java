package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单消息接口
 *
 * @author auto create
 * @since 1.0, 2022-03-02 11:39:18
 */
public class AlipayCommerceBillMsgApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6774124174386911488L;

	/**
	 * 支付宝userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 消费金融机构在支付宝的唯一标识，接入前进行分配
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 消息内容
	 */
	@ApiField("msg_params")
	private MsgParams msgParams;

	/**
	 * T-0 （还款日当天）T+1 （逾期1天）T+7 （逾期7天）T+14 （逾期14天）T+30 （逾期30天）
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public MsgParams getMsgParams() {
		return this.msgParams;
	}
	public void setMsgParams(MsgParams msgParams) {
		this.msgParams = msgParams;
	}

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
