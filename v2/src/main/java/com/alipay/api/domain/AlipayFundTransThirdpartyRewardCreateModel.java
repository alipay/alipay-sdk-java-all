package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商户可通过此接口创建支付宝用户的打赏订单，而后通过支付宝快捷支付对此订单进行支付完成打赏。（不支持企业用户）
 *
 * @author auto create
 * @since 1.0, 2022-12-08 16:42:52
 */
public class AlipayFundTransThirdpartyRewardCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6688467626372847962L;

	/**
	 * 打赏金额，单位：人民币分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 扩展参数，json格式
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 外部业务号，用于幂等控制
	 */
	@ApiField("out_no")
	private String outNo;

	/**
	 * 收款用户的支付宝userId
	 */
	@ApiField("receiver_user_id")
	private String receiverUserId;

	/**
	 * 场景码，需业务方分配方可使用
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 付款用户的支付宝userId
	 */
	@ApiField("sender_user_id")
	private String senderUserId;

	/**
	 * 打赏的标题（理由）
	 */
	@ApiField("title")
	private String title;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getOutNo() {
		return this.outNo;
	}
	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	public String getReceiverUserId() {
		return this.receiverUserId;
	}
	public void setReceiverUserId(String receiverUserId) {
		this.receiverUserId = receiverUserId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSenderUserId() {
		return this.senderUserId;
	}
	public void setSenderUserId(String senderUserId) {
		this.senderUserId = senderUserId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
