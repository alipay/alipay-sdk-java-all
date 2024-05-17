package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销工具
 *
 * @author auto create
 * @since 1.0, 2018-01-22 17:07:18
 */
public class InteligentPromoTool extends AlipayObject {

	private static final long serialVersionUID = 3556949683582779289L;

	/**
	 * 奖品发放的规则
	 */
	@ApiField("inteligent_send_rule")
	private InteligentSendRule inteligentSendRule;

	/**
	 * 券对象，当活动类型为POINT_SEND时为null，其他活动类型此字段必填
	 */
	@ApiField("inteligent_voucher")
	private InteligentVoucher inteligentVoucher;

	/**
	 * 单个营销工具的生效状态，当在招商部分券失效后会使用这个字段
	 */
	@ApiField("status")
	private String status;

	/**
	 * 营销工具uid,创建营销活动时无需设置
	 */
	@ApiField("voucher_no")
	private String voucherNo;

	public InteligentSendRule getInteligentSendRule() {
		return this.inteligentSendRule;
	}
	public void setInteligentSendRule(InteligentSendRule inteligentSendRule) {
		this.inteligentSendRule = inteligentSendRule;
	}

	public InteligentVoucher getInteligentVoucher() {
		return this.inteligentVoucher;
	}
	public void setInteligentVoucher(InteligentVoucher inteligentVoucher) {
		this.inteligentVoucher = inteligentVoucher;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVoucherNo() {
		return this.voucherNo;
	}
	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

}
