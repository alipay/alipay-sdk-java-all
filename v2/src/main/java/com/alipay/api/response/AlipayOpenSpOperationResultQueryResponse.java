package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.operation.result.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-14 14:06:44
 */
public class AlipayOpenSpOperationResultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6712945761886786172L;

	/** 
	 * 商户支付宝pid。仅间连场景，且存在绑定关系时返回值。
	 */
	@ApiField("bind_user_id")
	private String bindUserId;

	/** 
	 * 代运营操作结果。
SUCCESS：代表成功。
PROCESS：待商家确认中。
NO_PERMISSION：表示当前商家支付宝账号无权限操作。需要提醒商家切换成发起授权时指定的支付宝账号。
NONE：表示不存在代运营绑定或授权关系。
NONE_ACCOUNT：间连商家推荐支付宝账号列表为空。
	 */
	@ApiField("handle_status")
	private String handleStatus;

	/** 
	 * 支付宝商户号。间连场景为商户smid，直连场景为商户支付宝pid
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	public void setBindUserId(String bindUserId) {
		this.bindUserId = bindUserId;
	}
	public String getBindUserId( ) {
		return this.bindUserId;
	}

	public void setHandleStatus(String handleStatus) {
		this.handleStatus = handleStatus;
	}
	public String getHandleStatus( ) {
		return this.handleStatus;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getMerchantNo( ) {
		return this.merchantNo;
	}

}
