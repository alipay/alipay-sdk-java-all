package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.flow.commission.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:06
 */
public class AlipayCommerceAcommunicationFlowCommissionSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5642965472136847283L;

	/** 
	 * SUCCESS:成功
FAIL:失败
EFFECT:已启用
INVALID:立即结束
AUDITING:提交审核
REFUSED:审核驳回
APPROVED:审核通过
NONE:未配置
CLOSE:关闭
DISABLE:失效
	 */
	@ApiField("commission_state")
	private String commissionState;

	/** 
	 * 支付宝与机构之间的商品id映射码，需要包含关键信息：省份-运营商-面额
	 */
	@ApiField("item_code")
	private String itemCode;

	public void setCommissionState(String commissionState) {
		this.commissionState = commissionState;
	}
	public String getCommissionState( ) {
		return this.commissionState;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemCode( ) {
		return this.itemCode;
	}

}
